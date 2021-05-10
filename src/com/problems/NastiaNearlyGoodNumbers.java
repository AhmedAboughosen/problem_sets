package com.problems;

import java.util.Scanner;

public class NastiaNearlyGoodNumbers {


    // problem from https://codeforces.com/contest/1521/problem/A
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            long A = scanner.nextLong();
            long B = scanner.nextLong();

            if (B == 1) {
                System.out.println("NO");
                continue;
            }
            System.out.println("YES");
            System.out.println(A + " " + ((A * B)) + " " + (A * (B + 1)));
        }
    }
}
