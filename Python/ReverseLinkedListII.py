# Reverse a linked list from position m to n. Do it in-place and in one-pass.
#
# For example:
# Given 1->2->3->4->5->NULL, m = 2 and n = 4,
#
# return 1->4->3->2->5->NULL.
#
# Note:
# Given m, n satisfy the following condition:
# 1 ≤ m ≤ n ≤ length of list.
#
# Python, Python3 all accepted.


class ReverseLinkedListII:
    def reverseBetween(self, head, m, n):
        """
        :type head: ListNode
        :type m: int
        :type n: int
        :rtype: ListNode
        """
        node = head
        lst = []

        i = 0
        while i <= n - 1 and node is not None:
            if m - 1 <= i:
                lst.append(node)
            node = node.next

            i += 1

        while len(lst) >= 2:
            tmp = lst[0].val
            size = len(lst)
            lst[0].val = lst[size - 1].val
            lst[size - 1].val = tmp

            del lst[0]
            del lst[size - 2]

        return head


class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

    def __eq__(self, other):
        return self.val == other.val and self.next == other.next
