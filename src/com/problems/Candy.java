package src.com.problems;

import java.util.Arrays;

public class Candy {

    public static void main(String[] args) {

        candy(new int[]{1,2,87,87,87,2,1});
    }

    public static int candy(int[] ratings) {


        Arrays.sort(ratings);

        int sum = ratings.length;

        for (int i = 1; i < ratings.length; i++) {

            if(ratings[i-1] != ratings[i])++sum;
        }


        return sum;
    }

}
