package src.com.problems;

import java.util.Arrays;
import java.util.Scanner;

public class IsUnique {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        char[] text = input.next().toLowerCase().toCharArray();

        // Sorting temp array using
        Arrays.sort(text);

        for (int i = 0; i < text.length - 1; i++) {

            if (text[i] == text[i + 1]) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
