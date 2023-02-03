package src.com.problems;

import java.util.Scanner;

public class StandUpComedian {

    //from https://codeforces.com/problemset/problem/1792/B

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {

            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();

            int sum = a + b + c;

            if( a == 0){
                System.out.println(1);
                continue;
            }
            int alic = a;
            int bob = a;

            alic = alic + b;
            bob = bob - b;


            alic = alic - c;
            bob = bob + c;


            if (alic < 0) {
                System.out.println(sum + (alic + 1));
                continue;
            }

            if (bob < 0) {
                System.out.println(sum + (bob + 1));
                continue;
            }


            int maxJoking = a + b + c;

            if (d == 0) {
                System.out.println(maxJoking);
                continue;
            }

            if (maxJoking == 0) {
                System.out.println(1);
                continue;
            }

            int min = Math.min(bob,alic);

            if( min >= d){
                System.out.println(maxJoking + d);
                continue;
            }
            System.out.println(maxJoking + (min + 1));

//            if (alic == 0 && bob == 0) {
//                System.out.println(1);
//                continue;
//            }
//
//            if (alic == 0 || bob == 0) {
//                System.out.println(Math.max(alic, bob));
//                continue;
//            }
//
//            int s = (d - Math.min(alic, bob)) + Math.min(alic, bob);
//            System.out.println(s);

        }
    }
}
