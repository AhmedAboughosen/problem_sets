package src.com.problems;

import java.util.*;

public class PalindromePermutation {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String text = scanner.nextLine();

        solve(text);
//
//
//        HashMap<Character, Integer> textMap = new HashMap<>();
//        HashMap<Character, Integer> backtrack = new HashMap<>();
//
//        for (int i = 0; i < text.length(); i++) {
//            textMap.put(text.charAt(i), textMap.containsKey(text.charAt(i)) ? textMap.get(text.charAt(i)) + 1 : 1);
//        }
//
//        boolean isReaptedChar = false;
//        for (Character name : textMap.keySet()) {
//            String key = name.toString();
//            int value = textMap.get(name);
//
//            if (value == 1) {
//                if (isReaptedChar) {
//                    System.out.println("No");
//                    return;
//                }
//                isReaptedChar = true;
//            }
//        }
//
//
//        for (int i = 0; i < text.length(); i++) {
//
//            char currentChar = text.charAt(i);
//
//            char[] newList = new char[textMap.size()];
//
//            newList[0] = currentChar;
//            newList[newList.length - 1] = currentChar;
//
//            if (backtrack.containsKey(currentChar) || textMap.get(currentChar) == 1) continue;
//
//            backtrack.put(currentChar, 0);
//
//            int currentIndex = 1;
//
//            for (Character name : textMap.keySet()) {
//                char key = name;
//                int value = textMap.get(name);
//
//                if (key != currentChar && value == 2) {
//                    newList[currentIndex ] = key;
//                    newList[newList.length - currentIndex - 1] = key;
//                    ++currentIndex;
//                }
//
//                if (key != currentChar && value == 1) {
//                    newList[newList.length / 2] = key;
//                }
//            }
//
//            System.out.println(Arrays.toString(newList));
//        }
    }


    public static void solve(String text) {

        text = text.toLowerCase();
        HashMap<Character, List<Integer>> textMap = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            List<Integer> list = textMap.get(text.charAt(i));

            if (list != null) {
                list.add(i);
                textMap.put(text.charAt(i), list);
                continue;
            }

            list = new ArrayList<>();
            list.add(i);

            textMap.put(text.charAt(i), list);
        }

        char outArr[] = new char[text.length()];

        boolean isMarked = false;
        int startIndex = 0;
        int endIndex = outArr.length - 1;

        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) == ' ') {
                outArr[startIndex] = ' ';
                continue;
            }

            List<Integer> list = textMap.get(text.charAt(i));

            int index = Collections.binarySearch(list, i);


            if (list.size() > index + 1) {
                outArr[startIndex] = text.charAt(i);
                outArr[endIndex] = text.charAt(i);
                startIndex++;
                endIndex--;
                continue;
            }


            break;
        }

        if(!isMarked){
            System.out.println("False");
            return;
        }

        System.out.println("True");
        System.out.println(outArr);
    }
}
