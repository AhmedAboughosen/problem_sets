package src.com.problems.sortingAlgorithm;

import java.util.Arrays;
import java.util.Collections;

public class LargestPerimeterTriangle {


    public static void main(String[] args) {

        largestPerimeter(new int[]{1,2,1,10});
    }
    public static int largestPerimeter(int[] nums) {

        // an array of reverse sorted ints
        int[] arrDesc = Arrays.stream(nums).boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        for (int i = 0; i < arrDesc.length - 2; i++) {

            if (arrDesc[i] < arrDesc[i + 1] + arrDesc[i + 2]) return arrDesc[i] + arrDesc[i + 1] + arrDesc[i + 2];

        }

        return 0;

    }
}
