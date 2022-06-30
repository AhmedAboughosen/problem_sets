package src.com.problems;

public class RotateImage {

    public static void main(String[] args) {

        rotate(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
    }


    public static void rotate(int[][] matrix) {

        int first = 0;
        int last = matrix.length - 1;

        int firstRowIndexingColumn = 0;
        int indexingRowLastColumn = last;
        int lastRowIndexingColumn = last;
//        int firstRowIndexingColumn = 0;
//        int indexingRowLastColumn = last;
//        int lastRowIndexingColumn = last;
//        int indexingRowFirstColumn = 0;
//        int LastRowIndexingColumnZeroStart = 0;
//
//        for (int i = 0; i < matrix.length; i++) {
//
//            int temp = matrix[firstRowIndexingColumn][last];
//
//            matrix[firstRowIndexingColumn][last] = matrix[firstRowIndexingColumn][first];
//
//            int temp2 = matrix[lastRowIndexingColumn][last];
//
//            matrix[lastRowIndexingColumn][last] = temp;
//
//            int temp3 = matrix[lastRowIndexingColumn][LastRowIndexingColumnZeroStart];
//
//        }
    }
}
