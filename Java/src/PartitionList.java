/**
 * Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.
 * <p>
 * You should preserve the original relative order of the nodes in each of the two partitions.
 * <p>
 * For example,
 * Given 1->4->3->2->5->2 and x = 3,
 * return 1->2->2->4->3->5.
 * <p>
 * Accepted.
 */
public class PartitionList {

    public ListNode partition(ListNode head, int x) {
        ListNode node = head, greater = null, greaterHead = null, less = null, lessHead = null;

        while (node != null) {
            if (node.val < x) {
                if (less == null) {
                    less = new ListNode(node.val);
                    lessHead = less;
                } else {
                    less.next = new ListNode(node.val);
                    less = less.next;
                }
            } else {
                if (greater == null) {
                    greater = new ListNode(node.val);
                    greaterHead = greater;
                } else {
                    greater.next = new ListNode(node.val);
                    greater = greater.next;
                }
            }

            node = node.next;
        }

        if (greaterHead == null) {
            return lessHead;
        } else if (lessHead == null) {
            return greaterHead;
        }

        less.next = greaterHead;
        return lessHead;
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
