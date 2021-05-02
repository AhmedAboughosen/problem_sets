package com.problems;

import java.util.Scanner;

public class TheCakeIsLie {

    // problem from http://codeforces.com/problemset/problem/1519/B
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(), m = scanner.nextInt(), k = scanner.nextInt();
            int v1 = (n - 1);
            int v2 = ((m - 1)) * n;

            if ((v1) + (v2) == k) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
