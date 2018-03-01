# Sort a linked list using insertion sort.
#
# Python2 time limit exceeded. Python3 accepted.


class InsertionSortList:
    def insertionSortList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        fakeHead = ListNode(0)
        while head is not None:
            pre = fakeHead

            while pre.next is not None and pre.next.val <= head.val:
                pre = pre.next

            headNext = head.next
            head.next = pre.next

            pre.next = head
            head = headNext

        return fakeHead.next


class ListNode(object):

    def __init__(self, x):
        self.val = x
        self.next = None

    def __eq__(self, other):
        return self.val == other.val and self.next == other.next
