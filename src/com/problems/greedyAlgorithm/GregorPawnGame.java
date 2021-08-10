package com.problems.greedyAlgorithm;

import java.util.Scanner;

public class GregorPawnGame {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();

            char[] first = scanner.next().toCharArray();
            char[] second = scanner.next().toCharArray();
            int count = 0;
            for (int j = 0; j < n; j++) {

                if (second[j] == '1') {

                    if (first[j] == '0') {
                        count++;
                        first[j] = '2';
                    } else {
                        if (j - 1 >= 0 && first[j - 1] == '1') {
                            count++;
                            first[j - 1] = '2';
                        } else if (j + 1 < n && first[j + 1] == '1') {
                            count++;
                            first[j + 1] = '2';
                        }

                    }


                }

            }

            System.out.println(count);
        }
    }
}
