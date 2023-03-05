package src.com.problems;

public class AddTwoNumbers {


    /**
     * Definition for singly-linked list.
     */
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {

      var node =  addTwoNumbers(new ListNode(9 , new ListNode( 9 , new ListNode(9 , new ListNode(9 , new ListNode(9 , new ListNode(9 , new ListNode( 9 ))))))),
              new ListNode(9 , new ListNode( 9 , new ListNode(9, new ListNode(9)))));

        printList(node);
    }

    public static void printList(ListNode list)
    {
        ListNode currNode = list;

        System.out.print("LinkedList: ");

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.val + " ");

            // Go to next node
            currNode = currNode.next;
        }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode rootNode = new ListNode();
        ListNode headNode = rootNode;

//        rootNode.val = Math.floorMod((l1.val + l2.val), 10);
//
//        l1 = l1.next;
//        l2 = l2.next;
//
//        ListNode nextNode = new ListNode();
//        rootNode.next = nextNode;

        int remainingVal = 0;

        while (l1 != null && l2 != null) {
            int v1 = l1.val;
            int v2 = l2.val;

            rootNode.val = Math.floorMod((v1 + v2 + remainingVal), 10);
            rootNode.next = new ListNode();
            remainingVal = ((v1 + v2 + remainingVal) / 10);

            rootNode = rootNode.next;


            l1 = l1.next;
            l2 = l2.next;

        }

        while (l1 != null){
            int v1 = l1.val;

            rootNode.val = Math.floorMod((v1  + remainingVal), 10);
            rootNode.next = new ListNode();
            remainingVal = ((v1 + remainingVal) / 10);

            rootNode = rootNode.next;


            l1 = l1.next;
        }


        while (l2 != null){
            int v1 = l2.val;

            rootNode.val = Math.floorMod((v1  + remainingVal), 10);
            rootNode.next = new ListNode();
            remainingVal = ((v1 + remainingVal) / 10);

            rootNode = rootNode.next;


            l2 = l2.next;
        }


        return headNode;

    }

}
