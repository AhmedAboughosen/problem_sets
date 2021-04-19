package com.company;

import java.util.Scanner;

public class SpyDetected {


    // problem from http://codeforces.com/problemset/problem/1512/A
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int printedNumber = 1;
            int firstNum = scanner.nextInt();
            int secondNum = scanner.nextInt();
            int thirdNum = scanner.nextInt();
            boolean re = false;
            if (firstNum == secondNum) {
                re = true;
                if (thirdNum != firstNum) {
                    printedNumber = 3;
                }

            } else {
                if (thirdNum == firstNum) {
                    printedNumber = 2;
                } else {
                    printedNumber = 1;
                }
            }


            for (int j = 3; j < n; j++) {
                int number = scanner.nextInt();

                if (re && number != firstNum) {
                    printedNumber = j + 1;
                }

            }

            System.out.println(printedNumber);

        }
    }
}
