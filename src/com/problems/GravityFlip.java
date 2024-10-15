package src.com.problems;

import java.util.Arrays;
import java.util.Scanner;

public class GravityFlip {


    public static void main(String[] args) {
        Solve();
    }

    private static void Solve() {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
