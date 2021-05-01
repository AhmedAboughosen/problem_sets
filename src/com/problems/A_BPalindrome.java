package com.problems;

import java.util.Scanner;

public class A_BPalindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        outerLoop:
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt(), b = scanner.nextInt();
            String str = scanner.next();
            char arrString[] = str.toCharArray();
            for (int j = 0; j < str.length(); j++) {
                int k = str.length() - j - 1;
                if (arrString[i] != '?') {
                    if (arrString[k] == '?') {
                        arrString[k] = arrString[i];
                    } else if (arrString[i] != arrString[k]) {
                        System.out.println(-1);
                        continue outerLoop;
                    }
                }
            }

            for (int j = 0; j < arrString.length; j++) {
                System.out.print(arrString[j]);
            }

//            int[] counting = getNumberOfOneAndZero(str);
//            int zeros = counting[1], ones = counting[0], question = counting[2];
//
//            if (question == 0) {
//                if (checkIfStringIsPalindrome(str)) {
//                    if (zeros == a && ones == b) {
//                        printString(str);
//                        continue;
//                    }
//                }
//                System.out.println(-1);
//                continue;
//            }
//
//
//            int remainingZeros = (a - zeros);
//            int remainingOnes = (b - ones);
//
//
//            if (remainingZeros < 0 || remainingOnes < 0) {
//                System.out.println(-1);
//                continue;
//            }
//
//            char arrString[] = str.toCharArray();
//            int firstIndex = 0, lastIndex = str.length() - 1;
//
//            while (firstIndex < lastIndex) {
//
//                if (arrString[firstIndex] == '1') {
//                    if (arrString[lastIndex] == '0') {
//                        System.out.println(-1);
//                        continue outerLoop;
//                    }
//
//                    if (arrString[lastIndex] == '?') {
//                        arrString[lastIndex] = '1';
//                        remainingOnes--;
//                    }
//
//                    firstIndex++;
//                    lastIndex--;
//                    continue;
//                }
//
//                if (arrString[firstIndex] == '0') {
//                    if (arrString[(lastIndex)] == '1') {
//                        System.out.println(-1);
//                        continue outerLoop;
//                    }
//
//                    if (arrString[(lastIndex)] == '?') {
//                        arrString[lastIndex] = '0';
//                        remainingZeros--;
//                    }
//                    firstIndex++;
//                    lastIndex--;
//                    continue;
//                }
//
//                if (arrString[firstIndex] == '?') {
//                    if (arrString[lastIndex] == '1') {
//                        arrString[firstIndex] = '1';
//                        remainingOnes--;
//                    }
//
//                    if (arrString[(lastIndex)] == '0') {
//                        arrString[firstIndex] = '0';
//                        remainingZeros--;
//                    }
//
//                    if (arrString[lastIndex] == '?') {
//
//                        if (remainingZeros >= remainingOnes) {
//                            arrString[firstIndex] = '0';
//                            arrString[lastIndex] = '0';
//                            remainingZeros -= 2;
//                        } else {
//                            arrString[firstIndex] = '1';
//                            arrString[lastIndex] = '1';
//                            remainingOnes -= 2;
//                        }
//                    }
//                    firstIndex++;
//                    lastIndex--;
//                }
//
//            }
//
//            if (firstIndex == lastIndex) {
//                if (arrString[firstIndex] == '?') {
//                    if (remainingZeros >= remainingOnes) {
//                        arrString[firstIndex] = '0';
//                        remainingZeros--;
//                    } else {
//                        arrString[firstIndex] = '1';
//                        remainingOnes--;
//                    }
//                }
//            }
//
//            if (remainingZeros != 0 || remainingOnes != 0) {
//                System.out.println(-1);
//                continue;
//            }
//
//            for (int j = 0; j < arrString.length; j++) {
//                System.out.print(arrString[j]);
//            }
//            System.out.println();
        }
    }

    static void printString(String str) {
        for (int j = 0; j < str.length(); j++) {
            System.out.print(str.charAt(j));
        }
        System.out.println();
    }

    static boolean checkIfStringIsPalindrome(String str) {
        int firstIndex = 0, lastIndex = str.length() - 1;
        while (firstIndex < lastIndex) {
            if (str.charAt(firstIndex) != str.charAt(lastIndex)) {
                return false;
            }
            firstIndex++;
            lastIndex--;
        }


        return true;
    }

    static int[] getNumberOfOneAndZero(String str) {
        int numberOfOnes = 0, numberOfZeros = 0, numberOfQuestion = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') ++numberOfZeros;
            if (str.charAt(i) == '1') ++numberOfOnes;
            if (str.charAt(i) == '?') ++numberOfQuestion;
        }


        return new int[]{numberOfOnes, numberOfZeros, numberOfQuestion};
    }

}
