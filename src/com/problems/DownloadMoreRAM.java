package com.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DownloadMoreRAM {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(), k = scanner.nextInt();

            List<Ram> ramList = new ArrayList<Ram>();

            int count = k;
            for (int j = 0; j < n; j++) {
                ramList.add(new Ram(scanner.nextInt(), 0));
            }

            for (int j = 0; j < n; j++) {
                Ram ram = ramList.get(j);
                ram.setB(scanner.nextInt());
            }

            Collections.sort(ramList);

            for (int j = 0; j < n; j++) {

                if (ramList.get(j).getA() <= count) {
                    count = count + ramList.get(j).getB();
                } else {
                    break;
                }
            }
            System.out.println(count);

        }
    }
}


class Ram implements Comparable<Ram> {

    private int a;
    private int b;

    public Ram(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public int compareTo(Ram o) {
        int ramNeeds = ((Ram) o).getA();

        //ascending order
        return this.a - ramNeeds;
    }
}