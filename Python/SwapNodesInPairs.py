# -*- coding: UTF-8 -*-
#
# Given a linked list, swap every two adjacent nodes and return its head.
#
# For example,
# Given 1->2->3->4, you should return the list as 2->1->4->3.
#
# Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.
#
# Python, Python3 all accepted.
class SwapNodesInPairs:
    def swapPairs(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if head is None or head.next is None:
            return head
        pre = head
        nxt = pre.next
        while pre is not None and nxt is not None:
            tmp = nxt.val
            nxt.val = pre.val
            pre.val = tmp

            pre = nxt.next
            if pre is not None:
                nxt = pre.next

        return head


class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

    def __str__(self):
        return "ListNode val: " + str(self.val) + " next: -> " + str(self.next)


s = SwapNodesInPairs()

# Expected: null
print(s.swapPairs(None))

# Expected: 1
print(s.swapPairs(ListNode(1)))

# Expected: 2 -> 1
node12 = ListNode(1)
node12.next = ListNode(2)
print(s.swapPairs(node12))

# Expected: 2 -> 1 -> 4 -> 3
node1234 = ListNode(1)
node1234.next = ListNode(2)
node1234.next.next = ListNode(3)
node1234.next.next.next = ListNode(4)
print(s.swapPairs(node1234))

# Expected: 2 -> 1 -> 4 -> 3 -> 5
node12345 = ListNode(1)
node12345.next = ListNode(2)
node12345.next.next = ListNode(3)
node12345.next.next.next = ListNode(4)
node12345.next.next.next.next = ListNode(5)
print(s.swapPairs(node12345))
