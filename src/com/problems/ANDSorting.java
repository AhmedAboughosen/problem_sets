package src.com.problems;

import java.util.Scanner;

public class ANDSorting {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int res = -1;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] != i) {
                    res &= a[i] ;
                }
            }



            System.out.println(res);
        }
    }

}
