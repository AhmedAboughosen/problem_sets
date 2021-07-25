package com.problems;

import java.util.ArrayList;

public class MergeIntervals {

    public static class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }
    }


    public static void main(String[] args) {

        ArrayList<Interval> intervals1 = new ArrayList<Interval>();
        intervals1.add(new Interval(3, 6));
        intervals1.add(new Interval(8, 10));
//        intervals1.add(new Interval(1,2));
//        intervals1.add(new Interval(3,5));
//        intervals1.add(new Interval(6,7));
//        intervals1.add(new Interval(8,10));
//        intervals1.add(new Interval(12,16));
//        intervals1.add(new Interval(87248431, 94675146));
//        intervals1.add(new Interval(8, 10));
//        intervals1.add(new Interval(12, 16));
        ArrayList<Interval> intervals2 = insert(intervals1, new Interval(1, 2));
        for (int i = 0; i < intervals2.size(); i++) {
            System.out.println(intervals2.get(i).start + " " + intervals2.get(i).end);
        }
    }

    public static ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {

        if (newInterval.start > newInterval.end) {
            int temp = newInterval.start;
            newInterval.start = newInterval.end;
            newInterval.end = temp;

        }
        ArrayList<Interval> intervals1 = new ArrayList<Interval>();
        int i = 0;
        boolean isChecked = false;
        for (i = 0; i < intervals.size(); i++) {
            Interval interval = intervals.get(i);
            if (interval.end < newInterval.start) {
                intervals1.add(interval);
                continue;
            }

            if (interval.start > newInterval.start && interval.end > newInterval.end) {
                intervals1.add(new Interval(newInterval.start ,interval.end ));
                isChecked = true;
                i++;
                break;
            }

            if (interval.start < newInterval.start && interval.end < newInterval.end) {
                int end = newInterval.end;
                isChecked = true;
                int j = 0;
                for (j = i + 1; j < intervals.size(); j++) {
                    if (intervals.get(j).start < newInterval.end && intervals.get(j).end > newInterval.end) {
                        end = intervals.get(j).end;
                        break;
                    }
                    if (intervals.get(j).start > newInterval.end) {
                        --j;
                        break;
                    }
                }
                i = j + 1;
                intervals1.add(new Interval(interval.start, end));
                break;
            }
        }

        if(!isChecked){
            intervals1.add(newInterval);
        }
        for (int j = i; j < intervals.size(); j++) {
            intervals1.add(intervals.get(j));
        }
        return intervals1;
    }
}
