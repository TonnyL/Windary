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

class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None


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


node0 = ListNode(0)
node5 = ListNode(5)

node243 = ListNode(2)
node243.next = ListNode(4)
node243.next.next = ListNode(3)

node564 = ListNode(5)
node564.next = ListNode(6)
node564.next.next = ListNode(4)

node1 = ListNode(1)
node99 = ListNode(9)
node99.next = ListNode(9)

atn = AddTwoNumbers()

result0 = atn.addTwoNumbers(node0, node0)
result5 = atn.addTwoNumbers(node5, node5)
result243And564 = atn.addTwoNumbers(node243, node564)
result1And99 = atn.addTwoNumbers(node1, node99)

# Expect:
# result: [0][0] ->  0
print("result: [0][0] -> ", result0.val)
# Expect:
# result: [5][5] ->  0  ->  1
print("result: [5][5] -> ", result5.val, " -> ", result5.next.val)
# Expect:
# result: [2,4,3] + [5,6,4] ->  7  ->  0  ->  8
print("result: [2,4,3] + [5,6,4] -> ", result243And564.val, " -> ", result243And564.next.val, " -> ",
      result243And564.next.next.val)
# Expect:
# result: [1] + [9,9] ->  0  ->  0  ->  1
print("result: [1] + [9,9] -> ", result1And99.val, " -> ", result1And99.next.val, " -> ", result1And99.next.next.val)
