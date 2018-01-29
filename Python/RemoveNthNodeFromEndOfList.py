# -*- coding: UTF-8 -*-
#
# Given a linked list, remove the nth node from the end of list and return its head.
#
# For example,
#
# Given linked list: 1->2->3->4->5, and n = 2.
#
# After removing the second node from the end, the linked list becomes 1->2->3->5.
# Note:
# Given n will always be valid.
# Try to do this in one pass.
#
# Python, Python 3 all accepted.


class RemoveNthNodeFromEndOfList:
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        stack = Stack()
        tmp = None
        node = head

        while node is not None:
            stack.push(node)
            node = node.next

        while n > 0 and not stack.isEmpty():
            tmp = stack.pop()
            n -= 1

        if tmp is not None:
            if not stack.isEmpty():
                stack.peek().next = tmp.next
            else:
                head = tmp.next

        return head


class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

    def __eq__(self, other):
        return self.val == other.val and self.next == other.next


class Stack:
    def __init__(self):
        self.items = []

    def isEmpty(self):
        return self.items == []

    def push(self, item):
        self.items.insert(0, item)

    def pop(self):
        return self.items.pop(0)

    def peek(self):
        return self.items[0]

    def size(self):
        return len(self.items)
