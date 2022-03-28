package src.com.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PairProgramming {

    //problem from https://codeforces.com/problemset/problem/1512/C

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int k = scanner.nextInt(), n = scanner.nextInt(), m = scanner.nextInt();
            boolean isBreaking = true;

            List<Integer> newList = new ArrayList<>();
            List<Integer> monocarp = new ArrayList<>();
            List<Integer> polycarp = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                monocarp.add(scanner.nextInt());
            }

            for (int j = 0; j < m; j++) {
                polycarp.add(scanner.nextInt());
            }

            int pos1 = 0, pos2 = 0;
            while (pos1 != n || pos2 != m) {
                if (pos1 != n && monocarp.get(pos1) == 0) {
                    newList.add(0);
                    k++;
                    pos1++;
                } else if (pos2 != m && polycarp.get(pos2) == 0) {
                    newList.add(0);
                    k++;
                    pos2++;
                } else if (pos1 != n && monocarp.get(pos1) <= k) {
                    newList.add(monocarp.get(pos1++));
                } else if (pos2 != m && polycarp.get(pos2) <= k) {
                    newList.add(polycarp.get(pos2++));
                } else {
                    System.out.println("-1");
                    isBreaking = false;
                    break;
                }
            }


            if (isBreaking)
                for (int j = 0; j < newList.size(); j++) {
                    System.out.print(newList.get(j) + " ");
                }
            System.out.println();

        }
    }
}

