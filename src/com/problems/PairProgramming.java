package com.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PairProgramming {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int k = scanner.nextInt(), n = scanner.nextInt(), m = scanner.nextInt(), numberOfZeros = 0, maxValue = Integer.MIN_VALUE;
            int[] list = new int[n + m];
            ArrayList<Integer> listOfCanEditable = new ArrayList<>();
            ArrayList<Integer> listOfAdded = new ArrayList<>();

            for (int j = 0; j < list.length; j++) {
                list[j] = scanner.nextInt();
                if (list[j] == 0) ++numberOfZeros;
                if (list[j] <= k && list[j] != 0) listOfCanEditable.add(list[j]);
                if (list[j] > k && list[j] != 0) listOfAdded.add(list[j]);
                maxValue = Math.max(list[j], maxValue);
            }

            if ((k + numberOfZeros) < maxValue) {
                System.out.println(-1);
                continue;
            }

            Collections.sort(listOfAdded);

            for (int j = 0; j < listOfCanEditable.size(); j++) {
                System.out.print(listOfCanEditable.get(j) + " ");
            }

            for (int j = 0; j < listOfAdded.size(); j++) {
                for (int l = 0; l < listOfAdded.get(j) - k; l++) {
                    System.out.print(0 + " ");
                }
                System.out.print(listOfAdded.get(j) + " ");
                k += listOfAdded.get(j) - k;
            }
            System.out.println();

        }
    }
}
