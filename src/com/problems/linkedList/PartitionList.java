package src.com.problems.linkedList;

public class PartitionList {


    public static void main(String[] args) {

        Node<Integer> head =  new Node<Integer>(1);
        Node<Integer> f1 =  new Node<Integer>(4);
        Node<Integer> f2 =  new Node<Integer>(3);
        Node<Integer> f3 =  new Node<Integer>(2);
        Node<Integer> f4 =  new Node<Integer>(5);

        head.setNext(f1);
        f1.setNext(f2);
        f2.setNext(f3);
        f3.setNext(f4);
        partition(head,3);
    }
    public static Node<Integer> partition(Node<Integer> head, int x) {
        Node<Integer> lessHead = new Node<Integer>(-1);
        Node<Integer> moreHead = new Node<Integer>(-1);
        Node<Integer> less = lessHead;
        Node<Integer> more = moreHead;
        Node<Integer> node = head;
        while (node !=null ){
            if (node.data < x){
                less.next = node;
                less = less.next;
            }
            else{
                more.next = node;
                more = more.next;
            }
            node = node.next;
        }//while node
        more.next = null;
        less.next = moreHead.next;
        return lessHead.next;
    }
}
