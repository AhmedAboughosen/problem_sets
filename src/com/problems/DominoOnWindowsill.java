package com.problems;

import java.util.Scanner;

public class DominoOnWindowsill {


    // problem from http://codeforces.com/problemset/problem/1499/A
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(), k1 = scanner.nextInt(), k2 = scanner.nextInt();
            int w = scanner.nextInt(), b = scanner.nextInt();

            int min = Math.min(k1, k2);
            int max = Math.max(k1, k2);

            int numberOfWhiteVertically = min;
            int numberOfCellsHorizontally = (max - min) == 0 ? 0 : (max - min) / 2;
            int numberOfBlackVertically = n - max;
            int numberOfWhite = numberOfWhiteVertically + numberOfCellsHorizontally;
            int numberOfBlack = numberOfBlackVertically + numberOfCellsHorizontally;
            if (numberOfWhite >= w && numberOfBlack >= b) {
                if ((numberOfWhiteVertically + numberOfBlackVertically + (numberOfCellsHorizontally * 2)) >= w + b) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }
        }
    }
}
