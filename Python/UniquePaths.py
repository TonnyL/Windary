# -*- coding: UTF-8 -*-
#
# A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
# The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right
# corner of the grid (marked 'Finish' in the diagram below).
# How many possible unique paths are there?
#
# Note: m and n will be at most 100.
#
# Python, Python 3 all accepted.
class UniquePaths(object):
    def uniquePaths(self, m, n):
        """
        :type m: int
        :type n: int
        :rtype: int
        """
        if m == 1 or n == 1:
            return 1

        # Init all the elements the 2d matrix with 1s
        matrix = [[1 for x in range(m)] for x in range(n)]
        for i in range(1, m):
            for j in range(1, n):
                matrix[j][i] = matrix[j - 1][i] + matrix[j][i - 1]

        return matrix[n - 1][m - 1]


up = UniquePaths()
# Expected: 1
print(up.uniquePaths(1, 1))
# Expected: 1
print(up.uniquePaths(1, 2))
# Expected: 2
# The matrix:
# 1 1
# 1 2(result)
print(up.uniquePaths(2, 2))
# Expected: 20
# The matrix:
# 1 1 1 1
# 1 2 3 4
# 1 3 6 10
# 1 4 10 20(result)
print(up.uniquePaths(4, 4))
