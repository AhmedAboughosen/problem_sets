package src.com.problems.sortingAlgorithm;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {


    public static void main(String[] args) {

//        merge(new int[][]{{1,3}, {2,6},{8,10}, {15,18}});
        merge(new int[][]{{1,4}, {4,5}});
    }

    public static int[][] merge(int[][] intervals) {


        List<Integer[]> list = new ArrayList<>();

        java.util.Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {

            if( intervals[i][0] <= end){
                end =  Math.max(intervals[i][1] , end);
            }else {
                list.add(new Integer[]{start , end});
                start = intervals[i][0];
                end =  intervals[i][1];
            }

        }

        if(list.isEmpty()){
            list.add(new Integer[]{start , end});

        }else {
            if(list.get(list.size() - 1)[0] != start && list.get(list.size() - 1)[1] != end){
                list.add(new Integer[]{start , end});

            }
        }

        int [][]arr = new int[list.size()][2];

        for (int i = 0; i < list.size(); i++) {
            arr[i][0] = list.get(i)[0];
            arr[i][1] = list.get(i)[1];
        }
        return arr;
    }

}
