package com.problems.recursion;

public class BasicExamples {


    public static void main(String[] args) {

//        printPreFix(5);
//        System.out.println(pow(7, 3));

//        int arr[] = new int[]{7, 10, 23, 52, 15, 14, 1};
//
////        System.out.println(maxValue(arr,0));
////        System.out.println(avgArr(new int[]{1,8,2,10,3},5));
//
////        var newArr = arrayIncrement(new int[]{1, 8, 2, 10, 3}, 5);
////        var outPutedArray = new int[]{1, 8, 2, 10, 3};
////
////        arrayAccoumulation(outPutedArray, 5);
////
////        for (int i = 0; i < outPutedArray.length; i++) {
////            System.out.println(outPutedArray[i]);
////        }
//
//        var outPutedArray = new int[]{1, 3, 5, 7, 4, 2};
//
////        leftMax(outPutedArray, 6);
//        rightMax(outPutedArray, 5, 0);
//
//        for (int i = 0; i < outPutedArray.length; i++) {
//            System.out.println(outPutedArray[i]);
//        }

        var suffixSumArray = new int[]{1, 3, 4, 6, 7};
        System.out.println(suffixSum(suffixSumArray, 5,3));

//        System.out.println(arrayIncrement(new int[]{1,8,2,10,3},5));
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

    public static double avgArr(int arr[], int len) {

        if (len == 1) return arr[0];

        return (arr[len - 1] + avgArr(arr, len - 1)) / 2;
    }

    public static int[] arrayIncrement(int arr[], int len) {

        if (len == 1) return arr;

        arrayIncrement(arr, len - 1);

        arr[len - 1] = arr[len - 1] + len - 1;
        return arr;
    }

    public static int arrayAccoumulation(int arr[], int len) {

        if (len == 1) return 1;


        arr[len - 1] = arrayAccoumulation(arr, len - 1) + arr[len - 1];
        return arr[len - 1];
    }

    public static int leftMax(int arr[], int len) {

        if (len == 1) return arr[0];


        arr[len - 1] = Math.max(leftMax(arr, len - 1), arr[len - 1]);
        return arr[len - 1];
    }

    public static void rightMax(int arr[], int len, int pos) {

        if (len == pos) return;


        rightMax(arr, len, pos + 1);

        arr[pos] = Math.max(arr[pos], arr[pos + 1]);

    }

    public static int suffixSum(int arr[], int len, int n) {

        if (n == 1) return arr[len - 1];


       return suffixSum(arr, len - 1, n - 1) + arr[len - 1];


    }


}
