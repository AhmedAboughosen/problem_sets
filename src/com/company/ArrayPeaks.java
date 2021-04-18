package com.company;

import java.util.Scanner;

public class ArrayPeaks {

    //Problem from http://codeforces.com/problemset/problem/1513/A

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int lengthArray = scanner.nextInt();
            int numberPeaks = scanner.nextInt();
            int last = 0;
            int statValue = 2, sign = 1;

            int tempLengthArray = Math.floorMod(lengthArray, 2) == 0 ? lengthArray : lengthArray + 1;

            if ((tempLengthArray / 2) > numberPeaks) {

                System.out.print(1);
                for (int j = 0; j < numberPeaks*2; j++) {
                    last = (statValue + sign);
                    System.out.print(" " + last);
                    sign = sign == 1 ? -1 : 1;
                    ++statValue;
                }

                for (int j = last+2; j <= lengthArray; j++) {
                    System.out.print(" " + (j));
                }

            } else {
                System.out.print("-1");
            }

            System.out.println();
        }
    }
}
