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


    // Maximum length of string
    // after modifications.
    static int MAX = 1000;

    static char[] replaceSpaces(char[] str)
    {

        // count spaces and find current length
        int space_count = 0, i = 0;
        for (i = 0; i < str.length; i++)
            if (str[i] == ' ')
                space_count++;

        // count spaces and find current length
        while (str[i - 1] == ' ')
        {
            space_count--;
            i--;
        }

        // Find new length.
        int new_length = i + space_count * 2;

        // New length must be smaller than length
        // of string provided.
        if (new_length > MAX)
            return str;

        // Start filling character from end
        int index = new_length - 1;

        char[] old_str = str;
        str = new char[new_length];

        // Fill rest of the string from end
        for (int j = i - 1; j >= 0; j--)
        {

            // inserts %20 in place of space
            if (old_str[j] == ' ')
            {
                str[index] = '0';
                str[index - 1] = '2';
                str[index - 2] = '%';
                index = index - 3;
            }

            else
            {
                str[index] = old_str[j];
                index--;
            }
        }
        return str;
    }


}
