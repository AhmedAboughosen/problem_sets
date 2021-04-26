package com.problems;

import java.util.Scanner;

public class GivenLengthSumDigits {
    // problem from http://codeforces.com/contest/489/problem/C

    public static void main(String[] args) {
        // write your code here

        Scanner in = new Scanner((System.in));

        int m = in.nextInt(), s = in.nextInt();

        if (s >= 10) {
            int get_number_of_nine = s / 9;

            if (Math.floorMod(s, 9) != 0) {
                if (m <= get_number_of_nine) {
                    System.out.println("-1 -1");
                    return;
                }
                int remainingValue = s - (get_number_of_nine * 9);
                StringBuilder max = new StringBuilder();
                addNine(max, get_number_of_nine);
                max.append(remainingValue + "");
                addZeros(max, m - (get_number_of_nine + 1));


                StringBuilder min = new StringBuilder();
                boolean isRemainingValue = m - (get_number_of_nine) >= 2;

                min.append(isRemainingValue ? 1 : remainingValue);
                addZeros(min, isRemainingValue ? (m - (get_number_of_nine + 2)) : m - (get_number_of_nine + 1));
                min.append(isRemainingValue ? remainingValue - 1 : "");
                addNine(min, get_number_of_nine);

                System.out.println(min + " " + max);

            } else {
                if (m < get_number_of_nine) {
                    System.out.println("-1 -1");
                    return;
                }
                StringBuilder max = new StringBuilder();
                addNine(max, get_number_of_nine);
                addZeros(max, m - (get_number_of_nine));

                StringBuilder min = new StringBuilder();
                boolean isRemainingValue = m - (get_number_of_nine) >= 2;
                min.append(isRemainingValue ? 1 : 9);
                addZeros(min, isRemainingValue ? (m - ((get_number_of_nine - 1) + 2)) : m - (get_number_of_nine + 1));
                min.append(isRemainingValue ? 8 : "");
                addNine(min, get_number_of_nine - 1);

                System.out.println(min + " " + max);

            }

        } else {
            if (m == 1) {
                System.out.println(s + " " + s);
                return;
            }
            if (s == 0) {
                System.out.println("-1 -1");
                return;
            }

            if (s == 1) {
                StringBuilder value = new StringBuilder();
                value.append(1 + "");
                addZeros(value, m - 1);
                System.out.println(value + " " + value);
                return;
            }

            StringBuilder min = new StringBuilder();
            min.append(1 + "");
            addZeros(min, m - 2);
            min.append(s - 1 + "");
            StringBuilder max = new StringBuilder();
            max.append(s + "");
            addZeros(max, m - 1);
            System.out.println(min + " " + max);

        }


    }


    static void addZeros(StringBuilder stringBuilder, int size) {
        for (int i = 0; i < size; i++) {
            stringBuilder.append("0");
        }
    }

    static void addNine(StringBuilder stringBuilder, int size) {
        for (int i = 0; i < size; i++) {
            stringBuilder.append("9");
        }
    }
}
