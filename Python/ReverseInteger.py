# -*- coding: UTF-8 -*-
# Reverse digits of an integer.
# 
# Example1: x = 123, return 321
# Example2: x = -123, return -321
# 
# Have you thought about this?
# Here are some good questions to ask before coding. Bonus points for you if you have already thought through this!
# If the integer's last digit is 0, what should the output be? ie, cases such as 10, 100.
# Did you notice that the reversed integer might overflow? Assume the input is a 32-bit integer, then the reverse of 1000000003 overflows.
# How should you handle such cases?
# For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
# 
# Note:
# The input is assumed to be a 32-bit signed integer. Your function should return 0 when the reversed integer overflows.
#
# Python, Python 3 all accepted.
import math


class ReverseInteger(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        if x == 0:
            return 0

        result = 0
        is_positive = (x > 0)
        x = math.fabs(x)
        while x != 0:
            result = result * 10 + x % 10
            x //= 10

        max_int = math.pow(2, 31) - 1
        if result > max_int:
            return 0
        if is_positive:
            return int(result)
        return -int(result)


ri = ReverseInteger()
#  Expected: 321
print(ri.reverse(123))
#  Expected: -321
print(ri.reverse(-123))
#  Expected: 0
print(ri.reverse(1000000003))
#  Expected: 0
print(ri.reverse(1534236469))
