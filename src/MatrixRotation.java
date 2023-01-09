package src;

import java.util.Scanner;

public class MatrixRotation {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {

            int first = scanner.nextInt();
            int second = scanner.nextInt();
            int third = scanner.nextInt();
            int fouth = scanner.nextInt();

            int count = 1;

            if (first < second && first < third && second < fouth) {
                System.out.println("Yes");
                continue;
            }

            int temp1 = first;
            first = third;

            int temp2 = second;
            second = temp1;

            int temp4 = fouth;
            fouth = temp2;

            third = temp4;

            if (first < second && first < third && second < fouth) {
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

//            if (first < second && third > fouth || third < fouth && first > second || first < second && third < fouth) {
//                System.out.println("No");
//                continue;
//            }
//
//            System.out.println("Yes");


        }
    }
}
/*
 * 72 77
 * 70 92
 **/