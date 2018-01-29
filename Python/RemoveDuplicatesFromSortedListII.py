# -*- coding: UTF-8 -*-
#
# Given a sorted linked list, delete all nodes that have duplicate numbers,
# leaving only distinct numbers from the original list.
#
# For example,
# Given 1->2->3->3->4->4->5, return 1->2->5.
# Given 1->1->1->2->3, return 2->3.
#
# Python, Python 3 all accepted.


class RemoveDuplicatesFromSortedListII:
    def deleteDuplicates(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if head is None:
            return None

        fake_head = ListNode(0)
        fake_head.next = head
        node = fake_head

        while node.next is not None:
            tmp = node.next
            if tmp.next is not None and tmp.val == tmp.next.val:
                while tmp.next is not None and tmp.val == tmp.next.val:
                    tmp = tmp.next
                node.next = tmp.next
                tmp.next = None
            else:
                node = node.next

        return fake_head.next


class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

    def __eq__(self, other):
        return self.val == other.val and self.next == other.next
