package src.com.problems.binarySearch;

import java.util.Arrays;

public class Heaters {


    public int findRadius(int[] houses, int[] heaters) {

        int start = 1, end = Arrays.stream(heaters).max().getAsInt();

        int min_radius_standard = 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;


            if (possible(heaters, houses, mid)) {
                end = mid - 1;
                min_radius_standard = mid;
            } else {
                start = mid + 1;
            }
        }


        return min_radius_standard;
    }

    public static boolean possible(int[] heaters, int[] houses, int radiusStandard) {


        for (int i = 0; i < heaters.length; i++) {

        }
        return false;
    }

}
