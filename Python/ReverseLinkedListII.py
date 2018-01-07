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

    def __str__(self):
        return "ListNode val: " + str(self.val) + " next: -> " + str(self.next)


r = ReverseLinkedListII()

# Expected: None
print(r.reverseBetween(None, 1, 2))

node123 = ListNode(1)
node123.next = ListNode(2)
node123.next.next = ListNode(3)
# Expected: 1 -> 3 -> 2
print(r.reverseBetween(node123, 2, 3))

# Expected: 1
print(r.reverseBetween(ListNode(1), 1, 1))

node12 = ListNode(1)
node12.next = ListNode(2)
# Expected: 2 -> 1
print(r.reverseBetween(node12, 1, 2))

node12345 = ListNode(1)
node12345.next = ListNode(2)
node12345.next.next = ListNode(3)
node12345.next.next.next = ListNode(4)
node12345.next.next.next.next = ListNode(5)
# Expected: 1 -> 4 -> 3 -> 2 -> 5
print(r.reverseBetween(node12345, 2, 4))
