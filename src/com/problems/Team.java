package src.com.problems;

import java.util.Scanner;

public class Team {

    //problem from https://codeforces.com/contest/231/problem/A
    public static void main(String[] args) {

        Team.Solve();
    }

    public static void Solve() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int out = 0;
        for (int i = 0; i < n; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int count = 0;
            if (a == 1) ++count;
            if (b == 1) ++count;
            if (c == 1) ++count;

            if (count >= 2) {
                out++;
            }
        }

        System.out.println(out);
    }
}
