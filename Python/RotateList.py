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

    def __eq__(self, other):
        return self.val == other.val and self.next == other.next
