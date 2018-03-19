/**
 * Given a linked list, remove the nth node from the end of list and return its head.
 * 
 * For example,
 * 
 * Given linked list: 1->2->3->4->5, and n = 2.
 * 
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 * Note:
 * Given n will always be valid.
 * Try to do this in one pass.
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
 * @param {number} n
 * @return {ListNode}
 */
let removeNthFromEnd = function(head, n) {
    let stack = [];
    let tmp = null, node = head;

    for (; node != null; node = node.next) {
        stack.push(node);
    }

    for (; n > 0 && stack.length !== 0; n--) {
        tmp = stack[stack.length -1];
        stack.splice(stack.length  - 1);
    }

    if (tmp != null) {
        if (stack.length !== 0) {
            stack[stack.length - 1].next = tmp.next;
        } else {
            head = tmp.next;
        }
    }

    return head;

};


let node12345 = new ListNode(1);
node12345.next = new ListNode(2);
node12345.next.next = new ListNode(3);
node12345.next.next.next = new ListNode(4);
node12345.next.next.next.next = new ListNode(5);
let tmp = new ListNode(1);
tmp.next = new ListNode(2);
tmp.next.next = new ListNode(3);
tmp.next.next.next = new ListNode(5);
if(removeNthFromEnd(node12345, 2).equals(tmp)){
    console.log("pass")
} else {
    console.error("failed")
}

let node12 = new ListNode(1);
node12.next = new ListNode(2);
tmp = new ListNode(1);
if(removeNthFromEnd(node12, 1).equals(tmp)) {
    console.log("pass")
} else {
    console.error("failed")
}

if (removeNthFromEnd(new ListNode(1), 1) === null) {
    console.log("pass")
} else {
    console.error("failed")
}

if (removeNthFromEnd(null, 2) === null) {
    console.log("pass")
} else {
    console.error("failed")
}

let node123 = new ListNode(1);
node123.next = new ListNode(2);
node123.next.next = new ListNode(3);
tmp = new ListNode(2);
tmp.next = new ListNode(3);
node123 = removeNthFromEnd(node123, 3);
if(node123, tmp);
tmp = new ListNode(2);
if(removeNthFromEnd(node123, 1).equals(tmp)) {
    console.log("pass")
} else {
    console.error("failed")
}
if (removeNthFromEnd(node123, 1) === null) {
    console.log("pass")
} else {
    console.error("failed")
}