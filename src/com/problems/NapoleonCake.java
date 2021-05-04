package com.problems;

import java.util.Scanner;

public class NapoleonCake {

    // problem from http://codeforces.com/problemset/problem/1501/B
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int max = 0;
            int arr[] = new int[n];
            int outPutArray[] = new int[n];


            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
                outPutArray[j] = 1;
            }

            for (int j = n - 1; j >= 0; j--) {
                if (arr[j] != 0 && arr[j] >= max) {
                    max = arr[j] - 1;
                } else {
                    if (max == 0) {
                        outPutArray[j] = 0;
                    } else {
                        --max;
                    }
                }
            }
            for (int j = 0; j < n; j++) {
                System.out.print(outPutArray[j]+" ");
            }
            System.out.println();

        }
    }
}
