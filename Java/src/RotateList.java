/**
 * Given a list, rotate the list to the right by k places, where k is non-negative.
 * <p>
 * Example:
 * <p>
 * Given 1->2->3->4->5->NULL and k = 2,
 * <p>
 * return 4->5->1->2->3->NULL.
 * <p>
 * Accepted.
 */
public class RotateList {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode node = head;
        int length = 1;
        while (node.next != null) {
            length++;

            node = node.next;
        }

        node.next = head; // Form a circle
        k %= length;

        for (int i = 0; i < length - k; i++) {
            node = node.next;
        }
        head = node.next;
        node.next = null;

        return head;
    }

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ListNode) {
                ListNode node = (ListNode) obj;
                return this.next == null && node.next == null || this.val == node.val && (this.next != null) && this.next.equals(node.next);
            }
            return false;
        }

    }

}
