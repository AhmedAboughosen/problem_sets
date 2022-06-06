package src.com.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class PerfectlyBalancedString {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            String text = scanner.next();


            List<TextRepeated> textRepeatedList = new ArrayList<>();


            for (int j = 0; j < text.length(); j++) {

            }

//            HashMap<Character, Integer> map = new HashMap<>();
//
//            for (int j = 0; j < text.length(); j++) {
//                map.put(text.charAt(j), map.containsKey(text.charAt(j)) ? map.get(text.charAt(j)) + 1 : 1);
//            }
//
//            boolean isNo = false;
//            for (int j = 0; j < text.length(); j++) {
//
//                char ch = text.charAt(j);
//                int count = map.get(ch);
//                for (Character keys : map.keySet()) {
//                    int value = map.get(keys);
//
//                    if(keys == ch) continue;
//                    if (Math.abs(count - value) != 1) {
//                        isNo = true;
//                        break;
//                    }
//                }
//
//                if (isNo) break;
//
//                map.put(ch, map.get(ch) - 1);
//            }
//
//            System.out.println(isNo ? "NO" : "YES");
        }
    }
}

class TextRepeated {

    public HashMap<Character, Integer> countMap = new HashMap<>();
    public List<Character> list = new ArrayList<>();
}
