package com.problems.recursion;

public class StartToEndUsingRecursion {

    public static void main(String[] args) {

        char arr[][] = {{'.', 'S', 'X', '.', '.',}, {'.', '.', 'X', '.', 'E',}, {'.', '.', '.', '.', 'X',}, {'X', '.', 'X', 'X', '.',}};

        int n  = 5 ;
        int m  = 4 ;
        System.out.println(statToEnd(arr, 0, 1, n , m));
    }


    public static boolean statToEnd(char arr[][], int r, int c,int n , int m) {

        if (r < 0 || r >= m  || c < 0 || c >= n) return false;


        if (arr[r][c] == 'N') return false;
        if (arr[r][c] == 'E') return true;
        if (arr[r][c] == 'X') return false;

        boolean path1;
        boolean path2;
        boolean path3;
        boolean path4;

        arr[r][c] = 'N';
        path1 = statToEnd(arr, r, c + 1,n,m);
        path2 = statToEnd(arr, r, c - 1,n,m);
        path3 = statToEnd(arr, r + 1, c,n,m);
        path4 = statToEnd(arr, r - 1, c,n,m);

        return path1 || path2 || path3 || path4;
    }


}
