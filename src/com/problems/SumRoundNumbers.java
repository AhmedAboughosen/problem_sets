package com.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumRoundNumbers {
    // problem from http://codeforces.com/contest/1352/problem/A

    public static void main(String[] args) {
        // write your code here

        Scanner in = new Scanner((System.in));

        int t = in.nextInt();

        List<String> list = new ArrayList<>();
        for (int i = 0; i < t; i++) {

            int n = in.nextInt();
            String value = n + "";

            for (int j = 0; j < value.length(); j++) {

                int v = Integer.parseInt(value.charAt(j) + "");
                if (v != 0) {
                    int size = (value.length() - j) - 1;
                    list.add(value.charAt(j) + "" + getZeros(size));
                }
            }

            System.out.println(list.size());

            for (String s : list) {
                System.out.print(s + " ");
            }
            System.out.println();
            list.clear();
        }

    }


    public static String getZeros(int n) {

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < n; i++) {
            str.append(0);
        }

        return str.toString();
    }
}
