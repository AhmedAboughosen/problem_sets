package com.problems.recursion;

public class TaylorSeries {

    static  int p = 1 , f = 1;
    public static void main(String[] args) {


        int n = 15, m = 4;

        System.out.println(sum(n, m));

    }


    private static double sum(int n, int x) {

        if (n == 1) return x;

        double s =  sum(n - 1, x);
        p = p * x;
        f = f * n;

        return ((double) p / f) + s;
    }

    private static int power(int n, int m) {

        if (n == 1) return m;


        if (Math.floorMod(n, 2) == 0) {
            return (power(n / 2, m * m));
        }

        return (power(n / 2, m * m) * m);
    }

    private static int sumFactorialNumber(int n) {

        if (n <= -1) return 0;
        if (n == 1) return 1;


        return n * sumFactorialNumber(n - 1);
    }
}
