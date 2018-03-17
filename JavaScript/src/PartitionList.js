/**
 * Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.
 *
 * You should preserve the original relative order of the nodes in each of the two partitions.
 *
 * For example,
 * Given 1->4->3->2->5->2 and x = 3,
 * return 1->2->2->4->3->5.
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
 * @param {number} x
 * @return {ListNode}
 */
let partition = function (head, x) {
    let node = head, greater = null, greaterHead = null, less = null, lessHead = null;

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
};


if (partition(null, 2) == null) {
    console.log("pass")
} else {
    console.error("failed")
}

let node12 = new ListNode(1);
node12.next = new ListNode(2);
let tmp = new ListNode(1);
tmp.next = new ListNode(2);
if (partition(node12, 3).equals(tmp)) {
    console.log("pass")
} else {
    console.error("failed")
}

if (partition(node12, 0).equals(tmp)) {
    console.log("pass")
} else {
    console.error("failed")
}

let node143252 = new ListNode(1);
node143252.next = new ListNode(4);
node143252.next.next = new ListNode(3);
node143252.next.next.next = new ListNode(2);
node143252.next.next.next.next = new ListNode(5);
node143252.next.next.next.next.next = new ListNode(2);
tmp = new ListNode(1);
tmp.next = new ListNode(2);
tmp.next.next = new ListNode(2);
tmp.next.next.next = new ListNode(4);
tmp.next.next.next.next = new ListNode(3);
tmp.next.next.next.next.next = new ListNode(5);
if (partition(node143252, 3).equals(tmp)) {
    console.log("pass")
} else {
    console.error("failed")
}

tmp = new ListNode(1);
tmp.next = new ListNode(3);
tmp.next.next = new ListNode(2);
tmp.next.next.next = new ListNode(2);
tmp.next.next.next.next = new ListNode(4);
tmp.next.next.next.next.next = new ListNode(5);
if (partition(node143252, 4).equals(tmp)) {
    console.log("pass")
} else {
    console.error("failed")
}