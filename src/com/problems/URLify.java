package src.com.problems;

import java.util.Scanner;

public class URLify {


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
