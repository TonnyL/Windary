# -*- coding: UTF-8 -*-
# Implement int sqrt(int x).
#
# Compute and return the square root of x.
#
# Python, Python 3 all accepted.
import math


class SqrtX(object):
    def mySqrt(self, x):
        """
        :type x: int
        :rtype: int
        """
        # A tricky way to solve the problem.
        # return int(math.sqrt(x))
        if x <= 0:
            return 0
        if x <= 3:
            return 1

        high = x // 2
        low = 1
        mid = (high + 1) // 2
        while high > low:
            if mid ** 2 > x:
                high = mid - 1
            elif mid * mid < x:
                if (mid + 1) ** 2 > x:
                    return mid
                low = mid + 1
            else:
                return mid
            mid = (low + high) // 2

        return mid
