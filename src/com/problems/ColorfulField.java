package com.problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ColorfulField {

    static char[] current = new char[3];
    static HashMap<Integer, List<Character>> temp = new HashMap<>();
    static int Max = 0;

    public static void main(String[] args) {

        ColorfulField.FastScanner scanner = new ColorfulField.FastScanner();

        int n = scanner.nextInt(), m = scanner.nextInt(), k = scanner.nextInt(), t = scanner.nextInt();

        char start = 'c';
        boolean isPrinted = false;

        int lastSorted = 1;
        current[0] = 'c';
        current[1] = 'k';
        current[2] = 'g';

        HashMap<Integer, List<Integer>> maps = new HashMap<>();
        for (int i = 0; i < k; i++) {

            int a = scanner.nextInt();
            int b = scanner.nextInt();
            List<Integer> list = maps.get(a);
            if (list == null) list = new ArrayList<>();
            list.add(b);
            maps.put(a, list);
        }


        for (int i = 1; i <= t; i++) {
            isPrinted = false;
            current[0] = 'c';
            current[1] = 'k';
            current[2] = 'g';
            int a = scanner.nextInt();
            int b = scanner.nextInt();


            int s = 1;
            if (temp.containsKey(a)) {
                s = a;
                current[0] = temp.get(s).get(0);
                current[1] = temp.get(s).get(1);
                current[2] = temp.get(s).get(2);
            } else {
                if (temp.containsKey(Math.min(a, Max))) {
                    s = Math.min(a, Max);
                    current[0] = temp.get(s).get(0);
                    current[1] = temp.get(s).get(1);
                    current[2] = temp.get(s).get(2);
                }
            }

            for (int u = s; u <= a; u++) {
                List<Integer> listOfWaste = maps.get(u);

                int from = 0;

                if (u != a) {
                    if (listOfWaste == null) {
                        int mod = Math.floorMod(m, Math.min(m, 3));
                        start = current[mod == 0 ? Math.min(m - 1, 2) : mod - 1];
                        afterUpdate(start);
                        updateTempList(u);
                        continue;
                    }

                    if (u >= lastSorted)
                        Collections.sort(listOfWaste);

                    for (int j = 0; j < listOfWaste.size(); j++) {

                        if (j != 0 && (listOfWaste.get(j - 1) + 1) == listOfWaste.get(j)) {
                            from = listOfWaste.get(j);
                            continue;
                        }


                        int mod = Math.floorMod(listOfWaste.get(j) - from, Math.min(m - from, 3));
                        updateCurrent(current[mod == 0 ? Math.min((m - from) - 1, 2) : mod - 1]);
                        from = listOfWaste.get(j);
                    }

                    if (listOfWaste.get(listOfWaste.size() - 1) == m) {
                        updateTempList(u);
                        continue;
                    }


                    int mod = Math.floorMod((m) - from, Math.min(m - from, 3));

                    start = current[mod == 0 ? Math.min((m - from) - 1, 2) : mod - 1];
                    afterUpdate(start);
                    updateTempList(u);
                    continue;
                }

                if (listOfWaste == null) {
                    int mod = Math.floorMod(b, Math.min(m, 3));
                    System.out.println(NameOf(current[mod == 0 ? Math.min(m - 1, 2) : mod - 1]));
                    continue;
                }

                if (u >= lastSorted)
                    Collections.sort(listOfWaste);

                for (int j = 0; j < listOfWaste.size(); j++) {

                    if (b < listOfWaste.get(j)) {
                        isPrinted = true;
                        int mod = Math.floorMod(b - from, Math.min(m - (from), 3));
                        System.out.println(NameOf(current[mod == 0 ? Math.min(m - 1, 2) : mod - 1]));
                        break;
                    }

                    if (b == listOfWaste.get(j)) {
                        isPrinted = true;
                        System.out.println(NameOf('w'));
                        break;
                    }


                    if (j != 0 && (listOfWaste.get(j - 1) + 1) == listOfWaste.get(j)) {
                        from = listOfWaste.get(j);
                        continue;
                    }

                    int mod = Math.floorMod(listOfWaste.get(j) - from, Math.min(m - from, 3));
                    updateCurrent(current[mod == 0 ? Math.min((m - from) - 1, 2) : mod - 1]);

                    from = listOfWaste.get(j);
                }


                if (!isPrinted) {
                    int mod = Math.floorMod((b) - listOfWaste.get(listOfWaste.size() - 1), Math.min(m - from, 3));
                    System.out.println(NameOf(current[mod == 0 ? Math.min((m - from) - 1, 2) : mod - 1]));
                }
            }

            lastSorted = a;


        }
    }


    public static void updateTempList(int a) {
        ArrayList<Character> list = new ArrayList<>();
        list.add(current[0]);
        list.add(current[1]);
        list.add(current[2]);
        temp.put(a + 1, list);

        Max = Math.max(a + 1, Max);
    }

    public static String NameOf(char ch) {
        if (ch == 'g') {
            return "Grapes";
        }

        if (ch == 'k') {
            return "Kiwis";
        }

        if (ch == 'c') {
            return "Carrots";
        }

        return "Waste";
    }

    public static void NextUpdate(char ch) {
        if (ch == 'g') {

            current[0] = 'g';
            current[1] = 'c';
            current[2] = 'k';


        }

        if (ch == 'k') {

            current[0] = 'k';
            current[1] = 'g';
            current[2] = 'c';
        }

        if (ch == 'c') {
            current[0] = 'c';
            current[1] = 'k';
            current[2] = 'g';

        }
    }

    public static void afterUpdate(char ch) {
        if (ch == 'g') {

            current[0] = 'c';
            current[1] = 'k';
            current[2] = 'g';

        }

        if (ch == 'k') {

            current[0] = 'g';
            current[1] = 'c';
            current[2] = 'k';

        }

        if (ch == 'c') {
            current[0] = 'k';
            current[1] = 'g';
            current[2] = 'c';

        }
    }

    public static void updateCurrent(char ch) {
        if (ch == 'g') {

            current[0] = 'g';
            current[1] = 'c';
            current[2] = 'k';

        }

        if (ch == 'k') {

            current[0] = 'k';
            current[1] = 'g';
            current[2] = 'c';

        }

        if (ch == 'c') {
            current[0] = 'c';
            current[1] = 'k';
            current[2] = 'g';

        }
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextString() {
            return ("" + next());
        }
    }
}
