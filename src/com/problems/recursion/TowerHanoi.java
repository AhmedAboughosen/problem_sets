package com.problems.recursion;

import java.util.Stack;

public class TowerHanoi {

    public static void main(String[] args) {

        Stack<Integer> a = new Stack<>();
        Stack<Integer> b = new Stack<>();
        Stack<Integer> c = new Stack<>();

        a.push(5);
        a.push(4);
        a.push(3);
        a.push(2);
        a.push(1);

        calTowerHanoi(a, b, c);

        int sizeA = a.size();
        System.out.println("print A");
        for (int i = 0; i < sizeA; i++) {
            System.out.println(a.pop());
        }

        System.out.println("print B");
        int sizeB = b.size();

        for (int i = 0; i < sizeB; i++) {
            System.out.println(b.pop());
        }

        System.out.println("print C");
        int sizeC = c.size();

        for (int i = 0; i < sizeC; i++) {
            System.out.println(c.pop());
        }
    }


    private static void calTowerHanoi(Stack<Integer> a, Stack<Integer> b, Stack<Integer> c) {

        if (a.isEmpty()) {
            int sizeB = c.size();

            for (int i = 0; i < sizeB; i++) {
                b.push(c.pop());
            }

            int sizeC = b.size();

            for (int i = 0; i < sizeC; i++) {
                c.push(b.pop());
            }

            return;
        }

        int getHighestOfA = a.pop();

        if (b.isEmpty()) {
            b.push(getHighestOfA);
            calTowerHanoi(a, b, c);
            return;
        }

        if (c.isEmpty()) {
            c.push(getHighestOfA);
            calTowerHanoi(a, b, c);
            return;
        }

        if (b.get(b.size() - 1) < c.get(c.size() - 1)) {
            int size = b.size();

            for (int i = 0; i < size; i++) {
                c.push(b.pop());
            }

            b.push(getHighestOfA);
            calTowerHanoi(a, b, c);
        } else {
            int size = c.size();
            for (int i = 0; i < size; i++) {
                b.push(c.pop());
            }
            c.push(getHighestOfA);
            calTowerHanoi(a, b, c);
        }
    }
}
