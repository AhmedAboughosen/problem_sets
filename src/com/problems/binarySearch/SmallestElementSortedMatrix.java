package src.com.problems.binarySearch;

public class SmallestElementSortedMatrix {



    //https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/
    public static void main(String[] args) {

       System.out.println( kthSmallest(new int[][]{{1,2},{1,3}}, 3));
    }

    public static int kthSmallest(int[][] matrix, int k) {

        int[] filled = new int[matrix.length];
        int[][] indeices = new int[][]{{0, 0}};

        int count = 0;
        while (true) {

            int min = Integer.MAX_VALUE;
            int index = 0;

            for (int i = 0; i < matrix.length; i++) {


                if ((filled[i] <= matrix.length-1) && min > matrix[i][filled[i]]) {
                    min = matrix[i][filled[i]];
                    index = i;
                }
            }

            ++count;

            filled[index] = filled[index] + 1;
            if(count == k){

               return matrix[index][filled[index] - 1];

            }
        }

    }
}
