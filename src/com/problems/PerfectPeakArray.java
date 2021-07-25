package com.problems;

import java.util.ArrayList;

public class PerfectPeakArray {

    public static int perfectPeak(ArrayList<Integer> A) {


        int max = A.get(0);
        ArrayList<Integer> B = new ArrayList<>();
        for (int i = 1; i < A.size() - 1; i++) {
            if (A.get(i) > max) {
                B.add(i);
                max = A.get(i);
            }
        }

        max = A.get(A.size() - 1);
        int startIndex = B.size() - 1;
        for (int i = A.size() - 2; i >= 1; i--) {
            if (startIndex >= 0 && i == B.get(startIndex)) {
                if (max > A.get(i)) return 1;
                --startIndex;
            }
            max = Math.min(max, A.get(i));
        }

        return 0;
    }

    public static void main(String[] args) {
        ArrayList<Integer> B = new ArrayList<>();
//
        int[] a = new int[]{9895, 30334, 17674, 23812, 20038, 25668, 6869, 1870, 4665, 27645, 7712, 17036, 31323, 8724, 28254, 28704, 26300, 25548, 15142, 12860, 19913, 32663, 32758};

        for (int i = 0; i < a.length; i++) {
            B.add(a[i]);
        }
//        B.add(5);
//        B.add(3);
//        B.add(1);
//        B.add(4);
//        B.add(6);
//        B.add(8);
//        B.add(10);
//        B.add(7);
//        B.add(9);

//        B.add(5);
//        B.add(10);
//        B.add(20);
//        B.add(32);
//        B.add(6);
//        B.add(8);
//        B.add(10);
//        B.add(7);
//        B.add(9);
        System.out.println(perfectPeak(B));
    }
}
