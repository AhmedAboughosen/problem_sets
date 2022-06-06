package src.com.problems;

import java.util.Arrays;
import java.util.Scanner;

public class NumberPairs {

    private static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {


        int t = sc.nextInt();

        while (t-- > 0) {
            solve();
        }

    }


    private static void solve() {
        int n = sc.nextInt(), l = sc.nextInt(), r = sc.nextInt();

        Integer arr[] = new Integer[n];

        for (int j = 0; j < n; j++) {
            arr[j] = sc.nextInt();
        }


        Arrays.sort(arr);
        long count = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > r) continue;

            int[] indexes = find(arr, j + 1, arr.length - 1, arr[j], l, r);
            if (indexes[1] == -1 || indexes[0] == -1 || (indexes[1] - indexes[0]) <= -1) continue;
            count = count + ((indexes[1] - indexes[0]) + 1);
        }


        System.out.println(count);
    }

    public static int[] find(Integer arr[], int first, int last, int key, int l, int r) {

        int firstMid = -1, secondMid = -1;
        int firstIndex = first, lastIndex = last;
        boolean isGreaterOrEqual = false, isLessOrEqual = false;
        while (first <= last) {
            int mid = (first + last) / 2;
            if ((arr[mid] + key) >= l) {
                last = mid - 1;
                firstMid = mid;
                isGreaterOrEqual = true;
                continue;
            }
            first = mid + 1;
        }


        //1 1 3 4 4
        if (!isGreaterOrEqual) return new int[]{-1, -1};


        first = firstIndex;
        last = lastIndex;

        while (first <= last) {
            int mid = (first + last) / 2;

            if ((arr[mid] + key) <= r) {
                first = mid + 1;
                secondMid = mid;
                isLessOrEqual = true;
                continue;
            }

            last = mid - 1;
        }

        if (!isLessOrEqual) return new int[]{-1, -1};


        return new int[]{firstMid, secondMid};
    }
}
