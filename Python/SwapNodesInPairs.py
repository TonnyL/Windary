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

    def __eq__(self, other):
        return self.val == other.val and self.next == other.next
