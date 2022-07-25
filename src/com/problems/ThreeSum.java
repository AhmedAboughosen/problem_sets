package src.com.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {


    public static void main(String[] args) {

        threeSum(new int[]{0, 0, 0, 0});
    }


    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            if (i != 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j < nums.length; j++) {

                if (j != i + 1 && nums[j] == nums[j - 1]) continue;


                int sum = nums[i] + nums[j];

                int index = binarySearch(nums, j + 1, nums.length, -sum);

                if (index != -1) {
                    lists.add(Arrays.asList(nums[i], nums[j], nums[index]));
                }

            }
        }
        return lists;
    }


    private static int binarySearch(int[] a, int fromIndex, int toIndex,
                                    int key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = a[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -1;  // key not found.
    }
}
