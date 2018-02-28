/**
 * Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
 *
 * Note: Do not modify the linked list.
 *
 * Follow up:
 * Can you solve it without using extra space?
 *
 * Accepted.
 */

function ListNode(val) {
    this.val = val;
    this.next = null;
}

/**
 * @param {ListNode} head
 * @return {ListNode}
 */
let detectCycle = function (head) {
    let slow = head, fast = head;
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        if (slow === fast) {
            while (slow !== head) {
                head = head.next;
                slow = slow.next;
            }
            return head;
        }
    }
    return null;
};


if (detectCycle(null) == null) {
    console.log("pass")
} else {
    console.error("failed")
}

if (detectCycle(new ListNode(0)) == null) {
    console.log("pass")
} else {
    console.error("failed")
}