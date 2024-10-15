package src.com.problems;

import java.util.Scanner;

public class PetyaStrings {

    public static void main(String[] args) {
        Solve();
    }

    private static void Solve(){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine().toLowerCase();
        String s1 = sc.nextLine().toLowerCase();

        for (int i = 0; i < s.length(); i++) {

            if(s.charAt(i) < s1.charAt(i)){
                System.out.println("-1");
                return;
            }
            if(s1.charAt(i) < s.charAt(i)){
                System.out.println("1");
                return;
            }
        }

        System.out.println("0");

    }
}
