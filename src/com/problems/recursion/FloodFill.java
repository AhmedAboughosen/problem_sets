package com.problems.recursion;

public class FloodFill {

    public static void main(String[] args) {

//        char arr[][] = {{'.', '.', 'X', '.', }, {'.', 'X', '.', 'X'}, {'.', '.', 'X', '.'}};
        char arr[][] = {{'.', '.',  '.', 'X', '.', }, {'.', '.', 'X', '.', '.'}, {'.', 'X', '.', '.', '.'}, {'X', '.', '.', '.', '.'}};

        int n = 5;
        int m = 4;
        floodFill(arr, 0, 1, n, m);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }


    private static void floodFill(char arr[][], int r, int c, int n, int m) {

        if (r < 0 || r >= m || c < 0 || c >= n) return;


        if (arr[r][c] == 'N') return;
        if (arr[r][c] == 'X') return;

        arr[r][c] = 'N';
        floodFill(arr, r, c + 1, n, m);
        floodFill(arr, r, c - 1, n, m);
        floodFill(arr, r + 1, c, n, m);
        floodFill(arr, r - 1, c, n, m);

    }

}
