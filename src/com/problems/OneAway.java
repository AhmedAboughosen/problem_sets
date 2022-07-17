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

            boolean isMissing = false;

            if (editedStr.length() + 1 != originalStr.length()) {
                System.out.println(false);
                return;
            }


            for (int i = 0; i < editedStr.length(); i++) {

                if (editedStr.charAt(i) == originalStr.charAt(currentIndex)) {
                    currentIndex++;
                    continue;
                }

                if(isMissing){
                    System.out.println(false);
                    return;
                }

                isMissing = true;
                currentIndex++;
                --i;

            }
            System.out.println(true);
            return;

        }

        if (originalStr.length() == editedStr.length()) {
            int numberOfChanges = 0;

            for (int i = 0; i < originalStr.length() && numberOfChanges <= 1; i++) {

                char chFromOriginal = originalStr.charAt(i);
                char chFromEdited = editedStr.charAt(i);
                if (chFromOriginal != chFromEdited) {
                    ++numberOfChanges;
                }
            }

            System.out.println(numberOfChanges < 2);

            return;
        }


        if (originalStr.length()+1 != editedStr.length()){
            System.out.println(false);
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
