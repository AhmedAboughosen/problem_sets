package com.problems.recursion;

public class NaturalNumber {

    public static void main(String[] args) {


        System.out.println(sumNaturalNumber(7));
    }


    private static int sumNaturalNumber(int n){

        if ( n == 1 ) return  1;


        return  n +  sumNaturalNumber( n - 1 );
    }
}
