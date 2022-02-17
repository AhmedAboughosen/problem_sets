package com.problems;

import java.util.HashMap;
import java.util.Scanner;

public class NotShading {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(), m = scanner.nextInt(), r = scanner.nextInt(), c = scanner.nextInt();
            HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();

            String outPut = "";
            boolean isContainsBlack = false;
            for (int j = 0; j < n; j++) {
                String str = scanner.next();
                map.put(j + 1, getMap(str));
            }


            if (map.get(r).containsKey(c)) {
                System.out.println("0");
                continue;
            }

            if (map.get(r).size() >= 1) {
                System.out.println("1");
                continue;
            }

            for (Integer name : map.keySet()) {
                if(map.get(name).size() >= 1){
                    isContainsBlack = true;
                }

                if (map.get(name).containsKey(c)) {
                    outPut = "1";
                    break;
                }
            }

            if (!outPut.equals("")) {
                System.out.println(outPut);
                continue;
            }


            System.out.println(isContainsBlack ? "2" : "-1");

        }
    }


    static HashMap<Integer, Integer> getMap(String str) {


        HashMap<Integer, Integer> map = new HashMap<>();

        for (int k = 0; k < str.length(); k++) {
            if (str.charAt(k) == 'B') map.put(k + 1, 1);
        }

        return map;
    }
}
