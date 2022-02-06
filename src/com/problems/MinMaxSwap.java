package com.problems;

import java.util.Scanner;

public class MinMaxSwap {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int maxInFirst = Integer.MIN_VALUE, firstIndex = 0;
            int maxInSecond = Integer.MIN_VALUE, secondIndex = 0;
            int[] arrayFirst = new int[n];
            int[] arraySecond = new int[n];
            int upperBound = Integer.MIN_VALUE;
            for (int j = 0; j < n; j++) {
                arrayFirst[j] = scanner.nextInt();
                if (arrayFirst[j] >= maxInFirst) {
                    firstIndex = j;
                    maxInFirst = arrayFirst[j];
                }
            }

            for (int j = 0; j < n; j++) {
                arraySecond[j] = scanner.nextInt();
                if (arraySecond[j] >= maxInSecond) {
                    secondIndex = j;
                    maxInSecond = arraySecond[j];
                }
            }


            for (int j = 0; j < n; j++) {

                int min = Integer.min(arraySecond[j], arrayFirst[j]);
                if (maxInFirst >= maxInSecond) {
                    if (firstIndex == j) {
                        upperBound = Integer.max(arraySecond[j], upperBound);
                        continue;
                    }
                    upperBound = Integer.max(min, upperBound);
                } else {
                    if (secondIndex == j) {
                        upperBound = Integer.max(arrayFirst[j], upperBound);
                        continue;
                    }
                    upperBound = Integer.max(min, upperBound);

                }

            }

            System.out.println((maxInFirst >= maxInSecond) ? maxInFirst * upperBound : maxInSecond * upperBound);

        }
    }
}
