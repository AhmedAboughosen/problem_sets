package com.problems.greedyAlgorithm;

import java.util.Scanner;

public class MoneyChange {


    /**
     * Money Change Problem
     * Compute the minimum number of coins needed
     * to change the given value into coins with denominations 1, 5, and 10.
     * @param args
     */
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = 0;
        if (n >= 10) {
            sum = n / 10;
            n = Math.floorMod(n, 10);
        }

        if (n >= 5 && n < 10) {
            sum += (n / 5);
            n = Math.floorMod(n, 5);
        }


        System.out.println(sum + n);
    }

}
