package com.problems.recursion;

public class N3Series {
    public static void main(String[] args) {

        System.out.println(F3n_1(22));
    }


   static int F3n_1(int n)        // Recursion State: n
    {
        if (n == 1)
            return 1;

        if (n % 2 == 0)
            return 1 + F3n_1(n / 2);    // 1+ as we have an element in the sequence

        return 1 + F3n_1(3 * n + 1);
    }
}
