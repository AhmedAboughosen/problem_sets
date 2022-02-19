package com.problems.recursion;

/*
Given grid of positive numbers, Start from 0, 0 and end at n, n. Move only to right and down - find path with sum of numbers is maximum.
 */
public class findMaximumPath {


    public static void main(String[] args) {


//        int arr[][] = {{5, 7, 2}, {6, 7, 8}, {1, 8, 9}};
        int arr[][] = {{5 , 1}, {2, 3}};

        System.out.println(maxPath(arr, 0, 0));
    }


    public static int maxPath(int arr[][], int r, int c) {

        if (r > arr.length - 1 || c > arr.length - 1) return 0;

        if (r == arr.length - 1 && c == arr.length - 1) return arr[r][c];

        int path1 = 0;
        int path2 = 0;

        path1 = maxPath(arr, r, c + 1);
        path2 = maxPath(arr, r + 1, c);

        return arr[r][c] + Math.max(path1, path2);
    }
}
