# Given a list, rotate the list to the right by k places, where k is non-negative.
#
# Example:
#
# Given 1->2->3->4->5->NULL and k = 2,
#
# return 4->5->1->2->3->NULL.
#
# Python, Python3 all accepted.
class RotateList:
    def rotateRight(self, head, k):
        """
        :type head: ListNode
        :type k: int
        :rtype: ListNode
        """
        if head is None or head.next is None:
            return head

        node = head
        length = 1
        while node.next is not None:
            length += 1

            node = node.next

        # Form a circle
        node.next = head
        k %= length

        for i in range(0, length - k):
            node = node.next
        head = node.next
        node.next = None

        return head


class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

    def __str__(self):
        return "ListNode val: " + str(self.val) + " next: -> " + str(self.next)


rl = RotateList()

# Expected: None
print(rl.rotateRight(None, 1))

# Expected: 1
print(rl.rotateRight(ListNode(1), 1))

# Expected: 1 -> 2
node12 = ListNode(1)
node12.next = ListNode(2)
print(rl.rotateRight(node12, 0))

# Expected: 3 -> 1 -> 2
node123 = ListNode(1)
node123.next = ListNode(2)
node123.next.next = ListNode(3)
print(rl.rotateRight(node123, 1))

node12345 = ListNode(1)
node12345.next = ListNode(2)
node12345.next.next = ListNode(3)
node12345.next.next.next = ListNode(4)
node12345.next.next.next.next = ListNode(5)
print(rl.rotateRight(node12345, 2))
