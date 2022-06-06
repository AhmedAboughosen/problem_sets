package src.com.problems;

import java.util.Scanner;

public class A_BPalindrome {

    static StringBuffer arrString;
    static int numZ = 0;
    static int numO = 0;
    static int numQ = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt(), b = scanner.nextInt();
            String str = scanner.next();
            arrString = new StringBuffer(str);


            boolean isBreaking = false;

            numZ = 0;
            numO = 0;
            numQ = 0;

            for (int j = 0; j < arrString.length(); j++) {
                if (arrString.charAt(j) == '0') ++numZ;
                else if (arrString.charAt(j) == '1') ++numO;
                else ++numQ;
            }


            numZ = a - numZ;
            numO = b - numO;
            int halfArrLen = ((a + b) + 1) / 2;
            int current;

            for (current = 0; current < halfArrLen; current++) {
                int last = arrString.length() - current - 1;

                if (!update(current, last)) {
                    isBreaking = true;
                    break;
                }

                if (!update(last, current)) {
                    isBreaking = true;
                    break;
                }
            }

            if (isBreaking) {
                System.out.println("-1");
                continue;
            }

            for (current = 0; current < halfArrLen; current++) {

                int last = arrString.length() - current - 1;

                if (current == last) {
                    if (arrString.charAt(current) == '?') {
                        if (numO >= 1) {
                            arrString.setCharAt(current, '1');
                            --numO;
                            continue;
                        }

                        if (numZ >= 1) {
                            arrString.setCharAt(current, '0');
                            --numZ;
                            continue;
                        }

                        isBreaking = true;
                        break;
                    }
                    continue;
                }

                if (arrString.charAt(current) == '?' && arrString.charAt(last) == '?') {

                    if (numZ >= 2) {
                        arrString.setCharAt(current, '0');
                        arrString.setCharAt(last, '0');
                        numZ -= 2;
                        continue;
                    }

                    if (numO >= 2) {
                        arrString.setCharAt(current, '1');
                        arrString.setCharAt(last, '1');
                        numO -= 2;
                        continue;
                    }

                    isBreaking = true;
                    break;
                }

            }


            if (isBreaking) {
                System.out.println("-1");
                continue;
            }


            if (!isPalindrome(arrString.toString())) {
                System.out.println("-1");
            } else {
                numZ = 0;
                numO = 0;
                for (int j = 0; j < arrString.length(); j++) {
                    if (arrString.charAt(j) == '0') ++numZ;
                    else if (arrString.charAt(j) == '1') ++numO;
                }

                if (numZ == a && numO == b) {
                    System.out.println(arrString);
                    continue;
                }
                System.out.println("-1");
            }

        }
    }

    static boolean update(int current, int last) {

        if (arrString.charAt(current) == '?') {
            if (arrString.charAt(last) == '1') {
                arrString.setCharAt(current, '1');
                if (numO <= 0) return false;
                --numO;
            }

            if (arrString.charAt(last) == '0') {
                arrString.setCharAt(current, '0');
                if (numZ <= 0) return false;

                --numZ;
            }
        }

        return true;
    }

    static boolean isPalindrome(String str) {

        // Pointers pointing to the beginning
        // and the end of the string
        int i = 0, j = str.length() - 1;

        // While there are characters to compare
        while (i < j) {

            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j))
                return false;

            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }

        // Given string is a palindrome
        return true;
    }


}
