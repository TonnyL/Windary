/**
 * Given a sorted linked list, delete all nodes that have duplicate numbers,
 * leaving only distinct numbers from the original list.
 *
 * For example,
 * Given 1->2->3->3->4->4->5, return 1->2->5.
 * Given 1->1->1->2->3, return 2->3.
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
    if (head == null) {
        return null;
    }

    let fakeHead = new ListNode(0);
    fakeHead.next = head;
    let node = fakeHead;

    while (node.next != null) {
        let tmp = node.next;
        if (tmp.next != null && tmp.val === tmp.next.val) {
            while (tmp.next != null && tmp.val === tmp.next.val)
                tmp = tmp.next;
            node.next = tmp.next;
            tmp.next = null;
        } else {
            node = node.next;
        }
    }
    return fakeHead.next;
};


let node1233445 = new ListNode(1);
node1233445.next = new ListNode(2);
node1233445.next.next = new ListNode(3);
node1233445.next.next.next = new ListNode(3);
node1233445.next.next.next.next = new ListNode(4);
node1233445.next.next.next.next.next = new ListNode(4);
node1233445.next.next.next.next.next.next = new ListNode(5);
let tmp = new ListNode(1);
tmp.next = new ListNode(2);
tmp.next.next = new ListNode(5);
if (deleteDuplicates(node1233445).equals(tmp)) {
    console.log("pass")
} else {
    console.error("failed")
}

let node11123 = new ListNode(1);
node11123.next = new ListNode(1);
node11123.next.next = new ListNode(1);
node11123.next.next.next = new ListNode(2);
node11123.next.next.next.next = new ListNode(3);
tmp = new ListNode(2);
tmp.next = new ListNode(3);
if (deleteDuplicates(node11123).equals(tmp)) {
    console.log("pass")
} else {
    console.error("failed")
}

let node111 = new ListNode(1);
node111.next = new ListNode(1);
node111.next.next = new ListNode(1);
if (deleteDuplicates(node111) == null) {
    console.log("pass")
} else {
    console.error("failed")
}

if (deleteDuplicates(null) == null) {
    console.log("pass")
} else {
    console.error("failed")
}

let node122 = new ListNode(1);
node122.next = new ListNode(2);
node122.next.next = new ListNode(2);
tmp = new ListNode(1);
if (deleteDuplicates(node122).equals(tmp)) {
    console.log("pass")
} else {
    console.error("failed")
}

let node11 = new ListNode(1);
node11.next = new ListNode(1);
if (deleteDuplicates(node11) == null) {
    console.log("pass")
} else {
    console.error("failed")
}

let node1122 = new ListNode(1);
node1122.next = new ListNode(1);
node1122.next.next = new ListNode(2);
node1122.next.next.next = new ListNode(2);
if (deleteDuplicates(node1122) == null) {
    console.log("pass")
} else {
    console.error("failed")
}