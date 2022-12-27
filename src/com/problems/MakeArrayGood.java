package src.com.problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MakeArrayGood {

    //problem from https://codeforces.com/contest/1762/problem/B
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

        MakeArrayGood.FastScanner scanner = new MakeArrayGood.FastScanner();

        int t = scanner.nextInt();


        while (t-- >= 1) {

            int n = scanner.nextInt();

            long arr[] = new long[n];
            System.out.println(n);

            for (int i = 1; i <= arr.length; i++) {

                long x = scanner.nextLong();
                System.out.println((i) + " " + (f(x) - x));
            }

        }
    }


    public static long f(long x) {

        long sum = 1;

        while (sum <= x) {
            sum *= 2;
        }

        return sum;
    }

}
