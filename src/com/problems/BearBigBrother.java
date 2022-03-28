package src.com.problems;

import java.util.Scanner;

public class BearBigBrother {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(), b = scanner.nextInt();

        int count = 0;
        while (a <= b) {
            a = a * 3;
            b = b * 2;
            ++count;
        }

        System.out.print(count);
    }
}
