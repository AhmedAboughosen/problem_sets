package src.com.problems;

import java.util.Scanner;

public class CardTrick {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {

            int[] cards = new int[scanner.nextInt()];

            for (int j = 0; j < cards.length; j++) {
                cards[j] = scanner.nextInt();
            }
            int[] shuffles = new int[scanner.nextInt()];

            for (int j = 0; j < shuffles.length; j++) {
                shuffles[j] = scanner.nextInt();
            }

            int startIndex = 0;

            for (int j = 0; j < shuffles.length; j++) {
                startIndex = Math.floorMod(startIndex + shuffles[j], cards.length);
            }

            System.out.println( cards[startIndex]);
        }
    }
}
