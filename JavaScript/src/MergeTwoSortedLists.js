/**
 * Merge two sorted linked lists and return it as a new list.
 * The new list should be made by splicing together the nodes of the first two lists.
 *
 * Example:
 *
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
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
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
let mergeTwoLists = function (l1, l2) {
    let result = new ListNode(0);
    let fakeHeader = result;

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
};

let node1 = new ListNode(1);
node1.next = new ListNode(2);
node1.next.next = new ListNode(4);

let node2 = new ListNode(1);
node2.next = new ListNode(3);
node2.next.next = new ListNode(4);

let tmp = new ListNode(1);
tmp.next = new ListNode(1);
tmp.next.next = new ListNode(2);
tmp.next.next.next = new ListNode(3);
tmp.next.next.next.next = new ListNode(4);
tmp.next.next.next.next.next = new ListNode(4);
if (mergeTwoLists(node1, node2).equals(tmp)) {
    console.log("pass")
} else {
    console.error("failed")
}

tmp = new ListNode(1);
tmp.next = new ListNode(2);
tmp.next.next = new ListNode(4);
if (mergeTwoLists(node1, null).equals(tmp)) {
    console.log("pass")
} else {
    console.error("failed")
}

tmp = new ListNode(1);
tmp.next = new ListNode(3);
tmp.next.next = new ListNode(4);
if (mergeTwoLists(null, node2).equals(tmp)) {
    console.log("pass")
} else {
    console.error("failed")
}

if (mergeTwoLists(null, null) == null) {
    console.log("pass")
} else {
    console.error("failed")
}