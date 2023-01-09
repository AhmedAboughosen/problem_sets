package src;

import java.util.Scanner;

public class DifferentDifferences {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {


            int k = scanner.nextInt();
            int n = scanner.nextInt();

            int max = n;
            int lastNumber = 2;
            int different = 2;


            System.out.println();

            if( k == n){
                for (int j = 1; j <= k; j++) {
                    System.out.print(j + " ");
                }
                continue;
            }
            k = k -2;
            System.out.print("1 2 ");
            while (k >= 1) {


                if (k == 1) {
                    System.out.print(max + " ");
                    break;
                }

                if ((lastNumber + different) < max && ( max - (lastNumber + different) ) >= k) {
                    System.out.print( (lastNumber + different)+ " ");
                    lastNumber = lastNumber + different;
                    different++;
                    k--;
                    continue;
                }

                System.out.print((lastNumber + 1) + " ");

                lastNumber = lastNumber+1;
                k--;
            }
        }

    }
}
