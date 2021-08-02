package com.problems;

import java.util.Scanner;

public class LastDigitSumFibonacciNumbers {

    private static final int PISANO_PERIOD_MOD10 = 60;

    public static long computeFibonacciNumbersIterative(long n) {
        long sum = 0, A = 0, B = 1;
        for (long i = 1; i <= n - 1; i++) {
            sum = Math.floorMod(A + B, 10);
            A = B;
            B = sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long lastDigit = computeFibonacciNumbersIterative((n + 2) % PISANO_PERIOD_MOD10);
//        long sumLastDigit = (lastDigit == 0) ? 9 : (lastDigit - 1);
        System.out.println((lastDigit - 1));
    }
}
