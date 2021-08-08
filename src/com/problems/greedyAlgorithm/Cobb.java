package com.problems.greedyAlgorithm;

import java.util.Scanner;

public class Cobb {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t > 0) {
            t--;
            int n = sc.nextInt(), k = sc.nextInt();
            int[] arr = new int[n+1];
            for (int i=1;i<=n;i++) {
                arr[i] = sc.nextInt();
            }
            Long ans = Long.MIN_VALUE;
            int start = Math.max(1, n - 2 * k);
            for (int i=start;i<=n;i++) {
                for (int j=i+1;j<=n;j++) {
                    Long currentValue = 1L * i * j - 1L * k * (arr[i] | arr[j]);
                    ans = Math.max(ans, currentValue);
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
