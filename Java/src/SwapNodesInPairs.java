/**
 * Given a linked list, swap every two adjacent nodes and return its head.
 * <p>
 * For example,
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 * <p>
 * Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.
 * <p>
 * Accepted.
 */
public class SwapNodesInPairs {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = head, nxt = pre.next;
        while (pre != null && nxt != null) {
            int tmp = nxt.val;
            nxt.val = pre.val;
            pre.val = tmp;

            pre = nxt.next;
            if (pre != null) {
                nxt = pre.next;
            }
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
            return "ListNode val: " + val + " next -> " + next;
        }

    }

    public static void main(String[] args) {
        SwapNodesInPairs s = new SwapNodesInPairs();

        // Expected: null
        System.out.println(s.swapPairs(null));

        // Expected: 1
        System.out.println(s.swapPairs(new ListNode(1)));

        // Expected: 2 -> 1
        ListNode node12 = new ListNode(1);
        node12.next = new ListNode(2);
        System.out.println(s.swapPairs(node12));

        // Expected: 2 -> 1 -> 4 -> 3
        ListNode node1234 = new ListNode(1);
        node1234.next = new ListNode(2);
        node1234.next.next = new ListNode(3);
        node1234.next.next.next = new ListNode(4);
        System.out.println(s.swapPairs(node1234));

        // Expected: 2 -> 1 -> 4 -> 3 -> 5
        ListNode node12345 = new ListNode(1);
        node12345.next = new ListNode(2);
        node12345.next.next = new ListNode(3);
        node12345.next.next.next = new ListNode(4);
        node12345.next.next.next.next = new ListNode(5);
        System.out.println(s.swapPairs(node12345));
    }

}
