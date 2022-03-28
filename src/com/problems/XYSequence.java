package src.com.problems;

import java.util.Scanner;

public class XYSequence {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            long n = scanner.nextLong(), b = scanner.nextLong(), x = scanner.nextLong(), y = scanner.nextLong();

            long sum = 0;
            long max = 0;

            for (int j = 0; j < n; j++) {

                long min = Long.min(max + x, max - y);
                max = Long.max(max + x, max - y);

                sum += max <= b ? max : min;

                max = max <= b ? max : min;
            }
            System.out.println(sum);
        }
    }
}
