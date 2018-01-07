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
        public String toString() {
            return "ListNode val: " + val + " next -> " + next;
        }
    }

    public static void main(String[] args) {
        PartitionList pl = new PartitionList();

        // Expected: null
        System.out.println(pl.partition(null, 2));

        // Expected: 1 -> 2
        ListNode node12 = new ListNode(1);
        node12.next = new ListNode(2);
        System.out.println(pl.partition(node12, 3));

        // Expected: 1 -> 2
        System.out.println(pl.partition(node12, 0));

        ListNode node143252 = new ListNode(1);
        node143252.next = new ListNode(4);
        node143252.next.next = new ListNode(3);
        node143252.next.next.next = new ListNode(2);
        node143252.next.next.next.next = new ListNode(5);
        node143252.next.next.next.next.next = new ListNode(2);
        // Expected: 1 -> 2 -> 2 -> 4 -> 3 -> 5
        System.out.println(pl.partition(node143252, 3));

        // Expected: 1 -> 3 -> 2 -> 2 -> 4 -> 5
        System.out.println(pl.partition(node143252, 4));
    }

}
