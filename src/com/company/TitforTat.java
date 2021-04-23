package com.company;

import java.util.Scanner;

public class TitforTat {

    // problem from http://codeforces.com/problemset/problem/1516/A
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {

            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int arr[] = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }


            int currentIndex = 0;
            while (k != 0) {
                int lastIndex = arr[arr.length - 1];

                if (!(currentIndex < arr.length - 1)) {
                    break;
                }

                if (arr[currentIndex] != 0) {
                    arr[arr.length - 1] = ++arr[arr.length - 1];
                    arr[currentIndex] = --arr[currentIndex];
                    --k;
                } else {
                    currentIndex++;
                }
            }

            for (int j = 0; j < n; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }

    }
}
