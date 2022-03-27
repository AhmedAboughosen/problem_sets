package src.com.problems;

import java.util.Scanner;

public class AntonAmdDanik {

    //problem from https://codeforces.com/contest/734/problem/A
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        String str = scanner.next();
        int countA = 0;
        int countB = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A') ++countA;
            else ++countB;
        }

        System.out.println(countA == countB ? "Friendship" : countA > countB ? "Anton" : "Danik");
    }
}
