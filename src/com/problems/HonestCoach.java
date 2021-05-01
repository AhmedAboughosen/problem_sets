package com.problems;

import java.util.Arrays;
import java.util.Scanner;

public class HonestCoach {

    // problem from http://codeforces.com/problemset/problem/1360/B

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int min = Integer.MAX_VALUE;

            int n = scanner.nextInt();
            int arr[] = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }

            Arrays.sort(arr);

            for (int j = 0; j < n - 1; j++) {
                int abs = Math.abs((arr[j] - arr[j + 1]));
                if (abs < min) {
                    min = abs;
                }
            }
            System.out.println(min);
        }
    }
}
