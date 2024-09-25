package src.com.problems;

public class BeautifulMatrix {

    //problem from https://codeforces.com/contest/231/problem/A
    public static void main(String[] args) {

        BeautifulMatrix.Solve();
    }

    private static void Solve() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int indexI = 0, indexJ = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int count = 0;
            if (a == 1) ++count;
            if (b == 1) ++count;
            if (c == 1) ++count;

            if (count >= 2) {
                out++;
            }
        }

        System.out.println(out);
    }
}
