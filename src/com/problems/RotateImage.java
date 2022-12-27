package src.com.problems;

public class RotateImage {

    public static void main(String[] args) {

        int arr[][] = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int arr2[][] = new int[][] {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};

        rotate(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, 0, arr.length - 1);

        rotate(new int[][] {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}}, 0, arr2.length - 1);
    }


    public static void rotate(int[][] matrix, int x, int y) {

        int[] firstPath = new int[]{y, x};
        int[] secondPath = new int[]{x, x};
        int[] thirdPath = new int[]{x, y};
        int[] fourthPath = new int[]{y, y};


        if(y <= 1){
            System.out.println("---------------------");

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();

            }
            return;
        }
        int size = y - x ;
        for (int i = 0; i < size; i++) {

            int temp1 = matrix[firstPath[0]][firstPath[1]];
            int temp2 = matrix[secondPath[0]][secondPath[1]];
            int temp3 = matrix[thirdPath[0]][thirdPath[1]];
            int temp4 = matrix[fourthPath[0]][fourthPath[1]];

            matrix[secondPath[0]][secondPath[1]] = temp1;
            matrix[thirdPath[0]][thirdPath[1]] = temp2;
            matrix[fourthPath[0]][fourthPath[1]] = temp3;
            matrix[firstPath[0]][firstPath[1]] = temp4;

            firstPath = new int[]{firstPath[0] - 1, firstPath[1]};
            secondPath = new int[]{secondPath[0], secondPath[1] + 1};
            thirdPath = new int[]{thirdPath[0] + 1, thirdPath[1]};
            fourthPath = new int[]{fourthPath[0], fourthPath[1] - 1};
        }


        rotate(matrix, x + 1, y - 1);
    }
}
