package com.problems.recursion;

public class NaturalNumber {

    public static void main(String[] args) {


        System.out.println(sumNaturalNumber(7));
    }


    public static int sumNaturalNumber(int n){

        if ( n == 1 ) return  1;


        return  sumNaturalNumber( n - 1 ) + n;
    }
}
