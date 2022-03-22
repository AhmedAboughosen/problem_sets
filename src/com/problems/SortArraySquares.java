package com.problems;

public class SortArraySquares {


    private static int outputedArray[];
    private static int current = 0;

    public static void main(String[] args) {

        solve(new int[]{-963, -894, -810, -712, -684, -630, -352, -277, -271, -243, -222, -141, -58, 35, 40, 264, 446, 529, 741, 805, 842, 890});
    }

    public static int[] solve(int[] A) {

        outputedArray = new int[A.length];


        //get last negative number :
        int negativeIndex = -1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] >= 0) {
                negativeIndex = i - 1;
                break;
            }

        }

        for (int i = 0; i < A.length; i++) {
            A[i] = A[i] * A[i];
        }

        solve(negativeIndex, negativeIndex + 1, A);

        return outputedArray;
    }

    public static void solve(int negIndex, int posIndex, int[] A) {


        if (negIndex < 0 && posIndex >= A.length) return;

        if (posIndex >= A.length) {
            outputedArray[current] = A[negIndex];
            ++current;
            solve(--negIndex, posIndex, A);
            return;
        }


        if (negIndex <= 0) {
            outputedArray[current] = A[posIndex];
            current++;
            solve(negIndex, ++posIndex, A);
            return;
        }

        if (A[negIndex] < A[posIndex]) {
            outputedArray[current] = A[negIndex];
            ++current;
            solve(--negIndex, posIndex, A);
        } else {
            outputedArray[current] = A[posIndex];
            current++;
            solve(negIndex, ++posIndex, A);
        }
    }

}
