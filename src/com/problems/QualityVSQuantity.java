package com.problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class QualityVSQuantity {


    // problem from http://codeforces.com/contest/1646/problem/B
    public static void main(String[] args) throws Exception {

        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(stdin.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(stdin.readLine());
            ArrayList<Long> list = new ArrayList<>();
            StringTokenizer tok = new StringTokenizer(stdin.readLine());
            for (int j = 0; j < n; j++)
                list.add(Long.parseLong(tok.nextToken()));


            Collections.sort(list);

            long sumRight = 0, sumLeft = list.get(0);

            for (int start = 1, end = n - 1; start < end; ++start, --end) {
                sumRight += list.get(end);
                sumLeft += list.get(start);
                if (sumLeft < sumRight) {
                    break;
                }
            }

            System.out.println(sumLeft < sumRight ? "YES" : "NO");

        }
    }
}
