package src.com.problems.linkedList;

public class NthNode {


    public static void main(String[] args) {

    }


    private static void solve(Node head, int N)
    {
        int i = 0;

        if (head == null)
            return;
        solve(head.next, N);

        if (++i == N)
            System.out.print(head.data);
    }
}
