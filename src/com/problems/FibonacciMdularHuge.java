package com.problems;

public class FibonacciMdularHuge {


    public static long pisano(long m) {
        long A = 0;
        long B = 1;

        for (int i = 0; i < m * m; i++) {
            long next = (A + B) % m;
            A = B;
            B = next;
            if (A == 0 && B == 1) {
                return i + 1;
            }
        }
        return 0;
    }

    // Calculate Fn mod m
    public static long fibonacciModulo(long n, long m) {

        // Getting the period
        long pisanoPeriod = pisano(m);

        long remainder = Math.floorMod(n, pisanoPeriod);

        long A = 0;
        long B = 1;

        if (remainder == 0 || remainder == 1)
            return remainder;

        for (int i = 1; i < remainder; i++) {
            long next = (A + B) % m;
            A = B;
            B = next;
        }
        return B % m;
    }


    public static void main(String[] args) {

        System.out.println(fibonacciModulo(4 , 3));
    }
}
