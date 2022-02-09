package com.problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Groups {

    //problem from https://codeforces.com/problemset/problem/1598/B
    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextString() {
            return ("" + next());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {

            int n = scanner.nextInt();

            boolean isEqual = false;
            HashMap<Integer, List<Integer>> listHashMap = new HashMap<>();

            List<Integer> list = new ArrayList<>();
            listHashMap.put(1, new ArrayList<>());
            listHashMap.put(2, new ArrayList<>());
            listHashMap.put(3, new ArrayList<>());
            listHashMap.put(4, new ArrayList<>());
            listHashMap.put(5, new ArrayList<>());

            for (int j = 0; j < n; j++) {

                for (int k = 0; k < 5; k++) {
                    int number = scanner.nextInt();
                    if (number == 1) {
                        listHashMap.get(k + 1).add(j + 1);
                        listHashMap.put(k + 1, listHashMap.get(k + 1));
                    }
                }
            }

            listHashMap.entrySet().forEach(entry -> {
                if (entry.getValue().size() >= (n / 2)) {
                    list.add(entry.getKey());
                }
            });


            for (int j = 0; j < list.size(); j++) {


                for (int k = j + 1; k < list.size(); k++) {
                    int firstDayIndex = list.get(j);
                    int secondDayIndex = list.get(k);

                    HashMap<Integer, Integer> days = new HashMap<>();

                    List<Integer> listOfFirstDays = listHashMap.get(firstDayIndex);
                    List<Integer> listOfSecondDays = listHashMap.get(secondDayIndex);

                    for (int z = 0; z < listOfFirstDays.size(); z++) {
                        days.put(listOfFirstDays.get(z), 1);
                    }

                    for (int z = 0; z < listOfSecondDays.size(); z++) {
                        days.put(listOfSecondDays.get(z), 1);
                    }

                    if (days.size() == n) {
                        isEqual = true;
                        break;
                    }
                }

                if(isEqual) break;
            }


            System.out.println((isEqual ? "YES" : "NO"));
        }
    }
}
