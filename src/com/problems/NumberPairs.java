package com.problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NumberPairs {



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

        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            int n = sc.nextInt(), l = sc.nextInt(), r = sc.nextInt();

            int arr[] = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }


            Arrays.sort(arr);
            long count = 0;
            for (int j = arr.length - 1; j >= 0; j--) {
                int[] indexes = find(arr, 0, j - 1, arr[j], l, r);
                if (indexes[0] != -1 && indexes[1] != -1) {
                    count = count + ((indexes[0] - indexes[1]) + 1);
                }
            }
            out.println(count);

//            System.out.println(count);
        }
        out.flush();
        out.close();
    }


    public static int[] find(int arr[], int first, int last, int key, int l, int r) {
        int mid = (first + last) / 2;

        while (first <= last) {
            if ((arr[mid] + key) >= l && (arr[mid] + key) <= r) {
                break;
            } else {
                if ((arr[mid] + key) < r) {
                    first = mid + 1;
                } else {
                    last = mid - 1;
                }
            }

            mid = (first + last) / 2;
        }

        int max = findMax(arr, mid, last, key, l, r);
        int min = findMin(arr, first, mid, key, l, r);

        return new int[]{max, min};
    }

    public static int findMax(int arr[], int first, int last, int key, int l, int r) {
        int mid = (first + last) / 2;
        int lastMid = -1;

        while (first <= last) {
            if ((arr[mid] + key) >= l && (arr[mid] + key) <= r) {
                first = mid + 1;
                lastMid = mid;
            } else {
                if ((arr[mid] + key) < r) {
                    first = mid + 1;
                } else {
                    last = mid - 1;
                }
            }

            mid = (first + last) / 2;
        }


        return lastMid;
    }

    public static int findMin(int arr[], int first, int last, int key, int l, int r) {

        int mid = (first + last) / 2;
        int firstMid = -1;
        while (first <= last) {
            if ((arr[mid] + key) >= l && (arr[mid] + key) <= r) {
                last = mid - 1;
                firstMid = mid;
            } else {
                if ((arr[mid] + key) < r) {
                    first = mid + 1;
                } else {
                    last = mid - 1;
                }
            }

            mid = (first + last) / 2;
        }
        return firstMid;
    }
}
