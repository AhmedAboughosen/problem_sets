package src.com.problems;

import java.util.Scanner;

public class StringCompression {

    /**
     * mplement a method to perform basic string compression using the counts
     * of repeated characters. For example, the string aabcccccaaa would become a2blc5a3.
     * @param args
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        String newStr = "";

        char first = str.charAt(0);
        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if(first == str.charAt(i)){
                ++count;

                continue;
            }
            newStr+= first + "" + count;
            first = str.charAt(i);
            count = 1;
        }
        newStr+= first + "" + count;
        System.out.println(newStr);
    }
}
