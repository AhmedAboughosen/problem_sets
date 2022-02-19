package com.problems.recursion;

public class PowerUsingRecursion {


    public static void main(String[] args) {


        int n = 8, m = 2;

        System.out.println(power(n, m));

    }


    private static int power(int n, int m) {

        if (n == 1) return m;


        if (Math.floorMod(n, 2) == 0) {
            return (power(n / 2, m * m));
        }

        return  (power(n / 2, m * m) * m);
    }
}
