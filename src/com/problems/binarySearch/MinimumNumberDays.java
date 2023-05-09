package src.com.problems.binarySearch;

import java.util.Arrays;

public class MinimumNumberDays {


    //problem from https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/
    public static void main(String[] args) {

        minDays(new int[]{1,10,3,10,2}, 3 , 1);
    }


    public static int minDays(int[] bloomDay, int m, int k) {



        int start = 1, end = Arrays.stream(bloomDay).max().getAsInt();

        int min_days = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;


            if (possible(bloomDay,m,k,mid)) {
                end = mid - 1;
                min_days = mid;
            } else {
                start = mid + 1;
            }
        }


        return min_days;
    }


    public static boolean possible(int[] bloomDay, int m, int k,int waitingDays){


        int adj_flowers = 0,bouquets = 0;
        for (int i = 0; i < bloomDay.length; i++) {

            if(bloomDay[i] <= waitingDays){
                ++adj_flowers;

                if(adj_flowers == k){
                    adj_flowers = 0;
                    ++bouquets;
                }


                if(bouquets == m)return true;
            }else{
                adj_flowers = 0;
            }
        }
        return false;
    }

}
