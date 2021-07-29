package com.problems;

public class LastDigitLargeFibonacciNumber {


    public static int computeFibonacciNumbersIterative(int n) {
        int sum = 0 , A = 0, B = 1;
        for (int i = 1; i <= n-1; i++) {
            sum = Math.floorMod(A + B , 10);
            A = B;
            B = sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println((computeFibonacciNumbersIterative(327305)));
    }
}
