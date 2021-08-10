package com.problems.greedyAlgorithm;

import java.util.Scanner;

public class MaximumNumberPrizes {


    /**
     * Task. The goal of this problem is to represent a given positive integer n as a sum of as many pairwise distinct positive integers as possible. That is, to find the maximum k such that n can be written as a1 + a2 + ... + ak where a1, . . . , ak are positive integers and ai ̸= aj for all 1 ≤ i < j ≤ k.
     *
     * Input Format. The input consists of a single integer n.
     *
     * Constraints. 1 ≤ n ≤ 109.
     *
     * Output Format. In the frst line, output the maximum number k such that n can be represented as a sum of k pairwise distinct positive integers. In the second line, output k pairwise distinct positive integers that sum up to n (if there are many such representations, output any of them).
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long number = scanner.nextLong();

        long[] va = binarySearch(1, number, number);
        for (int i = 1; i < Math.min(va[1], va[0]); i++) {
            System.out.println(i);
        }

        long su = ((Math.max(va[1], va[0]) * ((Math.max(va[1], va[0])) + 1))) / 2;
        System.out.println((va[1] + va[0]) - (su - number));
    }

    public static long[] binarySearch(long start, long end, long x) {
        long l = start, r = end;
        while (l <= r) {
            long m = l + (r - l) / 2;

            long sum = (m * (m + 1)) / 2;

            if (sum > x)
                r = m - 1;

            if (sum < x)
                l = m + 1;
            if (sum == x) {
                l = m + 1;
                r = m;
                break;
            }
        }

        return new long[]{l, r};
    }

}
