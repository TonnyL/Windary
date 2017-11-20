/**
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 * <p>
 * For example,
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 * <p>
 * Accepted.
 */
public class RemoveDuplicatesFromSortedList {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        while (node != null && node.next != null) {
            if (node.val == node.next.val) {
                ListNode tmp = node.next;
                node.next = tmp.next;
                tmp.next = null;
            } else {
                node = node.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedList r = new RemoveDuplicatesFromSortedList();

        // Expected: null
        System.out.println(r.deleteDuplicates(null));

        ListNode node112 = new ListNode(1);
        node112.next = new ListNode(1);
        node112.next.next = new ListNode(2);
        // Expected: 1 -> 2
        System.out.println(r.deleteDuplicates(node112));

        ListNode node11233 = new ListNode(1);
        node11233.next = new ListNode(1);
        node11233.next.next = new ListNode(2);
        node11233.next.next.next = new ListNode(3);
        node11233.next.next.next.next = new ListNode(3);
        // Expected: 1 -> 2 -> 3
        System.out.println(r.deleteDuplicates(node11233));

        ListNode node111 = new ListNode(1);
        node111.next = new ListNode(1);
        node111.next.next = new ListNode(1);
        // Expected: 1
        System.out.println(r.deleteDuplicates(node111));

        ListNode node1222 = new ListNode(1);
        node1222.next = new ListNode(2);
        node1222.next.next = new ListNode(2);
        node1222.next.next.next = new ListNode(2);
        // Expected: 1 -> 2
        System.out.println(r.deleteDuplicates(node1222));

        ListNode node1122 = new ListNode(1);
        node1122.next = new ListNode(1);
        node1122.next = new ListNode(2);
        node1122.next.next = new ListNode(2);
        // Expected: 1 -> 2
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
