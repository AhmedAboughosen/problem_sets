package src.com.problems;

import java.util.Scanner;

public class ABPalindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();


        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt(), b = scanner.nextInt();
            StringBuilder str = new StringBuilder(scanner.next());
            int[] counting = getNumberOfOneAndZero(str);
            int zeros = counting[1], ones = counting[0], question = counting[2];

            for (int first = 0, last = str.length() - 1; first < last; ++first, --last) {

                if (str.charAt(first) == '?' && str.charAt(last) != '?') {
                    question--;
                    zeros += (str.charAt(last) == '0') ? 1 : 0;
                    ones += (str.charAt(last) == '1') ? 1 : 0;
                    str.setCharAt(first, str.charAt(last));
                }
                if (str.charAt(last) == '?' && str.charAt(first) != '?') {
                    question--;
                    zeros += (str.charAt(first) == '0') ? 1 : 0;
                    ones += (str.charAt(first) == '1') ? 1 : 0;
                    str.setCharAt(last, str.charAt(first));
                }
            }


            int sumZ = a - zeros;
            int sumO = b - ones;

            if ((Math.floorMod(sumZ, 2) != 0) || Math.floorMod(sumO, 2) != 0) {
                System.out.println(-1);
                continue;
            }

            if (sumZ + sumO != question) {
                System.out.println(-1);
                continue;
            }

            for (int first = 0, last = str.length() - 1; first <= last; ++first, --last) {
                if (str.charAt(first) == '?') {
                    if (sumZ > sumO) {
                        sumZ -= 2;
                        str.setCharAt(first, '0');
                        str.setCharAt(last, '0');
                    } else {
                        sumO -= 2;
                        str.setCharAt(first, '1');
                        str.setCharAt(last, '1');
                    }
                }
            }

            System.out.println(str);
//            for (int j = 0, k = str.length() - 1; j <= k; j++, k--) {
//
//                if (str.charAt(j) == '0') {
//                    if (str.charAt(k) == '1') {
//                        System.out.print(-1);
//                        break;
//                    }
//                    if (str.charAt(k) == '?') {
//                        zeros++;
//                        question--;
//                        str.setCharAt(k, '0');
//                    }
//                    continue;
//
//                }
//
//                if (str.charAt(j) == '1') {
//                    if (str.charAt(k) == '0') {
//                        System.out.print(-1);
//                        break;
//                    }
//                    if (str.charAt(k) == '?') {
//                        ones++;
//                        question--;
//                        str.setCharAt(k, '1');
//                    }
//                    continue;
//                }
//
//                if (str.charAt(j) == '?') {
//                    if (str.charAt(k) == '0') {
//                        zeros++;
//                        question--;
//                        str.setCharAt(j, '0');
//                        continue;
//                    }
//                    if (str.charAt(k) == '1') {
//                        ones++;
//                        question--;
//                        str.setCharAt(j, '1');
//                        continue;
//                    }
//
//                    if (str.charAt(k) == '?') {
//                        ones++;
//                        question--;
//                        str.setCharAt(k, '1');
//                    }
//                }
//            }
        }
    }

    static int[] getNumberOfOneAndZero(StringBuilder str) {
        int numberOfOnes = 0, numberOfZeros = 0, numberOfQuestion = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') ++numberOfZeros;
            if (str.charAt(i) == '1') ++numberOfOnes;
            if (str.charAt(i) == '?') ++numberOfQuestion;
        }


        return new int[]{numberOfOnes, numberOfZeros, numberOfQuestion};
    }
}
