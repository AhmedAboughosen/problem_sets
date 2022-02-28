package com.problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class OddSwapSort {

    // problem from http://codeforces.com/problemset/problem/1638/B
    private static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        boolean hasNext() {
            return st.hasMoreTokens();
        }

        char[] readCharArray(int n) {
            char[] arr = new char[n];
            try {
                br.read(arr);
                br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return arr;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        long[] readLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = nextLong();
            return a;
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }


    public static void main(String[] args) {

        FastScanner scanner = new FastScanner();
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            arr[0] = scanner.nextInt();



            boolean isSorted = true;
            for (int j = 1; j < arr.length; j++) {
                arr[j] = scanner.nextInt();

                if (!(arr[j] >= arr[j - 1])) {
                    isSorted = false;
                }
            }

            if (isSorted) {
                System.out.println("YES");
                continue;
            }


            isSorted = true;

            int max = arr[0];
            int maxOdd = !isEven(arr[0]) ? arr[0] : Integer.MIN_VALUE;
            int maxEven = isEven(arr[0]) ? arr[0] : Integer.MIN_VALUE;

            for (int j = 1; j < arr.length; j++) {

                if (isEven(arr[j])) {
                    maxEven = Math.max(maxEven, arr[j]);
                } else {
                    maxOdd = Math.max(maxOdd, arr[j]);
                }


                if (max <= arr[j]) {
                    max = arr[j];
                    continue;
                }

                int current = arr[j];

                if (isEven(arr[j]) && maxEven > current) {
                    isSorted = false;
                    break;
                }

                if (!isEven(arr[j]) && maxOdd > current) {
                    isSorted = false;
                    break;
                }
            }

            System.out.println(isSorted ? "YES" : "NO");
        }
    }

    public static boolean isEven(int current) {
        return (Math.floorMod(current, 2) == 0);
    }
}
