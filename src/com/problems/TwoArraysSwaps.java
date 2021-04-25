package com.problems;

import java.util.Arrays;
import java.util.Scanner;

public class TwoArraysSwaps {

    // problem from http://codeforces.com/problemset/problem/1353/B
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {

            int n = scanner.nextInt(), k = scanner.nextInt();
            int lastIndex = n - 1;
            int firstIndex = 0, sum = 0;
            int firstArr[] = new int[n];
            int secondArr[] = new int[n];
            for (int j = 0; j < n; j++) {
                firstArr[j] = scanner.nextInt();
            }
            for (int j = 0; j < n; j++) {
                secondArr[j] = scanner.nextInt();
            }

            Arrays.sort(firstArr);
            Arrays.sort(secondArr);

            for (int j = 0; j < k; j++) {
                if (secondArr[lastIndex] > firstArr[firstIndex]) {
                    firstArr[firstIndex] = secondArr[lastIndex];
                    lastIndex--;
                    firstIndex++;
                }
            }
            for (int j = 0; j < n; j++) {
                sum = sum + firstArr[j];
            }
            System.out.println(sum);
        }
    }
}
