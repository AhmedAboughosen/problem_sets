package com.problems;

import java.util.Scanner;

public class AvoidLocalMaximums {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int arr[] = new int[n];

            for (int j = 0; j < arr.length; j++) {
                arr[j] = scanner.nextInt();
            }


            int start = 0, end = 2, count = 0;
            while (end < n) {
                count += updateData(start, end, arr);
                ++start;
                ++end;
            }

            System.out.println(count);
            for (int j = 0; j < n; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }

    public static int updateData(int start, int end, int arr[]) {

        if (arr[start + 1] > arr[start] && arr[start + 1] > arr[end]) {
            if (end + 1 < arr.length) {
                arr[end] = Math.max(arr[end + 1], arr[start + 1]);
                return 1;
            }

            arr[end] = arr[start + 1];
            return 1;
        }
        return 0;
    }

}
