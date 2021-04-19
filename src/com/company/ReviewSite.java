package com.company;

import java.util.Scanner;

public class ReviewSite {

    // problem from http://codeforces.com/contest/1511/problem/A
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {

            int n = scanner.nextInt();
            int upVote = 0;
            for (int j = 0; j < n; j++) {
                int vote = scanner.nextInt();
                if (vote == 1 || vote == 3) {
                    upVote++;
                }
            }
            System.out.println(upVote);
        }
    }
}
