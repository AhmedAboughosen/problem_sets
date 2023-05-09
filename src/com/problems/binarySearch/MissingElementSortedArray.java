package src.com.problems.binarySearch;

public class MissingElementSortedArray {


    //problem from https://leetcode.ca/all/1060.html
    public static void main(String[] args) {

        System.out.println(missingValue(new int[]{4, 7, 9, 11}, 4));
    }

    public static int missingValue(int arr[], int k) {
        int start = 0, end = arr.length;

        int lastMissingValue = 0;
        int lower_bound = end;

        while (start < end) {
            int mid = (start + (end - start) / 2) + 1;

            int missingValues = (arr[mid] - arr[0]) - mid;

            if (possible(arr, k, start, mid)) {
                end = mid - 1;
                lower_bound = end;
                lastMissingValue = missingValues;
            } else {
                start = mid + 1;
                lastMissingValue = missingValues;
            }
        }


        if (lower_bound >= arr.length) {
            return Math.abs((k - lastMissingValue)) + arr[arr.length - 1];
        }


        return (lastMissingValue == k) ? arr[lower_bound] + lastMissingValue : Math.abs((k - lastMissingValue)) + arr[lower_bound];
    }

    public static boolean possible(int[] arr, int k, int start, int mid) {


        int missingValues = arr[mid] - arr[start];

        if ((missingValues - mid) >= k) {
            return true;
        }


        return false;
    }

}
