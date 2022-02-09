package com.problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class HemoseShopping {

   static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextString() {
            return ("" + next());
        }
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {

            int n = scanner.nextInt(), x = scanner.nextInt();

            int[] arr = new int[n];
            int[] copyArray;
            boolean isSorted = true;
            boolean isYes = true;
            arr[0] = scanner.nextInt();
            for (int j = 1; j < n; j++) {
                arr[j] = scanner.nextInt();
                if (arr[j - 1] > arr[j]) {
                    isSorted = false;
                }
            }

            if (isSorted) {
                System.out.println("YES");
                continue;
            }

            if (n == x) {
                System.out.println("NO");
                continue;
            }

            copyArray = arr.clone();

            Arrays.sort(arr);
            for (int j = 0; j < copyArray.length; j++) {
                if (!(j >= x || Math.abs((j - (n - 1))) >= x)) {
                    if (copyArray[j] != arr[j]) {
                        isYes = false;
                        System.out.println("NO");
                        break;
                    }
                }
            }

            if (isYes)
                System.out.println("YES");
        }
    }
}
