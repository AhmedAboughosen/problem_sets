package src.com.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoyGirl {

    public static void main(String[] args) {
        Solve();
    }

    private static void Solve(){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine().toLowerCase();


        List<Character> list = new ArrayList<Character>();


        for (int i = 0; i < s.length(); i++) {

            if(list.contains(s.charAt(i))){
               continue;
            }
            list.add(s.charAt(i));
        }

        System.out.println(Math.floorMod(list.size() , 2) == 0 ? "CHAT WITH HER!" : "IGNORE HIM!" );
    }
}
