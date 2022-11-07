package src.com.problems;

import java.util.Scanner;

public class URLify {

    /**
     * URLify: Write a method to replace all spaces in a string with '%20'. You may assume that the string
     * has sufficient space at the end to hold the additional characters, and that you are given the "true"
     * length of the string. (Note: If implementing in Java, please use a character array so that you can
     * perform this operation in place.)
     * EXAMPLE
     * Input: "Mr John Smith ", 13
     * Output: "Mr%20John%20Smith"
     * @param args
     */

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        StringBuilder text = new StringBuilder(scanner.nextLine());

        int length = scanner.nextInt();

        int startIndex = -1;
        for (int i = 0; i < length; i++) {


            if (text.charAt(i) == ' ' && startIndex == -1) {
                startIndex = i;
            }

            if (text.charAt(i) != ' ' && startIndex >= 0) {
                text.replace(startIndex, i, "%20");
                startIndex = -1;
            }
        }

        System.out.println(text);
    }


}
