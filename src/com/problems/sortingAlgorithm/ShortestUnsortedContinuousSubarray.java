package src.com.problems.sortingAlgorithm;

import java.util.Arrays;

public class ShortestUnsortedContinuousSubarray {


    public static void main(String[] args) {

        System.out.println(findUnsortedSubarrayV2(new int[]{1,2,5,3,4}));

    }

    public static int findUnsortedSubarray(int[] nums) {


        int[] arr = nums.clone();


        Arrays.sort(arr);


        int start = Integer.MAX_VALUE;
        int end = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != arr[i]) {
                start = i;
                break;
            }
        }

        for (int i = nums.length - 1; i >= 0; i--) {

            if (nums[i] != arr[i]) {
                end = i;
                break;
            }
        }


        return (start == Integer.MAX_VALUE) ? 0 : (end - start) + 1;
    }

    public static int findUnsortedSubarrayV2(int[] nums) {


        int start = Integer.MAX_VALUE;
        int end = Integer.MIN_VALUE;
        int value = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length - 1; i++) {

            if(nums[i] == nums[i + 1] && value == nums[i] ){
                end = Math.max(i + 1,end );
                continue;
            }

            if (nums[i] > nums[i + 1]) {

                if (nums[i + 1] < value) {
                    value = nums[i + 1];
                }
                end = Math.max(i + 1,end );

            }
        }

        for (int i = 0; i < nums.length - 1; i++) {

           if(value < nums[i]){
               start = i;
               break;
           }
        }


        return (start == Integer.MAX_VALUE) ? 0 : (end - start) + 1;
    }
}
