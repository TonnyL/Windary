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
        public String toString() {
            return "ListNode val: " + val + " next: -> " + next;
        }
    }

    public static void main(String[] args) {
        ReverseLinkedListII r = new ReverseLinkedListII();

        // Expected: null
        System.out.println(r.reverseBetween(null, 1, 2));

        ListNode node123 = new ListNode(1);
        node123.next = new ListNode(2);
        node123.next.next = new ListNode(3);
        // Expected: 1 -> 3 -> 2
        System.out.println(r.reverseBetween(node123, 2, 3));

        // Expected: 1
        System.out.println(r.reverseBetween(new ListNode(1), 1, 1));

        ListNode node12 = new ListNode(1);
        node12.next = new ListNode(2);
        // Expected: 2 -> 1
        System.out.println(r.reverseBetween(node12, 1, 2));

        ListNode node12345 = new ListNode(1);
        node12345.next = new ListNode(2);
        node12345.next.next = new ListNode(3);
        node12345.next.next.next = new ListNode(4);
        node12345.next.next.next.next = new ListNode(5);
        // Expected: 1 -> 4 -> 3 -> 2 -> 5
        System.out.println(r.reverseBetween(node12345, 2, 4));
    }

}
