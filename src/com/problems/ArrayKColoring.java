package src.com.problems;

import java.util.Scanner;

public class ArrayKColoring {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(), k = scanner.nextInt();

        int c = k;

        int[] arr = new int[n];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            if(arr[i] > k){
                --c;
            }
        }

        if(c <= 0 || c == k){
            System.out.println("No");
            return;
        }

        System.out.println("YES");

        for (int i = 0; i < n; i++) {

        }
    }
}
