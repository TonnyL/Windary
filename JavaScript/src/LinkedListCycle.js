/**
 * Given a linked list, determine if it has a cycle in it.
 *
 * Follow up:
 * Can you solve it without using extra space?
 */


function ListNode(val) {
    this.val = val;
    this.next = null;
}

/**
 * @param {ListNode} head
 * @return {boolean}
 */
// Time limit exceeded.
/*let hasCycle = function (head) {
    if (head == null || head.next == null) {
        return false;
    }
    let node = head.next;
    while (node !== head) {
        if (node == null) {
            return false;
        }
        node = node.next;
    }
    return true;
};*/

// Accepted.
let hasCycle = function (head) {
    let slow = head, fast = head;
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        if (slow === fast) {
            return true;
        }
    }
    return false;
};


if (hasCycle(null) === false) {
    console.log("pass")
} else {
    console.error("failed")
}

if (hasCycle(new ListNode(0)) === false) {
    console.log("pass")
} else {
    console.error("failed")
}

let node0 = new ListNode(0);
node0.next = new ListNode(1);
node0.next.next = node0;
if (hasCycle(node0)) {
    console.log("pass")
} else {
    console.error("failed")
}

let node1 = new ListNode(0);
node1.next = new ListNode(1);
node1.next.next = new ListNode(2);
node1.next.next.next = new ListNode(0);
if (hasCycle(node1) === false) {
    console.log("pass")
} else {
    console.error("failed")
}