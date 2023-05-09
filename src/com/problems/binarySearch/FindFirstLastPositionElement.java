package src.com.problems.binarySearch;

public class FindFirstLastPositionElement {


    public static void main(String[] args) {


        searchRange(new int[]{}, 6);
    }


    public static int[] searchRange(int[] nums, int target) {


        var indexes = new int[2];


        int first = firstIndexRange(nums, target);
        int last = lastIndexRange(nums, target);

        indexes[0] = first;
        indexes[1] = last;

        return indexes;
    }


    public static int firstIndexRange(int[] nums, int target) {


        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int m = start + (end - start) / 2;

            // Check if x is present at mid
            if (nums[m] == target) {
                end = m - 1;
                continue;
            }

            // If x greater, ignore left half
            if (nums[m] < target)
                start = m + 1;
                // If x is smaller, ignore right half
            else
                end = m - 1;
        }


        if (start < nums.length && nums[start] == target ) return start;

        return -1;
    }

    public static int lastIndexRange(int[] nums, int target) {


        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int m = start + (end - start) / 2;

            // Check if x is present at mid
            if (nums[m] == target) {
                start = m + 1;
                continue;
            }

            // If x greater, ignore left half
            if (nums[m] < target)
                start = m + 1;
                // If x is smaller, ignore right half
            else
                end = m - 1;
        }


        if (end >= 0 && nums[end] == target) return end;

        return -1;
    }
}
