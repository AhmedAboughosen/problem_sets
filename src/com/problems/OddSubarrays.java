package src.com.problems;

import java.util.Scanner;

public class OddSubarrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            long n = sc.nextLong();
            long[] a = new long[(int) n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            int cnt = 0;
            for (int i = 0; i < n - 1; i++) {
                if (a[i] > a[i + 1]) {
                    i++;
                    cnt++;
                }
            }
            System.out.println(cnt);

        }
    }
}
