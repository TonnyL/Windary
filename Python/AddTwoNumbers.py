# -*- coding: UTF-8 -*-
#
# You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
#
# You may assume the two numbers do not contain any leading zero, except the number 0 itself.
#
# Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
# Output: 7 -> 0 -> 8
#
# Result: Accept


class AddTwoNumbers(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        tmp1 = l1.next
        tmp2 = l2.next

        result = ListNode((l1.val + l2.val) % 10)

        results = []

        addOne = (l1.val + l2.val >= 10)

        if addOne:
            result.next = ListNode(1)

        results.append(result)

        while True:
            if tmp1 is None and tmp2 is None:
                break
            else:
                tmp = 0
                if tmp1 is None:
                    tmp = tmp2.val
                elif tmp2 is None:
                    tmp = tmp1.val
                else:
                    tmp = tmp1.val + tmp2.val

                if addOne:
                    tmp += 1

                addOne = (tmp >= 10)

                result = ListNode(tmp % 10)

                if addOne:
                    result.next = ListNode(1)

                results.append(result)

                if tmp1 is not None:
                    tmp1 = tmp1.next

                if tmp2 is not None:
                    tmp2 = tmp2.next

        rst = results[0]
        for i in range(1, len(results)):
            rst.next = results[i]
            rst = rst.next

        return results[0]


class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

    def __eq__(self, other):
        return self.val == other.val and self.next == other.next
