package com.problems;

import java.util.Scanner;

public class LoveSong {


    // problem from https://codeforces.com/contest/1539/problem/B
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(), q = scanner.nextInt();

        StringBuilder str = new StringBuilder(scanner.next());
        int arr[] = new int[str.length()];
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            count += (ch - 96);
            arr[i] = count;
        }


        for (int i = 0; i < q; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();

            if (start == 1){
                System.out.println(arr[end - 1]);
            }else {
                System.out.println(arr[end - 1] - arr[start - 2]);
            }
        }

    }
}
