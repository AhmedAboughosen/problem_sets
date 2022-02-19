package com.problems.recursion;

public class PowerUsingRecursion {



    public static void main(String[] args) {


        System.out.println(power(10, 3));
    }


    private static int power(int n,int m){

        if ( n == 1 ) return  m;


        return  m *  power( n - 1 , m );
    }
}
