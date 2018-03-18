/**
 * Given a list, rotate the list to the right by k places, where k is non-negative.
 *
 * Example:
 *
 * Given 1->2->3->4->5->NULL and k = 2,
 *
 * return 4->5->1->2->3->NULL.
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
 * @param {number} k
 * @return {ListNode}
 */
let rotateRight = function (head, k) {
    if (head == null || head.next == null) {
        return head;
    }

    let node = head, length = 1;
    while (node.next != null) {
        length++;

        node = node.next;
    }

    node.next = head; // Form a circle
    k %= length;

    for (let i = 0; i < length - k; i++) {
        node = node.next;
    }
    head = node.next;
    node.next = null;

    return head;
};


if (rotateRight(null, 1) === null) {
    console.log("pass")
} else {
    console.error("failed")
}

let tmp = new ListNode(1);
if (rotateRight(new ListNode(1), 1).equals(tmp)) {
    console.log("pass")
} else {
    console.error("failed")
}

let node12 = new ListNode(1);
node12.next = new ListNode(2);
tmp.next = new ListNode(2);
if (rotateRight(node12, 0).equals(tmp)) {
    console.log("pass")
} else {
    console.error("failed")
}

let node123 = new ListNode(1);
node123.next = new ListNode(2);
node123.next.next = new ListNode(3);
tmp = new ListNode(3);
tmp.next = new ListNode(1);
tmp.next.next = new ListNode(2);
if (rotateRight(node123, 1).equals(tmp)) {
    console.log("pass")
} else {
    console.error("failed")
}

let node12345 = new ListNode(1);
node12345.next = new ListNode(2);
node12345.next.next = new ListNode(3);
node12345.next.next.next = new ListNode(4);
node12345.next.next.next.next = new ListNode(5);
tmp = new ListNode(4);
tmp.next = new ListNode(5);
tmp.next.next = new ListNode(1);
tmp.next.next.next = new ListNode(2);
tmp.next.next.next.next = new ListNode(3);
if (rotateRight(node12345, 2).equals(tmp)) {
    console.log("pass")
} else {
    console.error("failed")
}