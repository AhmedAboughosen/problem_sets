//package com.problems;
//
//import java.util.*;
//
//public class ColorfulField {
//
//    static char[] current = new char[3];
//
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//
//        int n = scanner.nextInt(), m = scanner.nextInt(), k = scanner.nextInt(), t = scanner.nextInt();
//
//        char start = 'c';
//        boolean isPrinted = false;
//
//        current[0] = 'c';
//        current[1] = 'k';
//        current[2] = 'g';
//
//        HashMap<Integer, List<Integer>> maps = new HashMap<>();
//        for (int i = 0; i < k; i++) {
//
//            int a = scanner.nextInt();
//            int b = scanner.nextInt();
//            List<Integer> list = maps.get(a);
//            if (list == null) list = new ArrayList<>();
//            list.add(b);
//            maps.put(a, list);
//        }
//
//        for (int i = 1; i <= t; i++) {
//            isPrinted = false;
//            current[0] = 'c';
//            current[1] = 'k';
//            current[2] = 'g';
//            int a = scanner.nextInt();
//            int b = scanner.nextInt();
//
//            for (int u = 1; u <= a; u++) {
//                List<Integer> listOfWaste = maps.get(u);
//
//                if (u != a) {
//
//                    if (listOfWaste == null) {
//                        int mod = Math.floorMod(m, 3);
//                        start = current[mod == 0 ? 2 : mod - 1];
//                        afterUpdate(start);
//                        continue;
//                    }
//
//                    Collections.sort(listOfWaste);
//
//                    for (int j = 0; j < listOfWaste.size(); j++) {
//
//                        if (j != 0 && (listOfWaste.get(j - 1) + 1) == listOfWaste.get(j)) continue;
//
//                        int mod = Math.floorMod(listOfWaste.get(j), 3);
//                        updateCurrent(current[mod == 0 ? 2 : mod - 1]);
//                    }
//
//                    if (listOfWaste.get(listOfWaste.size() - 1) == m) {
//                        start = current[2];
//                        afterUpdate(start);
//                        continue;
//                    }
//
//
//                    int mod = Math.floorMod((m) - listOfWaste.get(0), 3);
//
//                    start = current[mod == 0 ? 2 : mod - 1];
//                    afterUpdate(start);
//                    continue;
//                }
//
//                if (listOfWaste == null) {
//                    int mod = Math.floorMod(b, 3);
//                    System.out.println(NameOf(current[mod == 0 ? 2 : mod - 1]));
//                    continue;
//                }
//
//                Collections.sort(listOfWaste);
//
//                for (int j = 0; j < listOfWaste.size(); j++) {
//                    if (j != 0 && (listOfWaste.get(j - 1) + 1) == listOfWaste.get(j)) continue;
//
//                    if (b < listOfWaste.get(j)) {
//                        isPrinted = true;
//                        int mod = Math.floorMod(b, 3);
//                        System.out.println(NameOf(current[mod == 0 ? 2 : mod - 1]));
//                        break;
//                    }
//
//                    if (b == listOfWaste.get(j)) {
//                        isPrinted = true;
//                        System.out.println(NameOf('w'));
//                        break;
//                    }
//
//
//                    int mod = Math.floorMod(listOfWaste.get(j), 3);
//
//                    start = current[mod == 0 ? 2 : mod - 1];
//                    updateCurrent(start);
//                }
//            }
//
//
//            if (!isPrinted) {
//                int mod = Math.floorMod((m) - listOfWaste.get(0), 3);
//                System.out.println(NameOf(current[mod == 0 ? 2 : mod - 1]));
//
//            }
//
//
//        }
//    }
//
//
//    public static String NameOf(char ch) {
//        if (ch == 'g') {
//            return "Grapes";
//        }
//
//        if (ch == 'k') {
//            return "Kiwis";
//        }
//
//        if (ch == 'c') {
//            return "Carrots";
//        }
//
//        return "Waste";
//    }
//
//    public static void NextUpdate(char ch) {
//        if (ch == 'g') {
//
//            current[0] = 'g';
//            current[1] = 'c';
//            current[2] = 'k';
//
//
//        }
//
//        if (ch == 'k') {
//
//            current[0] = 'k';
//            current[1] = 'g';
//            current[2] = 'c';
//        }
//
//        if (ch == 'c') {
//            current[0] = 'c';
//            current[1] = 'k';
//            current[2] = 'g';
//
//        }
//    }
//
//    public static void afterUpdate(char ch) {
//        if (ch == 'g') {
//
//            current[0] = 'c';
//            current[1] = 'k';
//            current[2] = 'g';
//
//        }
//
//        if (ch == 'k') {
//
//            current[0] = 'g';
//            current[1] = 'c';
//            current[2] = 'k';
//
//        }
//
//        if (ch == 'c') {
//            current[0] = 'k';
//            current[1] = 'g';
//            current[2] = 'c';
//
//        }
//    }
//
//    public static void updateCurrent(char ch) {
//        if (ch == 'g') {
//
//            current[0] = 'g';
//            current[1] = 'c';
//            current[2] = 'k';
//
//        }
//
//        if (ch == 'k') {
//
//            current[0] = 'k';
//            current[1] = 'g';
//            current[2] = 'c';
//
//        }
//
//        if (ch == 'c') {
//            current[0] = 'c';
//            current[1] = 'k';
//            current[2] = 'g';
//
//        }
//    }
//}
