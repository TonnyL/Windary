# -*- coding: UTF-8 -*-
#
# Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in place.
#
# Python, Python 3 all accepted.
class SetMatrixZeroes:
    def setZeroes(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: void Do not return anything, modify matrix in-place instead.
        """
        if len(matrix) == 0 or len(matrix[0]) == 0:
            return

        row = []
        column = []
        for i in range(len(matrix)):
            for j in range(len(matrix[0])):
                if matrix[i][j] == 0:
                    if i not in row:
                        row.append(i)
                    if j not in column:
                        column.append(j)

        for row_index in row:
            for k in range(len(matrix[0])):
                matrix[row_index][k] = 0

        for column_index in column:
            for k in range(len(matrix)):
                matrix[k][column_index] = 0

        print(matrix)


smz = SetMatrixZeroes()

smz.setZeroes([])
# The matrix:
# [
#   [0, 0]
# ]
smz.setZeroes([[0, 1]])
# The matrix:
# [
#   [0, 0, 0],
#   [3, 0, 5],
#   [6, 0, 8]
# ]
smz.setZeroes([[1, 0, 2], [3, 4, 5], [6, 7, 8]])
# The matrix:
# [
#   [0, 0, 0],
#   [0, 0, 0],
#   [0, 0, 0]
# ]
smz.setZeroes([[0, 1, 1], [2, 0, 2], [3, 3, 0]])
# The matrix:
# [
#   [0, 0, 0, 0],
#   [0, 0, 0, 4],
#   [0, 0, 0, 0],
#   [0, 0, 0, 3],
#   [0, 0, 0, 0]
# ]
smz.setZeroes([[0, 0, 0, 5], [4, 3, 1, 4], [0, 1, 1, 4], [1, 2, 1, 3], [0, 0, 1, 1]])
