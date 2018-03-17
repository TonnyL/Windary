/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 *
 * Result: Accepted
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
let addTwoNumbers = function (l1, l2) {
    let tmp1 = l1.next;
    let tmp2 = l2.next;

    let results = [];

    let addOne = l1.val + l2.val >= 10;

    let result = new ListNode((l1.val + l2.val) % 10);

    if (addOne) {
        result.next = new ListNode(1);
    }

    results.push(result);

    while (true) {
        if (tmp1 == null && tmp2 == null) {
            break;
        } else {
            let tmp = 0;
            if (tmp1 == null) {
                tmp = tmp2.val;
            } else if (tmp2 == null) {
                tmp = tmp1.val;
            } else {
                tmp = tmp1.val + tmp2.val;
            }

            if (addOne) {
                tmp += 1;
            }

            addOne = tmp >= 10;
            result = new ListNode(tmp % 10);

            if (addOne) {
                result.next = new ListNode(1);
            }

            results.push(result);

            if (tmp1 != null) {
                tmp1 = tmp1.next;
            }
            if (tmp2 != null) {
                tmp2 = tmp2.next;
            }
        }

    }

    let rst = results[0];
    for (let i = 1; i < results.length; i++) {
        rst.next = results[i];
        rst = rst.next;
    }

    return results[0];
};

let node0 = new ListNode(0);
let node5 = new ListNode(5);
if (addTwoNumbers(node0, node0).equals(new ListNode(0))) {
    console.log("pass")
} else {
    console.error("failed")
}

let tmp = new ListNode(0);
tmp.next = new ListNode(1);

if (addTwoNumbers(node5, node5).equals(tmp)) {
    console.log("pass")
} else {
    console.error("failed")
}

let node243 = new ListNode(2);
node243.next = new ListNode(4);
node243.next.next = new ListNode(3);

let node564 = new ListNode(5);
node564.next = new ListNode(6);
node564.next.next = new ListNode(4);

tmp = new ListNode(7);
tmp.next = new ListNode(0);
tmp.next.next = new ListNode(8);
if (addTwoNumbers(node243, node564).equals(tmp)) {
    console.log("pass")
} else {
    console.error("failed")
}

let node1 = new ListNode(1);
node99 = new ListNode(9);
node99.next = new ListNode(9);

tmp = new ListNode(0);
tmp.next = new ListNode(0);
tmp.next.next = new ListNode(1);
if (addTwoNumbers(node1, node99).equals(tmp)) {
    console.log("pass")
} else {
    console.error("failed")
}