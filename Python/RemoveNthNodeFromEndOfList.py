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

    def __str__(self):
        return "ListNode val: " + str(self.val) + " next: -> " + str(self.next)


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


r = RemoveNthNodeFromEndOfList()

node12345 = ListNode(1)
node12345.next = ListNode(2)
node12345.next.next = ListNode(3)
node12345.next.next.next = ListNode(4)
node12345.next.next.next.next = ListNode(5)
# Expected: 1->2->3->5
print(r.removeNthFromEnd(node12345, 2))

node12 = ListNode(1)
node12.next = ListNode(2)
# Expected: 1
print(r.removeNthFromEnd(node12, 1))

# Expected: None
print(r.removeNthFromEnd(ListNode(1), 1))

# Expected: None
print(r.removeNthFromEnd(None, 2))

node123: ListNode = ListNode(1)
node123.next = ListNode(2)
node123.next.next = ListNode(3)
# Expected: 2->3
node123 = r.removeNthFromEnd(node123, 3)
print(node123)
# Expected: 2
print(r.removeNthFromEnd(node123, 1))
# Expected: None
print(r.removeNthFromEnd(node123, 1))
