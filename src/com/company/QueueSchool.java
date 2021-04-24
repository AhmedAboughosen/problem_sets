package com.company;

import java.util.Scanner;

public class QueueSchool {

    //problem from http://codeforces.com/problemset/problem/266/B
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), t = scanner.nextInt();

        String str = scanner.next();

        for (int i = 0; i < t; i++) {
            str = str.replace("BG", "GB");
        }
        System.out.println(str);
    }
}
