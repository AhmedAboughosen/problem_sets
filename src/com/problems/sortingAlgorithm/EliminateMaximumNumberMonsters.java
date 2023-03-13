package src.com.problems.sortingAlgorithm;

import java.util.Arrays;

public class EliminateMaximumNumberMonsters {


    public static void main(String[] args) {

    }


    //problem from https://leetcode.com/problems/eliminate-maximum-number-of-monsters/
    public static int eliminateMaximum(int[] dist, int[] speed) {

        int killed = 0 , size = dist.length;

        int arrival_time[] = new int[size];

        for (int i = 0; i < size; i++) {

            if(Math.floorMod(dist[i]  , speed[i]) == 0){
                arrival_time[i] = dist[i] / speed[i];
            }else{
                arrival_time[i] = dist[i] / speed[i] + 1;
            }
        }

        Arrays.sort(arrival_time);
        for (int i = 0; i < size && i < arrival_time[i]; i++) killed += 2;

        return killed;
    }
}
