package com.problems.greedyAlgorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class InterestingStory {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();

            HashMap<Character, Integer> map = new HashMap<>();
            List<String> stringList = new ArrayList<>();
            List<String> unHandledList = new ArrayList<>();
            char[] chars = new char[]{'a', 'b', 'c', 'd', 'e'};

            map.put(chars[0], 0);
            map.put(chars[1], 0);
            map.put(chars[2], 0);
            map.put(chars[3], 0);
            map.put(chars[4], 0);

            for (int j = 0; j < n; j++) {
                String text = scanner.next();
                for (int k = 0; k < text.length(); k++) {
                    map.put(text.charAt(k), map.get(text.charAt(k)) + 1);
                }
                stringList.add(text);
            }

            if (map.get('a') > (map.get('b') + map.get('c') + map.get('d') + map.get('e')) ||
                    map.get('b') > (map.get('a') + map.get('c') + map.get('d') + map.get('e')) ||
                    map.get('c') > (map.get('a') + map.get('b') + map.get('d') + map.get('e')) ||
                    map.get('d') > (map.get('a') + map.get('b') + map.get('c') + map.get('e')) ||
                    map.get('e') > (map.get('a') + map.get('b') + map.get('c') + map.get('d'))) {
                System.out.println(stringList.size());
                continue;
            }
        }
    }
}

