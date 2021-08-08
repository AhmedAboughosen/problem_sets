package com.problems.greedyAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumAdvertisementRevenue {


    /**
     * Task. Given two sequences a1, a2, . . . , an (ai is the profit per click of the i-th ad) and b1, b2, . . . , bn (bi is the average number of clicks per day of the i-th slot), we need to partition them into n pairs (ai, bj) such that the sum of their products is maximized.
     * <p>
     * Input Format. The frst line contains an integer n, the second one contains a sequence of integers a1, a2, . . . , an, the third one contains a sequence of integers b1, b2, . . . , bn.
     * <p>
     * Constraints. 1 ≤ n ≤ 103; −105 ≤ ai, bi ≤ 105 for all 1 ≤ i ≤ n.
     * <p>
     * Output Format. Output the maximum value of sum(aici), where c1, c2, . . . , cn is a permutation of b1, b2, . . . , bn.
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int arrProfit[] = new int[n];
        int arrSlot[] = new int[n];
        for (int i = 0; i < n; i++) {
            arrProfit[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            arrSlot[i] = scanner.nextInt();
        }

        Arrays.sort(arrProfit);
        Arrays.sort(arrSlot);
        long sum = 0;
        int firstIndexOfProfit = 0, firstIndexOfSlot = 0;
        for (int i = n - 1; i >= 0; i--) {
            sum += (arrProfit[i] * arrSlot[i]);
        }
        System.out.println(sum);
    }
}
