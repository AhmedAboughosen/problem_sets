package src.com.problems.sortingAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MinimumAbsoluteDifference {

    //problem from https://leetcode.com/problems/minimum-absolute-difference/

    public static void main(String[] args) {

        var list = minimumAbsDifference(new int[]{3,8,-10,23,19,-4,-14,27});

        int a;
    }


    public static List<List<Integer>> minimumAbsDifference(int[] arr) {


        List<List<Integer>> list = new ArrayList<>();


        Arrays.sort(arr);

        int minIndex = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {

            int diff = (arr[i + 1] - (arr[i]));

            if( diff < minIndex){
                minIndex = diff;
            }


        }



        for (int i = 0; i < arr.length - 1; i++) {

            int diff = ((arr[i + 1]) - (arr[i]));

            if (diff == minIndex) {
                var firstList = new ArrayList<Integer>();

                firstList.add(arr[i]);
                firstList.add(arr[i + 1]);
                list.add(firstList);
            }
        }


        return list;
    }
}
