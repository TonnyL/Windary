# -*- coding: UTF-8 -*-
#
# Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.
# You may assume the integer do not contain any leading zero, except the number 0 itself.
# The digits are stored such that the most significant digit is at the head of the list.
#
# Python, Python 3 all accepted.


class PlusOne:
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        flag = False
        digits[-1] += 1

        index = len(digits) - 1
        while index >= 0:
            if flag:
                digits[index] += 1

            if digits[index] >= 10:
                flag = True
                digits[index] %= 10
            else:
                flag = False

            index -= 1

        if flag:
            digits.insert(0, 1)

        return digits
