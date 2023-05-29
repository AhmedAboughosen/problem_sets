package src.com.problems.binarySearch;

import java.util.Arrays;

public class SmallestNumberMultiplicationTable {


    public static void main(String[] args) {

        System.out.println(findKthNumber(3,3,5));
    }


    public static int findKthNumber(int m, int n, int k) {



        int start = 1, end = n * m , kth = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (count_len(m,n,mid) < k) {
                start = mid + 1;
            } else {
                end = mid - 1;
                kth = mid;
            }
        }


        return kth;
    }

    public static int count_len(int row , int column , int value){


        int count = 0;

        for (int i = 1; i <= row; i++) {

            count += Math.min(value / i,column );
        }
        return count;
    }
}
