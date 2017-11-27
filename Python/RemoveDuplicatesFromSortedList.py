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

    def __str__(self):
        return "ListNode val: " + str(self.val) + " next: -> " + str(self.next)


r = RemoveDuplicatesFromSortedList()

# Expected: None
print(r.deleteDuplicates(None))

node112 = ListNode(1)
node112.next = ListNode(1)
node112.next.next = ListNode(2)
# Expected: 1 -> 2
print(r.deleteDuplicates(node112))

node11233 = ListNode(1)
node11233.next = ListNode(1)
node11233.next.next = ListNode(2)
node11233.next.next.next = ListNode(3)
node11233.next.next.next.next = ListNode(3)
# Expected: 1 -> 2 -> 3
print(r.deleteDuplicates(node11233))

node111 = ListNode(1)
node111.next = ListNode(1)
node111.next.next = ListNode(1)
# Expected: 1
print(r.deleteDuplicates(node111))

node1222 = ListNode(1)
node1222.next = ListNode(2)
node1222.next.next = ListNode(2)
node1222.next.next.next = ListNode(2)
# Expected: 1 -> 2
print(r.deleteDuplicates(node1222))

node1122 = ListNode(1)
node1122.next = ListNode(1)
node1122.next.next = ListNode(2)
node1122.next.next.next = ListNode(2)
# Expected: 1 -> 2
print(r.deleteDuplicates(node1122))
