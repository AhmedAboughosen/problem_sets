package src.com.problems.linkedList;

import java.util.HashSet;

public class RemoveDup {


    public void RemoveNode(Node node) {


        //first way O(N) Memory O(N)
        HashSet<Object> set = new HashSet<Object>();
        Node previous = null;

        while (node != null) {

            if (!set.contains(node.data)) {
                set.add(node.data);
                previous = node;
            } else {
                previous.next = node.next;
            }

            node = node.next;
        }


        //second way   O(N^2) Memory O(1)

        while (node != null) {

            Node innerNode = node.next;

            while (innerNode != null) {

                if (innerNode.data == node.data) {
                    previous.next = innerNode.next;
                    innerNode = innerNode.next;
                    continue;
                }
                previous = innerNode;
                innerNode = innerNode.next;
            }

            node = node.next;
        }
    }
}

