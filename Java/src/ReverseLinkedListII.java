import java.util.ArrayList;
import java.util.List;

/**
 * Reverse a linked list from position m to n. Do it in-place and in one-pass.
 * <p>
 * For example:
 * Given 1->2->3->4->5->NULL, m = 2 and n = 4,
 * <p>
 * return 1->4->3->2->5->NULL.
 * <p>
 * Note:
 * Given m, n satisfy the following condition:
 * 1 ≤ m ≤ n ≤ length of list.
 * <p>
 * Accepted.
 */
public class ReverseLinkedListII {

    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode node = head;
        List<ListNode> list = new ArrayList<>(n - m + 1);

        for (int i = 0; i <= n - 1 && node != null; i++) {
            if (m - 1 <= i) {
                list.add(node);
            }
            node = node.next;
        }

        while (list.size() >= 2) {
            int tmp = list.get(0).val;
            list.get(0).val = list.get(list.size() - 1).val;
            list.get(list.size() - 1).val = tmp;

            list.remove(0);
            list.remove(list.size() - 1);
        }

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
