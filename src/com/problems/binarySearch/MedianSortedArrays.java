package src.com.problems.binarySearch;

public class MedianSortedArrays {


    public static void main(String[] args) {


        findMedianSortedArrays(new int[]{1, 3}, new int[]{2});
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {


        int leftValues = nums1.length + nums2.length;


        double value = outerBinary(nums1, nums2, leftValues / 2);
        return value;
    }

    public static int outerBinary(int[] nums1, int[] nums2, int leftValues) {
        int start = 0, end = nums2.length;

        while (start <= end) {
            int m = start + (end - start) / 2;


            double remaining = m + (innerBinary(nums1, nums2[m]) + 1);

            if (remaining == leftValues) {
                return nums2[m];
            } else {
                end = m - 1;
            }
        }

        end = nums1.length;
        while (start <= end) {
            int m = start + (end - start) / 2;


            double remaining = m + (innerBinary(nums2, nums1[m]) + 1);

            if (remaining == leftValues) {
                return nums1[m];
            } else {
                end = m - 1;
            }
        }


        return 0;
    }

    public static double innerBinary(int[] nums, int lessOrEqual) {
        int start = 0, end = nums.length - 1;

        int lastIndex = 0;
        while (start <= end) {
            int m = start + (end - start) / 2;

            if (nums[m] <= lessOrEqual) {
                start = m + 1;
                lastIndex = m;
            } else {
                end = m - 1;
            }
        }


        return (nums[lastIndex] > lessOrEqual) ? -1 : lastIndex;
    }

}
