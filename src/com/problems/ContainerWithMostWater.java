package src.com.problems;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ContainerWithMostWater {


    public static void main(String[] args) {



        maxArea(new int[]{3,9,3,4,7,2,12,6});
    }


    public static int maxArea(int[] height) {

        int r = 0, l = height.length - 1;
        int max = -1;

        while (r < l) {

            max = Math.max(max, (l - r) * Math.min(height[r], height[l]));

            if(height[r] == height[l]){
                r++;
                continue;
            }

            if(height[r] < height[l]){
                r++;
                continue;
            }

            l--;
        }

        return max;
    }
}
