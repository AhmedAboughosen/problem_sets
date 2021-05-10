package com.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RepeatMissingNumberArray {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 1; i <= 10000000; i++) {
            arrayList.add(i);
        }
        ArrayList<Integer> arrayList1 = repeatedNumber(arrayList);
        System.out.println(arrayList1.get(0) + " " + arrayList1.get(1));
    }

    public static ArrayList<Integer> repeatedNumber(final List<Integer> A) {

        HashMap<Integer, Boolean> numberMap
                = new HashMap<>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int max = A.size();
        int repeat = 0;
        int missing = 0;
        for (Integer i : A) {

            if (numberMap.get(i) == null) {
                numberMap.put(i, true);
            } else {
                repeat = i;
            }
        }

        for (int i = 1; i <= max; i++) {
            if (numberMap.get(i) == null) {
                missing = i;
            }
        }

        arrayList.add(repeat);
        arrayList.add(missing);

        return arrayList;
    }

}
