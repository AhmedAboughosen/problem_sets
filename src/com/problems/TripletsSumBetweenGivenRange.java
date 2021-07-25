package com.problems;

import java.util.ArrayList;
import java.util.Collections;

public class TripletsSumBetweenGivenRange {


    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("0.6");
        list.add("0.7");
        list.add("0.8");
        list.add("1.2");
        list.add("0.4");
        System.out.println(solve(list));
    }


    //'0.1 0.6 0.6' 0.8 1.2
    public static int solve(ArrayList<String> A) {

        Collections.sort(A);

        for (int i = A.size() - 1, j = 0; i >= 0; i--) {

            double value = ((Double.parseDouble(A.get(i)) + Double.parseDouble(A.get(j)) + Double.parseDouble(A.get(j + 1))));
            if (value > 1 && value < 2) {
                return 1;
            }

        }


        return 0;
    }
}
