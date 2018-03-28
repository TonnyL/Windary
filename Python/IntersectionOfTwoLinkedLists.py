# Write a program to find the node at which the intersection of two singly linked lists begins.
#
# For example, the following two linked lists:
#
# A:          a1 → a2
#                     ↘
#                     c1 → c2 → c3
#                     ↗
# B:     b1 → b2 → b3
#
# begin to intersect at node c1.
#
# Notes:
#
# If the two linked lists have no intersection at all, return null.
# The linked lists must retain their original structure after the function returns.
# You may assume there are no cycles anywhere in the entire linked structure.
# Your code should preferably run in O(n) time and use only O(1) memory.
#
# Accepted.


class IntersectionOfTwoLinkedLists:
    def getIntersectionNode(self, headA, headB):
        """
        :type head1, head1: ListNode
        :rtype: ListNode
        """
        if headA is None or headB is None:
            return None

        a, b = headA, headB
        while a != b:
            a = a.next if a is not None else headB
            b = b.next if b is not None else headA

        return a


class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

    def __eq__(self, other):
        if self is None and other is None:
            return True
        if self is None and other is None or self is not None and other is None:
            return False
        return self.val == other.val and self.next == other.next
