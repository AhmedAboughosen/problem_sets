package src.com.problems;

import java.util.Scanner;

public class BeautifulMatrixA {

    //https://codeforces.com/contest/263/problem/A
    public static void main(String[] args) {
        Solve();
    }

    private static void Solve() {

        Scanner sc = new Scanner(System.in);
        int indexI = 0, indexJ = 0;

        for (int i = 0; i < 5; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int e = sc.nextInt();

            if (a == 1) {
                indexI = 0;
                indexJ = i;
            }
            if (b == 1) {
                indexI = 1;
                indexJ = i;
            }
            if (c == 1) {
                indexI = 2;
                indexJ = i;
            }
            if (d == 1) {
                indexI = 3;
                indexJ = i;
            }
            if (e == 1) {
                indexI = 4;
                indexJ = i;
            }
        }

        System.out.println((Math.abs(indexI -2) + Math.abs(indexJ -2)));
    }
}
