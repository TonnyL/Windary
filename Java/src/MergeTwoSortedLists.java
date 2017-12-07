/**
 * Merge two sorted linked lists and return it as a new list.
 * The new list should be made by splicing together the nodes of the first two lists.
 * <p>
 * Example:
 * <p>
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 * <p>
 * Accepted.
 */
public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode fakeHeader = result;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                result.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                result.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            result = result.next;
        }

        result.next = l1 == null ? l2 : l1;

        return fakeHeader.next;
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
        MergeTwoSortedLists m = new MergeTwoSortedLists();

        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(2);
        node1.next.next = new ListNode(4);

        ListNode node2 = new ListNode(1);
        node2.next = new ListNode(3);
        node2.next.next = new ListNode(4);

        // Expected: 1->1->2->3->4->4
        System.out.println(m.mergeTwoLists(node1, node2));

        // Expected: 1->2->4
        System.out.println(m.mergeTwoLists(node1, null));

        // Expected: 1->3->4
        System.out.println(m.mergeTwoLists(null, node2));

        // Expected: null
        System.out.println(m.mergeTwoLists(null, null));
    }

}
