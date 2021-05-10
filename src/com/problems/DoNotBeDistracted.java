package com.problems;

import java.util.HashMap;
import java.util.Scanner;

public class DoNotBeDistracted {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();


        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            boolean re = true;
            String str = scanner.next();
            HashMap<Character, Integer> map = new HashMap<>();

            map.put(str.charAt(0), 1);
            for (int j = 1; j < n; j++) {
                if (str.charAt(j - 1) != str.charAt(j)) {
                    if (map.containsKey(str.charAt(j))) {
                        re = false;
                        break;
                    }
                    map.put(str.charAt(j), 1);
                }
            }
            if (n == 1) {
                System.out.println("YES");
                continue;
            }
            System.out.println((re) ? "YES" : "NO");
        }
    }
}
