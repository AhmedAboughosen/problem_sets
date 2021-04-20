package com.company;

import java.util.Scanner;

public class AlmostRectangle {

    // problem from http://codeforces.com/problemset/problem/1512/B
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {

            int n = scanner.nextInt();
            char arr[][] = new char[n][n];
            int firstRow = -1, firstColumn = -1;
            int secondRow = -1, secondColumn = -1;
            for (int j = 0; j < n; j++) {
                String num = scanner.next();
                for (int k = 0; k < n; k++) {
                    arr[j][k] = num.charAt(k);

                    if (arr[j][k] == '*') {
                        if (firstRow == -1) {
                            firstRow = j;
                            firstColumn = k;
                        } else {
                            secondRow = j;
                            secondColumn = k;
                        }
                    }
                }

            }

            if (firstRow == secondRow) {

                if (firstRow == 0) {
                    setValue(arr, firstRow + 1, firstColumn, secondRow + 1, secondColumn, n);
                    continue;
                }

                if (firstRow == n - 1) {
                    setValue(arr, firstRow - 1, firstColumn, secondRow - 1, secondColumn, n);
                    continue;
                }
                setValue(arr, firstRow + 1, firstColumn, secondRow + 1, secondColumn, n);
                continue;


            }

            if (secondColumn == firstColumn) {

                if (firstColumn == 0) {
                    setValue(arr, firstRow, firstColumn + 1, secondRow, secondColumn + 1, n);
                    continue;
                }

                if (firstColumn == n - 1) {
                    setValue(arr, firstRow, firstColumn - 1, secondRow, secondColumn - 1, n);
                    continue;
                }
                setValue(arr, firstRow, firstColumn + 1, secondRow, secondColumn + 1, n);
                continue;

            }

            arr[firstRow][secondColumn] = '*';
            arr[secondRow][firstColumn] = '*';


            printList(arr, n);
        }

    }


    static void setValue(char[][] arr, int firstRow, int firstColumn, int secondRow, int secondColumn, int n) {
        arr[firstRow][firstColumn] = '*';
        arr[secondRow][secondColumn] = '*';
        printList(arr, n);

    }

    static void printList(char[][] arr, int n) {
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                System.out.print(arr[j][k]);
            }
            System.out.println();
        }
    }
}
