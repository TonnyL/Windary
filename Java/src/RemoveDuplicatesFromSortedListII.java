/**
 * Given a sorted linked list, delete all nodes that have duplicate numbers,
 * leaving only distinct numbers from the original list.
 * <p>
 * For example,
 * Given 1->2->3->3->4->4->5, return 1->2->5.
 * Given 1->1->1->2->3, return 2->3.
 * <p>
 * Accepted.
 */
public class RemoveDuplicatesFromSortedListII {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode fakeHead = new ListNode(0);
        fakeHead.next = head;
        ListNode node = fakeHead;

        while (node.next != null) {
            ListNode tmp = node.next;
            if (tmp.next != null && tmp.val == tmp.next.val) {
                while (tmp.next != null && tmp.val == tmp.next.val)
                    tmp = tmp.next;
                node.next = tmp.next;
                tmp.next = null;
            } else {
                node = node.next;
            }
        }
        return fakeHead.next;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedListII r = new RemoveDuplicatesFromSortedListII();

        // Expected: 1 -> 2 -> 5
        ListNode node1233445 = new ListNode(1);
        node1233445.next = new ListNode(2);
        node1233445.next.next = new ListNode(3);
        node1233445.next.next.next = new ListNode(3);
        node1233445.next.next.next.next = new ListNode(4);
        node1233445.next.next.next.next.next = new ListNode(4);
        node1233445.next.next.next.next.next.next = new ListNode(5);
        System.out.println(r.deleteDuplicates(node1233445));

        // Expected: 2 -> 3
        ListNode node11123 = new ListNode(1);
        node11123.next = new ListNode(1);
        node11123.next.next = new ListNode(1);
        node11123.next.next.next = new ListNode(2);
        node11123.next.next.next.next = new ListNode(3);
        System.out.println(r.deleteDuplicates(node11123));

        // Expected: null
        ListNode node111 = new ListNode(1);
        node111.next = new ListNode(1);
        node111.next.next = new ListNode(1);
        System.out.println(r.deleteDuplicates(node111));

        // Expected: null
        System.out.println(r.deleteDuplicates(null));

        // Expected: 1
        ListNode node122 = new ListNode(1);
        node122.next = new ListNode(2);
        node122.next.next = new ListNode(2);
        System.out.println(r.deleteDuplicates(node122));

        // Expected: null
        ListNode node11 = new ListNode(1);
        node11.next = new ListNode(1);
        System.out.println(r.deleteDuplicates(node11));

        // Expected: null
        ListNode node1122 = new ListNode(1);
        node1122.next = new ListNode(1);
        node1122.next.next = new ListNode(2);
        node1122.next.next.next = new ListNode(2);
        System.out.println(r.deleteDuplicates(node1122));
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            return "ListNode val: " + val + " next: -> " + next;
        }
    }

}
