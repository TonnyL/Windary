/**
 * Sort a linked list using insertion sort.
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
let insertionSortList = function (head) {
    let fakeHead = new ListNode(0);

    while (head != null) {
        let pre = fakeHead;

        while (pre.next != null && pre.next.val <= head.val) {
            pre = pre.next;
        }

        let headNext = head.next;
        head.next = pre.next;

        pre.next = head;
        head = headNext;
    }

    return fakeHead.next;
};

if (insertionSortList(null) == null) {
    console.log("pass")
} else {
    console.error("failed")
}

/*
if (insertionSortList(new ListNode(1)) === new ListNode(1)) {
    console.log("pass")
} else {
    console.error("failed")
}

let node0 = new ListNode(1);
node0.next = new ListNode(0);
node1 = new ListNode(0);
node1.next = new ListNode(1);
if (insertionSortList(node0) === node1) {
    console.log("pass")
} else {
    console.error("failed")
}*/
