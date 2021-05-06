package com.problems;

import java.util.Scanner;

public class BearStrings {


    // problem from https://codeforces.com/contest/385/problem/B
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {

            int startIndex = str.indexOf("bear", i);

            if(startIndex == -1){
                break;
            }
            startIndex += 3;

            sum = sum + (str.length() - startIndex);
        }

        System.out.println(sum);
    }
}
