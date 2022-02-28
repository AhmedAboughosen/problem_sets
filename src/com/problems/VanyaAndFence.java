package com.problems;

import java.util.Scanner;

public class VanyaAndFence {

    // problem from https://codeforces.com/contest/677/problem/A
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < a; ++i) {

            int height = scanner.nextInt();
            if (height <= b) ++count;
           else   count = count + 2;
        }

        System.out.println(count);
    }
}
