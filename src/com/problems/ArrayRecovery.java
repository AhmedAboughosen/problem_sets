package src.com.problems;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayRecovery {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {

            int size = scanner.nextInt();

            int[] arr = new int[size];
            ArrayList<Integer> newArr = new ArrayList<>();

            for (int j = 0; j < size; j++) {
                arr[j] = scanner.nextInt();
            }

            int lastValue = -arr[0];

            boolean isBreaking = false;

            newArr.add(arr[0]);
            for (int j = 1; j < size; j++) {

                int val = Math.abs(lastValue - arr[j]);

                newArr.add(val);

                int current = newArr.get(j - 1) - arr[j];

                if (current >= 0 && current != val) {
                    isBreaking = true;
                    break;
                }
                lastValue = lastValue - arr[j];
            }


            if (isBreaking) {
                System.out.println(-1);
                continue;
            }

            for (int j = 0; j < size; j++) {
                System.out.print(newArr.get(j) + " ");
            }
            System.out.println();
        }
    }
}
