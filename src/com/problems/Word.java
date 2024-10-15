package src.com.problems;

import java.util.Scanner;

public class Word {

    public static void main(String[] args) {
        Solve();
    }

    private static void Solve() {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int numlower = 0;
        int numUpper = 0;

        for (int i = 0; i < s.length(); i++) {

            if (Character.isUpperCase(s.charAt(i))) {
                numUpper++;
            }
            if (Character.isLowerCase(s.charAt(i))) {
                numlower++;
            }
        }

        System.out.println(numlower == numUpper || numlower > numUpper ? s.toLowerCase() : s.toUpperCase());

    }
}
