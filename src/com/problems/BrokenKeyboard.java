package src.com.problems;

import java.util.Scanner;

public class BrokenKeyboard {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {


            int n = scanner.nextInt();
            String str = scanner.next();

            if(n == 1){
                System.out.println("Yes");
                continue;
            }
            if (n == 2 ) {
                System.out.println("NO");
                continue;
            }

            boolean isNo = false;
            for (int j = 1; j < n; j = j + 3) {


                if(j + 1 >= n){
                    isNo = true;
                    break;
                }

                if ( str.charAt(j) != str.charAt(j + 1)) {
                    isNo = true;
                    break;
                }
            }

            System.out.println(isNo ? "NO" : "YES");

        }
    }
}
