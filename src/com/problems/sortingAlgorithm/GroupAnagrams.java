package src.com.problems.sortingAlgorithm;

import java.util.*;

public class GroupAnagrams {


    public static void main(String[] args) {

        groupAnagrams(new String[]{"ac","c"});
    }


    public static List<List<String>> groupAnagrams(String[] strs) {


        Arrays.sort(strs);

        HashMap<HashMap<Character, Integer>, List<String>> map = new HashMap<>();
        HashMap<Character, Integer> charList = new HashMap<>();
        List<String> stringList = new ArrayList<>();

        for (int i = 0; i < strs[0].length(); i++) {
            charList.put(strs[0].charAt(i), 1);
        }
        stringList.add(strs[0]);

        map.put(charList, stringList);

        for (int i = 1; i < strs.length; i++) {
            boolean has = true;
            for (Map.Entry<HashMap<Character, Integer>, List<String>> entry : map.entrySet()) {
                has = true;

                if(strs[i].length() != entry.getKey().size()){
                    has = false;
                    continue;
                }

                for (int k = 0; k < strs[i].length(); k++) {
                    if (!(entry.getKey().containsKey(strs[i].charAt(k)))) {
                        has = false;
                        break;
                    }
                }

                if (has) {
                    entry.getValue().add(strs[i]);
                    break;
                }
            }

            if (has) continue;

            stringList = new ArrayList<>();
            charList = new HashMap<>();

            for (int j = 0; j < strs[i].length(); j++) {
                charList.put(strs[i].charAt(j), 1);
            }

            stringList.add(strs[i]);

            map.put(charList, stringList);

        }

        List<List<String>> list = new ArrayList<>();


        for (Map.Entry<HashMap<Character, Integer>, List<String>> entry : map.entrySet()) {

            list.add(entry.getValue());
        }

        return list;
    }

}
