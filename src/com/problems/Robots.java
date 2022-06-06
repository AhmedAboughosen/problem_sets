package src.com.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Robots {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {

            int a = scanner.nextInt(), b = scanner.nextInt();
            List<String> grid = new ArrayList<>();

            for (int j = 0; j < a; j++) {
                grid.add(scanner.next());
            }


            boolean isNo = false;
            int last = Integer.MAX_VALUE;
            for (int j = 0; j < a; j++) {


                int index = grid.get(j).indexOf("R");

                if (index != -1) {
                    if (last != Integer.MAX_VALUE && last > index) {
                        isNo = true;
                        break;
                    }

                    last = Math.min(index, last);
                }

            }

            System.out.println(isNo || last == Integer.MAX_VALUE ? "No" : "Yes");
        }

    }
}
