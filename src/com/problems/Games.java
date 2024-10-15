package src.com.problems;

import java.util.Scanner;

public class Games {

    public static void main(String[] args) {
        solve();
    }

    private static void solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            arr[i][0] = a;
            arr[i][1] = b;
        }

        int count = 0;
        for (int i = 0; i < n; i++) {

            int num = arr[i][0];
            for (int j = 0; j < n; j++) {
                if(num == arr[j][1]){
                   ++count;
                }
            }
        }

        System.out.println(count);
    }
}
