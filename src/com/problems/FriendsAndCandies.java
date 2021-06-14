package com.problems;

import java.util.Scanner;

public class FriendsAndCandies {


    // problem from http://codeforces.com/problemset/problem/1538/B.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {

            int n = scanner.nextInt();
            int arr[] = new int[n];
            int sum = 0;
            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
                sum = sum + arr[j];
            }

            if (sum % n != 0){
                System.out.println("-1");
            }else {
                int num = sum / n;
                int count = 0;
                for (int j = 0; j < n; j++) {
                   if(arr[j] > num){
                       count++;
                   }
                }

                System.out.println(count);
            }


        }
    }
}
