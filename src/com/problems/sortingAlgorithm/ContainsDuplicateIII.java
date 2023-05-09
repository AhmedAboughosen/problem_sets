package src.com.problems.sortingAlgorithm;

import java.util.SortedSet;
import java.util.TreeSet;

public class ContainsDuplicateIII {


    public static void main(String[] args) {

        containsNearbyAlmostDuplicate(new int[]{19,20,25,40,4},2,3);
    }


    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {

        if (k < 1 || t < 0)
            return false;
        SortedSet<Long> set = new TreeSet<Long>();
        for (int i = 0; i < nums.length; i++) {
            long left = (long) nums[i] - t;
            long right = (long) nums[i] + t + 1;
            SortedSet<Long> subSet = set.subSet(left, right);
            if (!subSet.isEmpty())
                return true;
            set.add((long) nums[i]);
            if (i >= k) {
                set.remove((long) nums[i - k]);
            }
        }
        return false;
    }

}
