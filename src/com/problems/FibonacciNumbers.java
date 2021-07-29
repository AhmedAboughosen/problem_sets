package com.problems;

public class FibonacciNumbers {


    //learn more about https://en.wikipedia.org/wiki/Fibonacci_number
    public static int computeFibonacciNumbersRecurs(int n) {

        if (n <= 1) return n;
        return computeFibonacciNumbersRecurs(n - 1) + computeFibonacciNumbersRecurs(n - 2);
    }

    public static long computeFibonacciNumbersIterative(int n) {
        long sum = 0, A = 0, B = 1;
        for (int i = 3; i <= n; i++) {
            sum = A + B;
            A = B;
            B = sum;
        }
        return sum;
    }


    public static void main(String[] args) {

        System.out.println(computeFibonacciNumbersIterative(8));
    }
}
