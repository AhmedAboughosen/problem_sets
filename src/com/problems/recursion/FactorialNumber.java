package com.problems.recursion;

public class FactorialNumber {

    public static void main(String[] args) {


        System.out.println(sumFactorialNumber(0));
    }


    private static int sumFactorialNumber(int n){

        if (n <= -1 ) return 0;
        if ( n == 1 ) return  1;


        return  n *  sumFactorialNumber( n - 1 );
    }
}
