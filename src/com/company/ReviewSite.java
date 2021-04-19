package com.company;

import java.util.Scanner;

public class ReviewSite {

    // problem from http://codeforces.com/contest/1511/problem/A
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {

            int n = scanner.nextInt();
            int firstUpVote = 0, firstDownVote = 0;
            int secondUpVote = 0, secondDownVote = 0;

            for (int j = 0; j < n; j++) {
                int vote = scanner.nextInt();
                int v1 = firstUpVote - firstDownVote;
                int v2 = secondUpVote - secondDownVote;

                if (vote == 1) {

                    if (v1 <= v2) {
                        firstUpVote++;
                    } else {
                        secondUpVote++;
                    }

                }


                if (vote == 2) {

                    //0 1 = -1 0 0 = 0
                    if (v1 <= v2) {
                        firstDownVote++;
                    } else {
                        secondDownVote++;
                    }

                }


                if (vote == 3) {
                    // 5 4 = 1 , 6 2 = 4
                    if(v1 >= 0 && v2 >= 0){
                        if (v1 >= v2) {
                            firstUpVote++;
                        } else {
                            secondUpVote++;
                        }
                    }else{
                        if (firstUpVote >= firstDownVote) {
                            ++firstUpVote;
                        } else {
                            if (secondUpVote >= secondDownVote) {
                                ++secondUpVote;
                            } else {
                                if (v1 <= v2) {
                                    firstDownVote++;
                                } else {
                                    secondDownVote++;
                                }
                            }
                        }
                    }

                }
            }
            System.out.println(firstUpVote + secondUpVote);
        }
    }
}
