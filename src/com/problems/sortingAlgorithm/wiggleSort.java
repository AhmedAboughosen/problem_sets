package src.com.problems.sortingAlgorithm;

public class wiggleSort {


    //problem from https://leetcode.com/problems/wiggle-sort/
    public static void main(String[] args) {

        wiggleSort(new int[]{6,5,10,3,2});
    }

    public static void wiggleSort(int[] nums) {
        for(int i=1; i< nums.length;i++){
            if( nums[i] < nums[i-1]
                    || nums[i] > nums[i-1]){
                int t = nums[i];
                nums[i] = nums[i-1];
                nums[i-1] = t;
            }
        }
    }
}
