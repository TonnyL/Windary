/**
 * Reverse a linked list from position m to n. Do it in-place and in one-pass.
 *
 * For example:
 * Given 1->2->3->4->5->NULL, m = 2 and n = 4,
 *
 * return 1->4->3->2->5->NULL.
 *
 * Note:
 * Given m, n satisfy the following condition:
 * 1 ≤ m ≤ n ≤ length of list.
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
 * @param {number} m
 * @param {number} n
 * @return {ListNode}
 */
let reverseBetween = function (head, m, n) {
    let node = head;
    let list = [];

    for (let i = 0; i <= n - 1 && node != null; i++) {
        if (m - 1 <= i) {
            list.push(node);
        }
        node = node.next;
    }

    while (list.length >= 2) {
        let tmp = list[0].val;
        list[0].val = list[list.length - 1].val;
        list[list.length - 1].val = tmp;

        list.splice(0, 1);
        list.splice(list.length - 1, 1);
    }

    return head;
};


if (reverseBetween(null, 1, 2) === null) {
    console.log("pass")
} else {
    console.error("failed")
}

let node123 = new ListNode(1);
node123.next = new ListNode(2);
node123.next.next = new ListNode(3);
let tmp = new ListNode(1);
tmp.next = new ListNode(3);
tmp.next.next = new ListNode(2);
if (reverseBetween(node123, 2, 3).equals(tmp)) {
    console.log("pass")
} else {
    console.error("failed")
}

if (reverseBetween(new ListNode(1), 1, 1).equals(new ListNode(1))) {
    console.log("pass")
} else {
    console.error("failed")
}

let node12 = new ListNode(1);
node12.next = new ListNode(2);
tmp = new ListNode(2);
tmp.next = new ListNode(1);
if (reverseBetween(node12, 1, 2).equals(tmp)) {
    console.log("pass")
} else {
    console.error("failed")
}

let node12345 = new ListNode(1);
node12345.next = new ListNode(2);
node12345.next.next = new ListNode(3);
node12345.next.next.next = new ListNode(4);
node12345.next.next.next.next = new ListNode(5);
tmp = new ListNode(1);
tmp.next = new ListNode(4);
tmp.next.next = new ListNode(3);
tmp.next.next.next = new ListNode(2);
tmp.next.next.next.next = new ListNode(5);
if (reverseBetween(node12345, 2, 4).equals(tmp)) {
    console.log("pass")
} else {
    console.error("failed")
}
