package src.com.problems;

import java.util.Scanner;

public class ChoosingCubes {

    public static void main(String[] args) {

        Solve();
    }

    private static void Solve() {
        Scanner scanner = new Scanner(System.in);


        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {

            int n = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();

            int[] cubes = new int[n];

            for (int j = 0; j < cubes.length; j++) {
                cubes[j] = scanner.nextInt();
            }
            int chosenCube = cubes[b - 1];

            if (b <= c) {
                System.out.println("MAYBE");
                continue;
            }

            boolean isYes = false;


            int numberOfGreaterThanChosen = 0;

            for (int j = cubes.length - 1; j >= 0; j--) {

                if (chosenCube >= cubes[j] && j != b - 1) {
                    numberOfGreaterThanChosen++;
                }
            }

          

            System.out.println("No");

        }
    }
}
