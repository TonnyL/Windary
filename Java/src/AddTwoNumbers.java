
import java.util.ArrayList;
import java.util.List;

/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * <p>
 * Result: Accepted
 */
public class AddTwoNumbers {

    public static void main(String[] args) {

        ListNode node0 = new ListNode(0);
        ListNode node5 = new ListNode(5);

        ListNode node243 = new ListNode(2);
        node243.next = new ListNode(4);
        node243.next.next = new ListNode(3);

        ListNode node564 = new ListNode(5);
        node564.next = new ListNode(6);
        node564.next.next = new ListNode(4);

        ListNode node1 = new ListNode(1);
        ListNode node99 = new ListNode(9);
        node99.next = new ListNode(9);

        AddTwoNumbers atn = new AddTwoNumbers();
        ListNode result0 = atn.addTwoNumbers(node0, node0);
        ListNode result5 = atn.addTwoNumbers(node5, node5);
        ListNode result243And564 = atn.addTwoNumbers(node243, node564);
        ListNode result1And99 = atn.addTwoNumbers(node1, node99);

        // Expected:
        // result: [0][0] ->  0
        System.out.println("result: [0] + [0] -> " + result0.val);
        // Expected:
        // result: [5][5] ->  0  ->  1
        System.out.println("result: [5] + [5] -> " + result5.val + " -> " + result5.next.val);
        // Expected:
        // result: [2,4,3] + [5,6,4] ->  7  ->  0  ->  8
        System.out.println("result: [2,4,3] + [5,6,4] -> " + result243And564.val + " -> " + result243And564.next.val + " -> " + result243And564.next.next.val);
        // Expected:
        // result: [1] + [9,9] ->  0  ->  0  ->  1
        System.out.println("result: [1] + [9,9] -> " + result1And99.val + " -> " + result1And99.next.val + " -> " + result1And99.next.next.val);

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode tmp1 = l1.next;
        ListNode tmp2 = l2.next;

        List<ListNode> results = new ArrayList<>();

        boolean addOne = l1.val + l2.val >= 10;

        ListNode result = new ListNode((l1.val + l2.val) % 10);

        if (addOne) {
            result.next = new ListNode(1);
        }

        results.add(result);

        while (true) {
            if (tmp1 == null && tmp2 == null) {
                break;
            } else {
                int tmp = 0;
                if (tmp1 == null) {
                    tmp = tmp2.val;
                } else if (tmp2 == null) {
                    tmp = tmp1.val;
                } else {
                    tmp = tmp1.val + tmp2.val;
                }

                if (addOne) {
                    tmp += 1;
                }

                addOne = tmp >= 10;
                result = new ListNode(tmp % 10);

                if (addOne) {
                    result.next = new ListNode(1);
                }

                results.add(result);

                if (tmp1 != null) {
                    tmp1 = tmp1.next;
                }
                if (tmp2 != null) {
                    tmp2 = tmp2.next;
                }
            }

        }

        ListNode rst = results.get(0);
        for (int i = 1; i < results.size(); i++) {
            rst.next = results.get(i);
            rst = rst.next;
        }

        return results.get(0);
    }

    /**
     * Definition for singly-linked list.
     */
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
