package src.com.problems.binarySearch;

import java.util.Arrays;

public class FindSmallestDivisor {

    //problem from https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/


    public static void main(String[] args) {

        smallestDivisor(new int[]{21212,10101,12121},1000000);
    }
    public static int smallestDivisor(int[] nums, int threshold) {
        int start = 1, end = Arrays.stream(nums).max().getAsInt();
        int divisor = end;

        while (start <= end) {
            int m = start + (end - start) / 2;


            if (m != 0 && sum(nums, m) <= threshold) {
                end = m - 1;
                divisor = m;
            } else {
                start = m + 1;
            }
        }


        return divisor;
    }


    public static int sum(int[] nums, int div) {

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += (nums[i] + div - 1) / div;
        }

        return sum;
    }


}
