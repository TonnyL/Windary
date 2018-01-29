# Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.
#
# You should preserve the original relative order of the nodes in each of the two partitions.
#
# For example,
# Given 1->4->3->2->5->2 and x = 3,
# return 1->2->2->4->3->5.
#
# Python, Python3 all accepted.


class PartitionList:
    def partition(self, head, x):
        """
        :type head: ListNode
        :type x: int
        :rtype: ListNode
        """
        node = head
        greater = None
        greaterHead = None
        less = None
        lessHead = None
        while node is not None:
            if node.val < x:
                if less is None:
                    less = ListNode(node.val)
                    lessHead = less
                else:
                    less.next = ListNode(node.val)
                    less = less.next
            else:
                if greater is None:
                    greater = ListNode(node.val)
                    greaterHead = greater
                else:
                    greater.next = ListNode(node.val)
                    greater = greater.next

            node = node.next

        if greaterHead is None:
            return lessHead
        elif lessHead is None:
            return greaterHead

        less.next = greaterHead
        return lessHead


class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

    def __eq__(self, other):
        return self.val == other.val and self.next == other.next
