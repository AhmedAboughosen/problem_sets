package src.com.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PalindromicNumbers {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            String number = scanner.next();

            int firstDigit = Character.getNumericValue((number).charAt(0));

            if (firstDigit == 9) {

                List<Integer> integerList = new ArrayList<>();
                List<Integer> result = new ArrayList<>();

                int rem = 0;

                for (int j = n - 1; j >= 1; j--) {
                    int num = Character.getNumericValue((number).charAt(j));

                    integerList.add((10 - (num + rem)));

                    rem = 1;
                }
                rem = 0;
                for (int j = 0; j < integerList.size(); j++) {
                    int value = (integerList.get(j) + 1) + rem;

                    if (value > 9) {
                        rem = 1;
                        result.add(Character.getNumericValue((value + "").charAt(1)));
                        continue;
                    }

                    rem = 0;
                    result.add(value);
                }

                result.add(rem + 1);

                for (int j = result.size() - 1; j >= 0; j--) {
                    System.out.print(result.get(j));
                }
                System.out.println();

                continue;
            }

            List<Integer> result = new ArrayList<>();


            for (int j = n - 1; j >= 0; j--) {
                int num = Character.getNumericValue((number).charAt(j));

                result.add((Math.abs(9 - num)));
            }

            for (int j = result.size() - 1; j >= 0; j--) {
                System.out.print(result.get(j));
            }
            System.out.println();


        }
    }
}
