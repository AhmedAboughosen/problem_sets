package com.problems;

import java.util.Scanner;

public class TwoSubsequences {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {

            String str = scanner.next();

            int minIndex = 0;
            char ch = str.charAt(0);

            for (int j = 1; j < str.length(); j++) {

                if (str.charAt(j) <= ch) {
                    minIndex = j;
                    ch = str.charAt(j);
                }
            }


            char[] myNameChars = str.toCharArray();
            myNameChars[minIndex] = ' ';

            System.out.println(ch + " "+ String.valueOf(myNameChars).replaceAll(" ", ""));
        }
    }


}
