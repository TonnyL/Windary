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
        public String toString() {
            return "ListNode val: " + val + " next -> " + next;
        }
    }

    public static void main(String[] args) {
        RotateList rl = new RotateList();

        // Expected: null
        System.out.println(rl.rotateRight(null, 1));

        // Expected: 1
        System.out.println(rl.rotateRight(new ListNode(1), 1));

        // Expected: 1 -> 2
        ListNode node12 = new ListNode(1);
        node12.next = new ListNode(2);
        System.out.println(rl.rotateRight(node12, 0));

        // Expected: 3 -> 1 -> 2
        ListNode node123 = new ListNode(1);
        node123.next = new ListNode(2);
        node123.next.next = new ListNode(3);
        System.out.println(rl.rotateRight(node123, 1));

        ListNode node12345 = new ListNode(1);
        node12345.next = new ListNode(2);
        node12345.next.next = new ListNode(3);
        node12345.next.next.next = new ListNode(4);
        node12345.next.next.next.next = new ListNode(5);
        System.out.println(rl.rotateRight(node12345, 2));
    }

}
