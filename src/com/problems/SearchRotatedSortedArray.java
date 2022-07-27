package src.com.problems;

import java.util.Arrays;

public class SearchRotatedSortedArray {


    public static void main(String[] args) {

        System.out.println(search(new int[]{2,5,6,0,0,1,2}, 9));
    }



    public static int search(int[] nums, int target) {

        if (nums.length == 1) return nums[0] == target ? 0 : -1;
        if (nums.length == 2) return nums[0] == target ? 0 : nums[1] == target ? 1 : -1;

        int midIndex = binarySearch(nums);

        if (midIndex == nums.length - 1) {
            int v = Arrays.binarySearch(nums, 0, nums.length, target);

            return  Math.max(v, -1);
        }


        int leftIndex = Arrays.binarySearch(nums, midIndex + 1, nums.length , target);
        if (leftIndex >= 0) {
            return leftIndex;
        }

        int rightIndex = Arrays.binarySearch(nums, 0, midIndex + 1, target);
        if (rightIndex >= 0) {
            return rightIndex;
        }

        return -1;
    }

    private static int binarySearch(int[] a) {
        int low = 0;
        int high = a.length - 1;
        int maxIndex = -1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = a[mid];

            if (midVal >= a[low]) {
                if (maxIndex == -1) maxIndex = mid;
                else
                    maxIndex = (a[mid] > a[maxIndex]) ? mid : maxIndex;

                low = mid + 1;
                continue;
            }

            if (midVal < a[low]) {
                high = mid - 1;
            }
        }

        return maxIndex;
    }
}
