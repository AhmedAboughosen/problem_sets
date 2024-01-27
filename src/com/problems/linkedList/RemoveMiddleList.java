package src.com.problems.linkedList;

public class RemoveMiddleList {


    private static int solve(Node head,int index)
    {

        if (head == null)
            return index - 1;

       int size = solve(head.next,index + 1);


        int ind = size / 2 ;

        if(ind - 1 == index){
            head.next = head.next.next;
        }

        return size;
//        solve(head.next, N);
//
//        if (++i == N)
//            System.out.print(head.data);
    }
}
