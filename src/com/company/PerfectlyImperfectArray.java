package com.company;

import java.util.Scanner;

public class PerfectlyImperfectArray {

    // problem from http://codeforces.com/problemset/problem/1514/A
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {

            int n = scanner.nextInt();
            boolean isNotPerfect = false;
            for (int j = 0; j < n; j++) {
                int num = scanner.nextInt();
                if (!checkPerfectSquare(num)) {
                    isNotPerfect = true;
                }
            }
            System.out.println((isNotPerfect ? "YES" : "NO"));

        }
    }

    static boolean checkPerfectSquare(double x) {

        // finding the square root of given number
        double sq = Math.sqrt(x);

        /* Math.floor() returns closest integer value, for
         * example Math.floor of 984.1 is 984, so if the value
         * of sq is non integer than the below expression would
         * be non-zero.
         */
        return ((sq - Math.floor(sq)) == 0);
    }
}
