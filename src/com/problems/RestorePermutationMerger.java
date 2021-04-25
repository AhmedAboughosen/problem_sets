package com.problems;


import java.util.HashMap;
import java.util.Scanner;

public class RestorePermutationMerger {

    // problem from http://codeforces.com/contest/1385/problem/B
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();


        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();

            HashMap<Integer, Integer> map = new HashMap();


            for (int j = 0; j < (2 * n); j++) {
                int num = scanner.nextInt();

                if (!map.containsKey(num)) {
                    map.put(num, num);
                    System.out.print(num + " ");
                }
            }

            System.out.println();

        }
    }
}