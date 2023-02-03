package src.com.problems;

import java.util.HashMap;
import java.util.Scanner;

public class QuickSort {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {


            int n = scanner.nextInt();
            int k = scanner.nextInt();

            HashMap<Integer, Integer> map = new HashMap<>();

            for (int j = 0; j < n; j++) {
                map.put(scanner.nextInt(), j);
            }

            boolean isSorted = true;
            int index = map.get(1);
            int counter = 0;

            for (int j = 2; j <= n; j++) {
                int currentIndex = map.get(j);
                if (currentIndex < index) {
                    counter = j;
                    isSorted = false;
                    break;
                }
                index = currentIndex;
            }


            if (isSorted) {
               System.out.println(0);
            } else {
                int diff = (n - counter) + 1;

                System.out.println(Math.floorMod(((diff)),k) == 0 ? diff / k : (diff / k) + 1 );
            }
//
//            for (int j = 2; j < n; j++) {
//
//                int currentIndex = map.get(j);
//
//                if( currentIndex < index){
//
//                }
//
//            }

        }
    }
}
