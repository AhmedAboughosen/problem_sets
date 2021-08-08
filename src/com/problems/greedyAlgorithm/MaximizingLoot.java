package com.problems.greedyAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaximizingLoot {

    /*
    Task. The goal of this code problem is to implement an algorithm for the fractional knapsack problem.

Input Format. The frst line of the input contains the number n of items and the capacity W of a knapsack. The next n lines defne the values and weights of the items. The i-th line contains integers vi and wi—the value and the weight of i-th item, respectively

Constraints. 1 ≤ n ≤ 10^3, 0 ≤ W ≤ 2 · 10^6; 0 ≤ vi ≤ 2 · 10^6, 0 < wi ≤ 2 · 10^6 for all 1 ≤ i ≤ n. All the numbers are integers.

Output Format. Output the maximal value of fractions of items that fit into the knapsack. The absolute value of the difference between the answer of your program and the optimal value should be at most 10−3. To ensure this, output your answer with at least four digits after the decimal point (otherwise your answer, while being computed correctly,
can turn out to be wrong because of rounding issues).
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int knapsack = scanner.nextInt();
        int n = scanner.nextInt();
        ArrayList<Item> items = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            items.add(new Item(scanner.nextInt(), scanner.nextInt()));
        }

        Collections.sort(items);
        int totalAmount = 0;
        for (int i = 0; i < n; i++) {

            if (items.get(i).weight < knapsack) {
                totalAmount += (items.get(i).value);
                knapsack = knapsack - items.get(i).weight;
                continue;
            }

            if (items.get(i).weight >= knapsack) {
                totalAmount += ((items.get(i).value / items.get(i).weight) * knapsack);
                break;
            }
        }

        System.out.println(totalAmount);
    }


    static class Item implements Comparable<Item> {
        int value, weight;

        public Item(int value, int weight) {
            this.value = value;
            this.weight = weight;
        }

        @Override
        public int compareTo(Item o) {
            return o.value / o.weight - this.value / this.weight;
        }
    }
}
