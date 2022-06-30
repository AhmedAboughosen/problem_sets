package src.com.problems.linkedList;

public class CusLinkedList {
}

class Node {
    // reference to the next node in the chain, or null if there isn't one.
    Node next;

    // data carried by this node. could be of any type you need.
    Object data;

    // Node constructor
    public Node(Object dataValue) {
        next = null;
        data = dataValue;
    }

    // another Node constructor if we want to specify the node to point to.
    @SuppressWarnings("unused")
    public Node(Object dataValue, Node nextValue) {
        next = nextValue;
        data = dataValue;
    }

    // these methods should be self-explanatory
    public Object getData() {
        return data;
    }

    @SuppressWarnings("unused")
    public void setData(Object dataValue) {
        data = dataValue;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node nextValue) {
        next = nextValue;
    }

}
