package src.com.problems.sortingAlgorithm;

import java.util.Arrays;

public class ArrayPartition {


    public static void main(String[] args) {


        System.out.println(arrayPairSum(new int[]{1,3,2}));
    }


    public static int arrayPairSum(int[] nums) {

        Arrays.sort(nums);

        int sum = 0;
        for (int i = 0; i < nums.length - 1; i = i + 2) {

            int first = nums[i];
            int second = nums[i + 1];

            sum += Math.min(first, second);
        }

        return sum;
    }

}
