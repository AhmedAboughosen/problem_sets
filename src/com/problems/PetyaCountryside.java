package src.com.problems;

import java.util.Scanner;

public class PetyaCountryside {

    //from https://codeforces.com/contest/66/problem/B

    public static void main(String[] args) {
        Solve();
    }

    public static void Solve() {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }


        int max = 0;
        for (int i = 0; i < n; i++) {

            int j = i - 1;
            int k = i + 1;
            int numJ = arr[i];
            int numK = arr[i];

            int count = 1;
            boolean flagJ = true;
            boolean flagK = true;
            while (true) {

                if (j >= 0 && flagJ && (arr[j] <= numJ)) {
                    count++;
                    numJ = arr[j];
                }

                if (j <= -1  || (arr[j] > numJ)) {
                    flagJ = false;
                }

                if (k <= n - 1 && flagK && (arr[k] <= numK)) {
                    count++;
                    numK = arr[k];
                }

                if (k >= n - 1  || (arr[k] > numK)) {
                    flagK = false;
                }

                if (!flagK && !flagJ) {
                    break;
                }

                j--;
                k++;
            }

            max = Math.max(max, count);
        }

        System.out.println(max);
    }
}
