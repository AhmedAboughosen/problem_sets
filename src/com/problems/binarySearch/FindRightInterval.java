package src.com.problems.binarySearch;

import java.util.Comparator;

public class FindRightInterval {


    public static void main(String[] args) {

    }


    public int[] findRightInterval(int[][] intervals) {


        int[][] starting = new int[intervals.length][2];

        for (int i = 0; i < intervals.length; i++) {
            starting[i][0] = intervals[i][0];
            starting[i][1] = i;
        }

        java.util.Arrays.sort(starting, Comparator.comparingDouble(a -> a[0]));

        int[] ans = new int[intervals.length];

        for (int i = 0; i < intervals.length; i++) {

            int index = firstIndexRange(starting, intervals[i][1]);

            if (index == -1) {
                ans[i] =index;
                continue;
            }

            ans[i] = starting[index][1];
        }

        return ans;
    }

    public static int firstIndexRange(int[][] nums, int target) {


        int start = 0, end = nums.length - 1, pos = -1;
        while (start <= end) {
            int m = start + (end - start) / 2;

            // Check if x is present at mid
            if (nums[m][0] >= target) {
                end = m - 1;
                pos = m;
                continue;
            }

            // If x greater, ignore left half
            if (nums[m][0] < target)
                start = m + 1;

        }


        return pos;
    }

}
