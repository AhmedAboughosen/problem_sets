package src.com.problems.recursion;

public class GridSum {


    public static void main(String[] args) {


        System.out.println(GridSum.maxPath(new int[][]{{1, 7, 8}, {2, 10, 11}, {20, 5, 9}}, 0, 0));
    }


    public static int maxPath(int[][] arr, int col, int row) {

        if (col >= arr.length && row >= arr.length) return arr[0][0];

        int right = 0;
        if (row + 1 < arr.length) {
            right = arr[col][row + 1];
        }

        int down = 0;
        if (col + 1 < arr.length) {
            down = arr[col + 1][row];
        }

        int diagonal = 0;
        if (col + 1 < arr.length && row + 1 < arr.length) {
            diagonal = arr[col + 1][row + 1];
        }


        if (right > down && right > diagonal) {
            return right + maxPath(arr, col, row + 1);
        }


        if (down > row && down > diagonal) {
            return down + maxPath(arr, col + 1, row);
        }

        return diagonal + maxPath(arr, col + 1, row + 1);

    }
}
