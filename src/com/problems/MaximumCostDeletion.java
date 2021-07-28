package com.problems;

import java.util.Scanner;

public class MaximumCostDeletion {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(), a = scanner.nextInt(), b = scanner.nextInt();

            String text = scanner.next();


            int m = unique(text);

            System.out.println((a * n) + Math.max((b * n), (m / 2 + 1) * b));
        }
    }


    public static int unique(String text) {


        int count = 1;
        char currentChar = text.charAt(0);
        for (int i = 1; i < text.length(); i++) {

            if (currentChar != text.charAt(i)) {
                count++;
                currentChar = text.charAt(i);
            }

        }

        return count;
    }
}
