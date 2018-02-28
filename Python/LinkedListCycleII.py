# Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
#
# Note: Do not modify the linked list.
#
# Follow up:
# Can you solve it without using extra space?
#
# Accepted.


class LinkedListCycleII:
    def detectCycle(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        slow, fast = head, head
        while fast is not None and fast.next is not None:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                while slow != head:
                    head = head.next
                    slow = slow.next
                return head

        return None


class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None
