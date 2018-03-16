# Sort a linked list in O(n log n) time using constant space complexity.
#
# Python, Python3 all accepted.


class SortList:
    def sortList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if head is None or head.next is None:
            return head

        slow, fast, pre = head, head, head
        while fast is not None and fast.next is not None:
            pre = slow
            slow = slow.next
            fast = fast.next.next

        pre.next = None
        return self.merge(self.sortList(head), self.sortList(slow))

    # RecursionError: maximum recursion depth exceeded in comparison
    # def merge(self, l1, l2):
    #     """
    #     :param l1: ListNode
    #     :param l2: ListNode
    #     :return: ListNode
    #     """
    #     if l1 is None:
    #         return l2
    #
    #     if l2 is None:
    #         return l1
    #
    #     if l1.val < l2.val:
    #         l1.next = self.merge(l1.next, l2)
    #         return l1
    #
    #     l2.next = self.merge(l1, l2.next)
    #     return l2

    def merge(self, l1, l2):
        """
        :param l1: ListNode
        :param l2: ListNode
        :return: ListNode
        """
        dummy = ListNode(-1)
        cur = dummy
        while l1 is not None and l2 is not None:
            if l1.val < l2.val:
                cur.next = l1
                l1 = l1.next
            else:
                cur.next = l2
                l2 = l2.next
            cur = cur.next

        if l1 is not None:
            cur.next = l1
        if l2 is not None:
            cur.next = l2
        return dummy.next


class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

    def __eq__(self, other):
        return self.val == other.val and self.next == other.next
