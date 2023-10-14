package src.com.problems;

import java.util.Arrays;
import java.util.Scanner;

public class IsUnique {

    public static void main(String[] args) {

        isUniqueChars("abcaoxo");
//        Scanner input = new Scanner(System.in);
//
//
//        char[] text = input.next().toLowerCase().toCharArray();
//
//        // Sorting temp array using
//        Arrays.sort(text);
//
//        for (int i = 0; i < text.length - 1; i++) {
//
//            if (text[i] == text[i + 1]) {
//                System.out.println(false);
//                return;
//            }
//        }
//        System.out.println(true);
    }

   public static boolean isUniqueChars(String str) {
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            int s = (1 << val);
            int c = (checker & (1 << val));

            if ((checker & (1 << val)) > 0) {
                return false;
            }
            checker |= (1 << val);
        }
        return true;
    }
}
