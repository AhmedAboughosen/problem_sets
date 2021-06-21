package com.problems;

import java.util.HashMap;

public class MinimumLightsActivate {


    //from https://www.interviewbit.com/problems/minimum-lights-to-activate/
    public static int solve(int[] A, int B) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int start = 1, count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 1) {
                int cal2 = ((i + 1) - B) + 1;
                int firstIndex = (cal2) <= 0 ? 1 : cal2;
                int lastIndex = (((i + 1) + B) - 1);
                map.put(firstIndex, lastIndex);
            }
        }


        while (start <= A.length) {
            if (map.containsKey(start)) {
                int currentValue = map.get(start);
                start = ++currentValue;
                count++;
            } else {
                boolean isFlag = false;
                for (int j = start - 1; j >= 1; j--) {
                    if (map.containsKey(j)) {
                        isFlag = true;
                        int endValue = map.get(j);
                        if (endValue >= A.length && endValue >= start) {
                            return ++count;
                        }

                        if (endValue >= start) {
                            count++;
                            start = ++endValue;
                            break;
                        } else {
                            return -1;
                        }
                    }
                }

                if (!isFlag) return -1;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(solve(new int[]{0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0}, 4));
    }
}
