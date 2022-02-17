package com.problems.recursion;

public class BasicExamples {


    public static void main(String[] args) {

        printPreFix(5);
    }


    public static void print(int n) {


        //base condition
        if (n == 0) return;

        System.out.println(n);
        print(n - 1);
        System.out.println("out is " + n);
    }

    public static void printPreFix(int n) {


        //base condition
        if (n == 0) return;

        printPreFix(n - 1);
        System.out.println(n);
    }
}
