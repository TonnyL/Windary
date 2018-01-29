# -*- coding: UTF-8 -*-
#
# Follow up for "Unique Paths":
# Now consider if some obstacles are added to the grids. How many unique paths would there be?
# An obstacle and empty space is marked as 1 and 0 respectively in the grid.
#
# For example,
# There is one obstacle in the middle of a 3x3 grid as illustrated below.
#
# [
# [0,0,0],
# [0,1,0],
# [0,0,0]
# ]
#
# The total number of unique paths is 2.
#
# Note: m and n will be at most 100.
#
# Python, Python 3 all accepted.


class UniquePathsII:
    def uniquePathsWithObstacles(self, obstacleGrid):
        """
        :type obstacleGrid: List[List[int]]
        :rtype: int
        """
        if obstacleGrid[0][0] == 1:
            return 0
        if len(obstacleGrid) == 1:
            for i in obstacleGrid[0]:
                if i == 1:
                    return 0
            return 1

        matrix = [[0 for x in range(len(obstacleGrid[0]))] for x in range(len(obstacleGrid))]

        for i in range(len(obstacleGrid)):
            if obstacleGrid[i][0] == 1:
                break
            else:
                matrix[i][0] = 1

        for i in range(len(obstacleGrid[0])):
            if obstacleGrid[0][i] == 1:
                break
            else:
                matrix[0][i] = 1

        for i in range(1, len(matrix)):
            for j in range(1, len(matrix[0])):
                if obstacleGrid[i][j] == 1:
                    matrix[i][j] = 0
                else:
                    matrix[i][j] = matrix[i - 1][j] + matrix[i][j - 1]

        return matrix[len(matrix) - 1][len(matrix[0]) - 1]
