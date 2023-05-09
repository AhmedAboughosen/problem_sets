package src.com.problems.sortingAlgorithm;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MostProfitAssigningWork {


    //problem from https://leetcode.com/problems/most-profit-assigning-work/
    public static void main(String[] args) {


        maxProfitAssignment(new int[]{13,37,58}, new int[]{4,90,96}, new int[]{34,73,45});
        maxProfitAssignment(new int[]{85,47,57}, new int[]{24,66,99}, new int[]{40,25,25});
        maxProfitAssignment(new int[]{2,4,6,8,10}, new int[]{10,20,30,40,50}, new int[]{4,5,6,7});
    }


    public static int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {

        List<Assignment> assignmentList = new ArrayList<Assignment>();

        List<Assignment> assignments = new ArrayList<Assignment>();
        for (int i = 0; i < difficulty.length; i++) {
            assignmentList.add(new Assignment(difficulty[i], profit[i]));
        }

        assignmentList.sort(Comparator.comparingInt(o -> o.difficulty));

        int max = 0;
        for (int i = 0; i < assignmentList.size(); i++) {
            assignments.add(new Assignment(assignmentList.get(i).difficulty, Math.max(max, assignmentList.get(i).profit)));
            max = Math.max(max, assignmentList.get(i).profit);
        }

        //use binary search...

        int sum = 0;
        for (int i = 0; i < worker.length; i++) {

            int value = binarySearch(assignments, worker[i]);
            sum += value;
        }

        //use for loop

        return sum;
    }


    static int binarySearch(List<Assignment> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            // If x greater, ignore left half
            if (arr.get(m).difficulty > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }

        if((r == -1) || r  == arr.size()) return 0;

        // if we reach here, then element was
        // not present
        return arr.get(r  ).profit;
    }


    static class Assignment {

        int difficulty;
        int profit;

        Assignment(int difficulty, int profit) {
            this.difficulty = difficulty;
            this.profit = profit;
        }
    }

}
