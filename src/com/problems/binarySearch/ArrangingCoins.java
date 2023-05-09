package src.com.problems.binarySearch;

public class ArrangingCoins {

    //problem form https://leetcode.com/problems/arranging-coins/


    public static void main(String[] args) {

       System.out.println( arrangeCoins(1804289383));
    }
    public static int arrangeCoins(int n) {

        long  start = 1, end = n , index = 1;
        while (start <= end) {
            long  m = start + (end - start) / 2;

            long  sum = ((m - 1) * ((m - 1) + 1)) / 2;

            if (n - sum >= m) {
                start = m + 1;
                index = m;
            } else {
                end = m - 1;
            }
        }


           return (int)index;
    }




}
