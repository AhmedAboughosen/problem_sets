package src.com.problems;

import java.util.HashMap;
import java.util.Scanner;

public class Notepad {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {

            int c = scanner.nextInt();

            String str = scanner.next();

            HashMap<String, Integer> map = new HashMap<>();
            boolean isYes = false;
            for (int j = 0; j < str.length() - 1; j++) {

                String twoChar = str.charAt(j) + "" + str.charAt(j + 1);
                if (map.containsKey(twoChar)) {
                    isYes = true;
                    break;
                }
                if (twoChar.charAt(0) == twoChar.charAt(1) &&  (j + 2 < str.length()) && twoChar.charAt(1) == str.charAt(j + 2)) {
                    j++;
                }
                map.put(twoChar, 1);
            }

            System.out.println(isYes ? "YES" : "NO");
        }
    }
}
