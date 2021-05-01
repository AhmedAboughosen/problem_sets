package com.problems;

import java.util.Scanner;

public class RedBlueBeans {

    // problem from http://codeforces.com/problemset/problem/1519/A
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            long r = scanner.nextLong(), b = scanner.nextLong(), d = scanner.nextLong();

            System.out.println( (Math.min(r, b) * (d + 1) >= Math.max(r, b)) ?  "YES" : "NO");
        }
    }
}
