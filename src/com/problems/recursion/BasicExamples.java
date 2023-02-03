package com.problems.recursion;

public class BasicExamples {


    public static void main(String[] args) {

//        printPreFix(5);
//        System.out.println(pow(7, 3));

        int arr[] = new int[]{7,10,23,52,15,14,1};

        System.out.println(maxValue(arr,0));
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

    public static int pow(int value, int p) {

        if (p == 1) return value;

        return pow(value, p - 1) * 7;
    }

    public static int maxValue(int arr[], int index) {

        if (arr.length - 1 == index) {
            return arr[index];
        }

        return Math.max(arr[index], maxValue(arr, index + 1));
    }
}
