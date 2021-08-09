package com.problems.greedyAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CollectingSignatures {

    /**
     * Task. Given a set of n segments {[a0, b0], [a1, b1], . . . , [an-1, bn-1]} with integer coordinates on a line, find the minimum number m of points such that each segment contains at least one point. That is, find a set of integers X of the minimum size such that for any segment [ai, bi] there is a point x ∈ X such that ai ≤ x ≤ bi.
     *
     * Input Format. The frst line of the input contains the number n of segments. Each of the following n lines contains two integers ai and bi (separated by a space) defining the coordinates of endpoints of the i-th segment.
     *
     * @param args
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Segment> segments = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int start, end;
            start = scanner.nextInt();
            end = scanner.nextInt();
            segments.add(new Segment(start, end));
        }

        List<Integer> list = optimalPoints(segments);
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }


    private static List<Integer> optimalPoints(List<Segment> segments) {

        Collections.sort(segments);


        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < segments.size(); i++) {

            Segment segment = segments.get(i);

            int j = i + 1;
            while (j < segments.size() && segments.get(j).start <= segment.end)
                j++;
            i = j - 1;
            list.add(segment.end);

        }
        return list;
    }

    private static class Segment implements Comparable<Segment> {
        int start, end;

        Segment(int start, int end) {
            this.start = start;
            this.end = end;
        }


        @Override
        public int compareTo(Segment o) {
            if (this.end < o.end)
                return -1;
            else if (this.end > o.end)
                return +1;
            else
                return 0;
        }
    }
}

