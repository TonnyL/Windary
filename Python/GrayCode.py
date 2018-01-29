# -*- coding: UTF-8 -*-
#
# The gray code is a binary numeral system where two successive values differ in only one bit.
#
# Given a non-negative integer n representing the total number of bits in the code, print the sequence of gray code. A gray code sequence must begin with 0.
#
# For example, given n = 2, return [0,1,3,2]. Its gray code sequence is:
#
# 00 - 0
# 01 - 1
# 11 - 3
# 10 - 2
# Note:
# For a given n, a gray code sequence is not uniquely defined.
#
# For example, [0,2,3,1] is also a valid gray code sequence according to the above definition.
#
# For now, the judge is able to judge based on one instance of gray code sequence. Sorry about that.
#
# Python, Python 3 all accepted.
import math


class GrayCode(object):
    def grayCode(self, n):
        """
        :type n: int
        :rtype: List[int]
        """
        if n <= 0:
            return [0]

        if n == 1:
            return [0, 1]

        result_list = self.grayCode(n - 1)
        for i in range(len(result_list) - 1, -1, -1):
            result_list.append(result_list[i] + int(math.pow(2, n - 1)))

        return result_list
