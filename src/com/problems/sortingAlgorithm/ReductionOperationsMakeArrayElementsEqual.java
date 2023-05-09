package src.com.problems.sortingAlgorithm;

import java.util.Arrays;
import java.util.Collections;

public class ReductionOperationsMakeArrayElementsEqual {

    public static void main(String[] args) {

        reductionOperations(new int[]{7,9,10,8,6,4,1,5,2,3});
    }

    public static int reductionOperations(int[] nums) {


        Arrays.sort(nums);

        int count = 0;
        for (int i = nums.length - 1 ; i > 0; i--) {

            if(nums[i] != nums[i - 1]){
                count += ((nums.length ) - i);
            }
        }



        return count;
    }



}
