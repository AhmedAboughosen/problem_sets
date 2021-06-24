package com.problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class LargestNumber {


    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    static  void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2) {
            String XY = L[i] + "" +  R[j];

            // then append X at the end of Y
            String YX = R[j] + "" + L[i];

            if (XY.compareTo(YX) > 0) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
  static   void sort(int arr[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m =l+ (r-l)/2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    public static   String largestNumber(final int[] A) {

        StringBuilder value = new StringBuilder();
        StringBuilder zeros = new StringBuilder();
        sort(A,0, A.length - 1);
        //        return  Arrays.toString(A).replaceAll("\\[|\\]|,|\\s", "");
        for (int i = 0; i < A.length; i++) {
            value.append(A[i]);
            zeros.append("0");
        }
        return value.toString().equals(zeros.toString()) ? "0" : value.toString();
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 30, 34, 5, 9};
        System.out.println(largestNumber(arr));
    }

}
