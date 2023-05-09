package src.com.problems.sortingAlgorithm;

import java.util.*;

public class ReorganizeString {


    public static void main(String[] args) {



        System.out.println(reorganizeString("aabbcc"));

    }


    public static String reorganizeString(String s) {


        Map<Character, Integer> mapList = new HashMap<>();

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            mapList.put(chars[(i)], mapList.containsKey(chars[(i)]) ? mapList.get(chars[(i)]) + 1 : 1);
        }

        mapList = sortByComparator(mapList , false);

        StringBuilder res = new StringBuilder();

        //constant max 23
        for (Character val : mapList.keySet()) {
            Character key = val;
            Integer value = mapList.get(val);


            if (value <= 0) continue;


            //n
            for (int i = 0; i < value; i++) {

                Character differChar = ' ';

                boolean isSame = false;
                if(res.length() >= 1 && key == res.charAt(res.length() - 1)){
                    isSame = true;
                }else {
                    res.append(key);
                    mapList.put(key, mapList.get(key) - 1);
                }


                //constant max 23
                for (Character innerval : mapList.keySet()) {
                    Character k = innerval;
                    Integer v = mapList.get(innerval);

                    if (key != k && v >= 1) {
                        differChar = k;
                        break;
                    }
                }

                if (differChar == ' ') {

                    boolean isFind = false;
                    if(isSame){
                        for (int j = 0; j < res.length() - 1; j++) {
                            if(res.charAt(j) != key && res.charAt(j+1) != key){
                                res.insert(j+1,key);
                                isFind = true;
                                break;
                            }
                        }

                        if (!isFind) return "";
                    }

                    continue;
                }

                res.append(differChar);
                mapList.put(differChar, mapList.get(differChar) - 1);

                if(isSame){
                    res.append(key);
                    mapList.put(key, mapList.get(key) - 1);
                }

            }

            if (res.length() >= 2 && res.charAt(res.length() - 1) == res.charAt(res.length() - 2)){
                return "";
            }


        }

        return res.toString();
    }


    private static Map<Character, Integer> sortByComparator(Map<Character, Integer> unsortMap, final boolean order)
    {

        List<Map.Entry<Character, Integer>> list = new LinkedList<Map.Entry<Character, Integer>>(unsortMap.entrySet());

        // Sorting the list based on values
        Collections.sort(list, (o1, o2) -> {
            if (order)
            {
                return o1.getValue().compareTo(o2.getValue());
            }
            else
            {
                return o2.getValue().compareTo(o1.getValue());

            }
        });

        // Maintaining insertion order with the help of LinkedList
        Map<Character, Integer> sortedMap = new LinkedHashMap<Character, Integer>();
        for (Map.Entry<Character, Integer> entry : list)
        {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }

}
