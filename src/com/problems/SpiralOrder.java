package com.problems;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {

    public static void main(String[] args) {

        List<ArrayList<Integer>> A = new ArrayList<>();
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        ArrayList<Integer> a3 = new ArrayList<>();
        a1.add(1);
        a1.add(2);
        a1.add(3);
        a2.add(1);
        a2.add(2);
        a2.add(3);
        a3.add(1);
        a3.add(2);
        a3.add(3);
        A.add(a1);
        A.add(a2);
        A.add(a3);

        printSpiralOrder(A, 0, 0, 2, 0);
    }

    public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {

        //0 is increment
        // 1 is decrement
        // 2 is down
        // 3 is up


        return null;
    }


    public static void printSpiralOrder(final List<ArrayList<Integer>> A, int i, int j, int size, int currentCase) {


        if(j == size){

        }else {
            System.out.println(A.get(i).get(j));
            printSpiralOrder(A , 0 , ++j , size , currentCase);
        }
    }

}
