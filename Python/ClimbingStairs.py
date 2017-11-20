# -*- coding: UTF-8 -*-
# You are climbing a stair case. It takes n steps to reach to the top.
#
# Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
#
# Note: Given n will be a positive integer.
#
# Python, Python 3 all accepted.
class ClimbingStairs(object):
    def climbStairs(self, n):
        """
        :type n: int
        :rtype: int
        """
        if n <= 0:
            return 0
        if n == 1:
            return 1
        if n == 2:
            return 2

        results = [1, 2]
        for i in range(2, n):
            results.append(results[i - 1] + results[i - 2])

        return results[n - 1]


cs = ClimbingStairs()
# Expected: 1
print(cs.climbStairs(1))
# Expected: 3
print(cs.climbStairs(3))
# Expected: 8
print(cs.climbStairs(5))
