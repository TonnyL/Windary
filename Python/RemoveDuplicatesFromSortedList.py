# -*- coding: UTF-8 -*-
#
# Given a sorted linked list, delete all duplicates such that each element appear only once.
#
# For example,
# Given 1->1->2, return 1->2.
# Given 1->1->2->3->3, return 1->2->3.
#
# Python, Python 3 all accepted.


class RemoveDuplicatesFromSortedList:
    def deleteDuplicates(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        node = head
        while node is not None and node.next is not None:
            if node.val == node.next.val:
                tmp = node.next
                node.next = tmp.next
                tmp.next = None
            else:
                node = node.next
        return head


class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

    def __eq__(self, other):
        return self.val == other.val and self.next == other.next
