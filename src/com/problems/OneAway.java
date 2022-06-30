package src.com.problems;

import java.util.Scanner;

public class OneAway {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String originalStr = scanner.next();
        String editedStr = scanner.next();


        int currentIndex = 0;

        //removed
        if (originalStr.length() > editedStr.length()) {
            boolean firstCheck = false;
            boolean isRepeated = false;

            for (int i = 0; i < originalStr.length(); i++) {

                char chFromOriginal = originalStr.charAt(i);
                char chFromEdited = currentIndex < editedStr.length() ? editedStr.charAt(currentIndex) : '1';
                if (chFromOriginal == chFromEdited) {
                    ++currentIndex;
                    continue;
                }

                if (firstCheck) {
                    isRepeated = true;
                    break;
                }

                firstCheck = true;
            }

            System.out.println(!isRepeated);

            return;
        }

        if (originalStr.length() == editedStr.length()) {
            int numberOfChanges = 0;

            for (int i = 0; i < originalStr.length(); i++) {

                char chFromOriginal = originalStr.charAt(i);
                char chFromEdited = editedStr.charAt(i);
                if (chFromOriginal != chFromEdited) {
                    ++numberOfChanges;
                }

                if (numberOfChanges >= 2) {
                    System.out.println(false);
                    return;
                }
            }

            System.out.println(true);

            return;
        }


        for (int i = 0; i < originalStr.length(); i++) {

            char chFromOriginal = originalStr.charAt(i);
            char chFromEdited = editedStr.charAt(i);
            if (chFromOriginal != chFromEdited) {
                System.out.println(false);
                return;
            }

        }

        System.out.println(editedStr.length() - originalStr.length() == 1);

    }
}
