package com.problems;

public class MinStepsInfiniteGrid {


    public static int coverPoints(int[] A, int[] B) {


        int count = 0;
        for (int i = 0; i < A.length - 1; i++) {
            int distanceA = Math.max(A[i], A[i + 1]) - Math.min(A[i], A[i + 1]);
            int distanceB = Math.max(B[i], B[i + 1]) - Math.min(B[i], B[i + 1]);
            count += Math.max(distanceA, distanceB);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(coverPoints(new int[]{0, 1, 1}, new int[]{0, 1, 2}));
    }
}
