/**
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 *
 * For example,
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
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
let deleteDuplicates = function (head) {
    let node = head;
    while (node != null && node.next != null) {
        if (node.val === node.next.val) {
            let tmp = node.next;
            node.next = tmp.next;
            tmp.next = null;
        } else {
            node = node.next;
        }
    }
    return head;

};


if (deleteDuplicates(null) == null) {
    console.log("pass")
} else {
    console.error("failed")
}

let node112 = new ListNode(1);
node112.next = new ListNode(1);
node112.next.next = new ListNode(2);
let tmp = new ListNode(1);
tmp.next = new ListNode(2);
if (deleteDuplicates(node112).equals(tmp)) {
    console.log("pass")
} else {
    console.error("failed")
}

let node11233 = new ListNode(1);
node11233.next = new ListNode(1);
node11233.next.next = new ListNode(2);
node11233.next.next.next = new ListNode(3);
node11233.next.next.next.next = new ListNode(3);
tmp = new ListNode(1);
tmp.next = new ListNode(2);
tmp.next.next = new ListNode(3);
if (deleteDuplicates(node11233).equals(tmp)) {
    console.log("pass")
} else {
    console.error("failed")
}

let node111 = new ListNode(1);
node111.next = new ListNode(1);
node111.next.next = new ListNode(1);
tmp = new ListNode(1);
if (deleteDuplicates(node111).equals(tmp)) {
    console.log("pass")
} else {
    console.error("failed")
}

let node1222 = new ListNode(1);
node1222.next = new ListNode(2);
node1222.next.next = new ListNode(2);
node1222.next.next.next = new ListNode(2);
tmp.next = new ListNode(2);
if (deleteDuplicates(node1222).equals(tmp)) {
    console.log("pass")
} else {
    console.error("failed")
}

let node1122 = new ListNode(1);
node1122.next = new ListNode(1);
node1122.next = new ListNode(2);
node1122.next.next = new ListNode(2);
if (deleteDuplicates(node1122).equals(tmp)) {
    console.log("pass")
} else {
    console.error("failed")
}