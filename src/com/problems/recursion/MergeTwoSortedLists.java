package src.com.problems.recursion;

public class MergeTwoSortedLists {

    public static void main(String[] args) {


//       var next = fun(new ListNode(1, new ListNode(2, new ListNode(4))), new ListNode(1, new ListNode(3, new ListNode(4))), null, null);
        var next = fun(new ListNode(1),null, null, null);

        System.out.println(next);
    }


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

    public static ListNode fun(ListNode list1, ListNode list2, ListNode head, ListNode node) {


        int val1 = list1 != null ? list1.val : Integer.MAX_VALUE;
        int val2 = list2 != null ? list2.val : Integer.MAX_VALUE;


        if (list1 == null && list2 == null) return head;

        if (list1 == null || val2 < val1) {
            if (head == null) {
                head = new ListNode(val2);
                node = head;
               return fun(list1, list2.next, head, node);
            }

            ListNode nextNode = new ListNode(val2);

            node.next = nextNode;

            node = nextNode;

            return fun(list1, list2.next, head, node);
        }


        if (list2 == null || val1 < val2) {
            if (head == null) {
                head = new ListNode(val1);
                node = head;
                return fun(list1.next, list2, head, node);
            }

            ListNode nextNode = new ListNode(val1);

            node.next = nextNode;

            node = nextNode;

            return fun(list1.next, list2, head, node);
        }


        if (head == null) {
            head = new ListNode(val1, new ListNode(val2));
            node = head.next;
            return fun(list1.next, list2.next, head, node);
        }

        ListNode nextNode = new ListNode(val1, new ListNode(val2));

        node.next = nextNode;

        node = nextNode.next;

        return fun(list1.next, list2.next, head, node);


    }
}
