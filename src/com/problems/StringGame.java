package src.com.problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class StringGame {

    private static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        boolean hasNext() {
            return st.hasMoreTokens();
        }

        char[] readCharArray(int n) {
            char[] arr = new char[n];
            try {
                br.read(arr);
                br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return arr;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        long[] readLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = nextLong();
            return a;
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }


    public static void main(String[] args) {


        FastScanner fastScanner = new FastScanner();

        String firstStr = fastScanner.next();
        String secondStr = fastScanner.next();

        int[] arrList = new int[firstStr.length()];
        HashMap<Integer, Integer> possibilitiesMapList = new HashMap<>();
        HashMap<Character, List<Integer>> charMap = new HashMap<>();

        int index = secondStr.length() - 1;
        for (int i = firstStr.length() - 1; i >= 0; i--) {

            if ((index) == 0 && secondStr.charAt(index) == firstStr.charAt(i)) {
                possibilitiesMapList.put(i + 1, i + 1);
            } else if (secondStr.charAt(index) == firstStr.charAt(i)) {
                --index;
            }
        }

        for (int i = 0; i < arrList.length; i++) {
            arrList[i] = fastScanner.nextInt();
        }

        int neededIndex = 0;

        for (int i = arrList.length - 1; i >= 0; i--) {

            if (possibilitiesMapList.containsKey(arrList[i])) {

                int after = arrList[i];
                int val = -1;

                for (int j = 1; j < secondStr.length(); j++) {

                    if (charMap.containsKey(secondStr.charAt(j))) {
                        Collections.sort(charMap.get(secondStr.charAt(j)));
                         val = binarySearch(charMap.get(secondStr.charAt(j)), 0, charMap.get(secondStr.charAt(j)).size(), after,-1);

                        if (val == -1) {
                            break;
                        }
                        after = val;
                    }

                }

                if(val != -1){
                    neededIndex = i;
                    break;
                }

                if (charMap.containsKey(firstStr.charAt(arrList[i] - 1))) {
                    List<Integer> list = charMap.get(firstStr.charAt(arrList[i] - 1));
                    list.add(arrList[i]);
                    charMap.put(firstStr.charAt(arrList[i] - 1), list);
                    continue;
                }

                List<Integer> list = new ArrayList<>();
                list.add(arrList[i]);

                charMap.put(firstStr.charAt(arrList[i] - 1), list);
                continue;
            }


            if (charMap.containsKey(firstStr.charAt(arrList[i] - 1))) {
                List<Integer> list = charMap.get(firstStr.charAt(arrList[i] - 1));
                list.add(arrList[i]);
                charMap.put(firstStr.charAt(arrList[i] - 1), list);
                continue;
            }

            List<Integer> list = new ArrayList<>();
            list.add(arrList[i]);

            charMap.put(firstStr.charAt(arrList[i] - 1), list);
        }

        System.out.println(neededIndex);

    }


    static int binarySearch(List<Integer> list, int l, int r, int x,int lastVal) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            if(mid >= list.size() ){
                return -1;
            }

            if (list.get(mid) == x) {
                return binarySearch(list, mid + 1, r, x,lastVal);
            }

            if (list.get(mid) > x) {
                return binarySearch(list, l, mid - 1, x,list.get(mid));
            }

            return lastVal;
        }

        return lastVal;
    }
}
