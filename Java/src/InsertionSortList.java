/**
 * Sort a linked list using insertion sort.
 * <p>
 * Accepted.
 */
public class InsertionSortList {

    public ListNode insertionSortList(ListNode head) {
        ListNode fakeHead = new ListNode(0);

        while (head != null) {
            ListNode pre = fakeHead;

            while (pre.next != null && pre.next.val <= head.val) {
                pre = pre.next;
            }

            ListNode headNext = head.next;
            head.next = pre.next;

            pre.next = head;
            head = headNext;
        }

        return fakeHead.next;
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
