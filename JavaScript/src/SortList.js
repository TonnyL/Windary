/**
 * Sort a linked list in O(n log n) time using constant space complexity.
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
let sortList = function (head) {
    if (head == null || head.next == null) {
        return head;
    }

    let slow = head, fast = head, pre = head;

    while (fast != null && fast.next != null) {
        pre = slow;
        slow = slow.next;
        fast = fast.next.next;
    }
    pre.next = null;
    return merge(sortList(head), sortList(slow));
};

let merge = function (l1, l2) {
    if (l1 == null) {
        return l2;
    }
    if (l2 == null) {
        return l1;
    }
    if (l1.val < l2.val) {
        l1.next = merge(l1.next, l2);
        return l1;
    }
    l2.next = merge(l1, l2.next);
    return l2;
};

if (sortList(null) == null) {
    console.log("pass")
} else {
    console.error("failed")
}

if (0 === sortList(new ListNode(0)).val) {
    console.log("pass")
} else {
    console.error("failed")
}

let node1 = new ListNode(1);
node1.next = new ListNode(0);

let node2 = new ListNode(0);
node2.next = new ListNode(1);

let tmp = sortList(node1);
if (node2.val === tmp.val && node2.next.val === tmp.next.val) {
    console.log("pass")
} else {
    console.error("failed")
}

let node3 = new ListNode(0);
node3.next = new ListNode(1);
tmp = sortList(node2);
if (node3.val === tmp.val && node3.next.val === tmp.next.val) {
    console.log("pass")
} else {
    console.error("failed")
}