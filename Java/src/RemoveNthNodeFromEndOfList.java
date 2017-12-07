import java.util.Stack;

/**
 * Given a linked list, remove the nth node from the end of list and return its head.
 * <p>
 * For example,
 * <p>
 * Given linked list: 1->2->3->4->5, and n = 2.
 * <p>
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 * Note:
 * Given n will always be valid.
 * Try to do this in one pass.
 * <p>
 * Accepted.
 */
public class RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        Stack<ListNode> stack = new Stack<>();
        ListNode tmp = null, node = head;

        for (; node != null; node = node.next) {
            stack.push(node);
        }

        for (; n > 0 && !stack.empty(); n--) {
            tmp = stack.pop();
        }

        if (tmp != null) {
            if (!stack.empty()) {
                stack.peek().next = tmp.next;
            } else {
                head = tmp.next;
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
            return "ListNode val: " + val + " next: -> " + next;
        }
    }

    public static void main(String[] args) {
        RemoveNthNodeFromEndOfList r = new RemoveNthNodeFromEndOfList();

        ListNode node12345 = new ListNode(1);
        node12345.next = new ListNode(2);
        node12345.next.next = new ListNode(3);
        node12345.next.next.next = new ListNode(4);
        node12345.next.next.next.next = new ListNode(5);
        // Expected: 1->2->3->5
        System.out.println(r.removeNthFromEnd(node12345, 2));

        ListNode node12 = new ListNode(1);
        node12.next = new ListNode(2);
        // Expected: 1
        System.out.println(r.removeNthFromEnd(node12, 1));

        // Expected: null
        System.out.println(r.removeNthFromEnd(new ListNode(1), 1));

        // Expected: null
        System.out.println(r.removeNthFromEnd(null, 2));

        ListNode node123 = new ListNode(1);
        node123.next = new ListNode(2);
        node123.next.next = new ListNode(3);
        // Expected: 2->3
        node123 = r.removeNthFromEnd(node123, 3);
        System.out.println(node123);
        // Expected: 2
        System.out.println(r.removeNthFromEnd(node123, 1));
        // Expected: null
        System.out.println(r.removeNthFromEnd(node123, 1));
    }

}
