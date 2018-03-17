/**
 * Given a linked list, swap every two adjacent nodes and return its head.
 *
 * For example,
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 *
 * Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.
 *
 * Accepted.
 */

function ListNode(val) {
    this.val = val;
    this.next = null;

    this.equals = function (node) {
        return this.next == null && node.next == null || this.val === node.val && (this.next != null) && this.next.equals(node.next);
    }
}

/**
 * @param {ListNode} head
 * @return {ListNode}
 */
let swapPairs = function (head) {
    if (head == null || head.next == null) {
        return head;
    }
    let pre = head, nxt = pre.next;
    while (pre != null && nxt != null) {
        let tmp = nxt.val;
        nxt.val = pre.val;
        pre.val = tmp;

        pre = nxt.next;
        if (pre != null) {
            nxt = pre.next;
        }
    }

    return head;
};

if (swapPairs(null) == null) {
    console.log("pass")
} else {
    console.error("failed")
}

if (swapPairs(new ListNode(1)).equals(new ListNode(1))) {
    console.log("pass")
} else {
    console.error("failed")
}

let node12 = new ListNode(1);
node12.next = new ListNode(2);
let tmp = new ListNode(2);
tmp.next = new ListNode(1);
if (swapPairs(node12).equals(tmp)) {
    console.log("pass")
} else {
    console.error("failed")
}

let node1234 = new ListNode(1);
node1234.next = new ListNode(2);
node1234.next.next = new ListNode(3);
node1234.next.next.next = new ListNode(4);
tmp.next.next = new ListNode(4);
tmp.next.next.next = new ListNode(3);
if (swapPairs(node1234).equals(tmp)) {
    console.log("pass")
} else {
    console.error("failed")
}

let node12345 = new ListNode(1);
node12345.next = new ListNode(2);
node12345.next.next = new ListNode(3);
node12345.next.next.next = new ListNode(4);
node12345.next.next.next.next = new ListNode(5);
tmp.next.next.next.next = new ListNode(5);
if (swapPairs(node12345).equals(tmp)) {
    console.log("pass")
} else {
    console.error("failed")
}