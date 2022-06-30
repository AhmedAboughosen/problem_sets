package src.com.problems;

import java.util.HashMap;
import java.util.Scanner;

public class ArrayCloningTechnique {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {

            int[] arr = new int[scanner.nextInt()];

            for (int j = 0; j < arr.length; j++) {
                arr[j] = scanner.nextInt();
            }


            int commonNumber = arr[0];
            int max = 1;
            HashMap<Integer, Integer> map = new HashMap<>();

            for (int j = 0; j < arr.length; j++) {
                map.put(arr[j], map.containsKey(arr[j]) ? map.get(arr[j]) + 1 : 1);

                int val = map.get(arr[j]);

                if (val > max) {
                    commonNumber = arr[j];
                    max = val;
                }
            }

            if (map.size() == 1) {
                System.out.println(0);
                continue;
            }

            int start = map.get(commonNumber);
            int count = 0;

            while (start * 2 <= arr.length) {

                ++count;

                start = start * 2;

                count += (start / 2);

            }

            start = start * 2;

            if (arr.length - (start / 2) > 0) ++count;


            count += arr.length - (start / 2);


            System.out.println(count);
        }
    }
}
