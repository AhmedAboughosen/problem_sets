package com.problems;

import java.util.HashMap;
import java.util.Scanner;

public class B1_Wonderful_Coloring {


    // problem from https://codeforces.com/contest/1551/problem/B1
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            String text = scanner.next();
            HashMap<Character, Integer> map = new HashMap<>();
            int oneCount = 0;
            int moreThanOneCount = 0;
            for (int j = 0; j < text.length(); j++) {
                if (map.containsKey(text.charAt(j))) {
                    map.put(text.charAt(j), map.get(text.charAt(j)) + 1);
                } else {
                    map.put(text.charAt(j), 1);
                }
            }

            for (Character character : map.keySet()) {
                if (map.get(character) == 1) {
                    ++oneCount;
                    continue;
                }
                ++moreThanOneCount;
            }


            System.out.println((oneCount / 2) + moreThanOneCount);
        }
    }
}
