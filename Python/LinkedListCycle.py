# Given a linked list, determine if it has a cycle in it.
#
# Follow up:
# Can you solve it without using extra space?
#
#


class LinkedListCycle:

    # Time limit exceed.
    # def hasCycle(self, head):
    #     """
    #     :type head: ListNode
    #     :rtype: bool
    #     """
    #     if head is None or head.next is None:
    #         return False
    #     node = head.next
    #     while node != head:
    #         if node is None:
    #             return False
    #         node = node.next
    #
    #     return True

    # Accepted.
    def hasCycle(self, head):
        slow, fast = head, head
        while fast is not None and fast.next is not None:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                return True

        return False


class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None
