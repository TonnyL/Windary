# -*- coding: UTF-8 -*-
# Given a m x n grid filled with non-negative numbers,
# find a path from top left to bottom right which minimizes the sum of all numbers along its path.
#
# Note: You can only move either down or right at any point in time.
#
# Example 1:
# [[1,3,1],
# [1,5,1],
# [4,2,1]]
# Given the above grid map, return 7. Because the path 1→3→1→1→1 minimizes the sum.
#
# Python, Python 3 all accepted.
class MinimumPathSum:
    def minPathSum(self, grid):
        """
        :type grid: List[List[int]]
        :rtype: int
        """
        if len(grid) == 0:
            return 0
        if len(grid) == 1:
            if len(grid[0]) == 0:
                return 0
            if len(grid[0]) == 1:
                return grid[0][0]

        matrix = [[0 for x in range(len(grid[0]))] for x in range(len(grid))]
        matrix[0][0] = grid[0][0]

        for i in range(1, len(grid)):
            matrix[i][0] = matrix[i - 1][0] + grid[i][0]

        for i in range(1, len(grid[0])):
            matrix[0][i] = matrix[0][i - 1] + grid[0][i]

        for i in range(1, len(grid)):
            for j in range(1, len(grid[0])):
                matrix[i][j] = min(matrix[i - 1][j] + grid[i][j], matrix[i][j - 1] + grid[i][j])

        return matrix[len(grid) - 1][len(grid[0]) - 1]


mps = MinimumPathSum()

# Expected: 0
print(mps.minPathSum([]))
# Expected: 0
print(mps.minPathSum([[]]))
# Expected: 1
print(mps.minPathSum([[1]]))
# Expected: 7
# The matrix:
# 1 4 5
# 2 7 6
# 6 8 7
print(mps.minPathSum([[1, 3, 1], [1, 5, 1], [4, 2, 1]]))
# Expected: 5
# The matrix:
# 1 2 3
# 2 4 4
# 3 6 5
print(mps.minPathSum([[1, 1, 1], [1, 2, 1], [1, 3, 1]]))
