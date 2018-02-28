/**
 * Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
 * <p>
 * Note: Do not modify the linked list.
 * <p>
 * Follow up:
 * Can you solve it without using extra space?
 * <p>
 * Accepted.
 */
public class LinkedListCycleII {

    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                while (slow != head) {
                    head = head.next;
                    slow = slow.next;
                }
                return head;
            }
        }
        return null;
    }

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
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
