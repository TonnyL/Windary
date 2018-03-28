/**
 * Write a program to find the node at which the intersection of two singly linked lists begins.
 *
 * For example, the following two linked lists:
 * `
 * A:          a1 → a2
 *                     ↘
 *                     c1 → c2 → c3
 *                     ↗
 * B:     b1 → b2 → b3
 * `
 * begin to intersect at node c1.
 *
 * Notes:
 *
 * If the two linked lists have no intersection at all, return null.
 * The linked lists must retain their original structure after the function returns.
 * You may assume there are no cycles anywhere in the entire linked structure.
 * Your code should preferably run in O(n) time and use only O(1) memory.
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
 * @param {ListNode} headA
 * @param {ListNode} headB
 * @return {ListNode}
 */
let getIntersectionNode = function (headA, headB) {
    if (headA == null || headB == null) {
        return null;
    }

    let a = headA, b = headB;
    while (a !== b) {
        a = (a != null) ? a.next : headB;
        b = (b != null) ? b.next : headA;
    }

    return a;
};

if (getIntersectionNode(null, null) == null) {
    console.log("pass")
} else {
    console.error("failed")
}

let node345 = new ListNode(3);
node345.next = new ListNode(4);
node345.next.next = new ListNode(5);

if (getIntersectionNode(node345, new ListNode(6)) == null) {
    console.log("pass")
} else {
    console.error("failed")
}

let node12345 = new ListNode(1);
node12345.next = new ListNode(2);
node12345.next.next = node345;

if (getIntersectionNode(node12345, node345).equals(node345)) {
    console.log("pass")
} else {
    console.error("failed")
}