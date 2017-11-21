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

    def __str__(self):
        return "ListNode val: " + str(self.val) + " next: -> " + str(self.next)


r = RemoveDuplicatesFromSortedListII()

# Expected: 1 -> 2 -> 5
node1233445 = ListNode(1)
node1233445.next = ListNode(2)
node1233445.next.next = ListNode(3)
node1233445.next.next.next = ListNode(3)
node1233445.next.next.next.next = ListNode(4)
node1233445.next.next.next.next.next = ListNode(4)
node1233445.next.next.next.next.next.next = ListNode(5)
print(r.deleteDuplicates(node1233445))

# Expected: 2 -> 3
node11123 = ListNode(1)
node11123.next = ListNode(1)
node11123.next.next = ListNode(1)
node11123.next.next.next = ListNode(2)
node11123.next.next.next.next = ListNode(3)
print(r.deleteDuplicates(node11123))

# Expected: null
node111 = ListNode(1)
node111.next = ListNode(1)
node111.next.next = ListNode(1)
print(r.deleteDuplicates(node111))

# Expected: null
print(r.deleteDuplicates(None))

# Expected: 1
node122 = ListNode(1)
node122.next = ListNode(2)
node122.next.next = ListNode(2)
print(r.deleteDuplicates(node122))

# Expected: null
node11 = ListNode(1)
node11.next = ListNode(1)
print(r.deleteDuplicates(node11))

# Expected: null
node1122 = ListNode(1)
node1122.next = ListNode(1)
node1122.next.next = ListNode(2)
node1122.next.next.next = ListNode(2)
print(r.deleteDuplicates(node1122))
