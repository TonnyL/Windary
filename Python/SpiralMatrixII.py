# -*- coding: UTF-8 -*-
#
# Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.
#
# For example,
# Given n = 3,
#
# You should return the following matrix:
# [
# [ 1, 2, 3 ],
# [ 8, 9, 4 ],
# [ 7, 6, 5 ]
# ]
#
# Python, Python 3 all accepted.


class SpiralMatrixII:
    def generateMatrix(self, n):
        """
        :type n: int
        :rtype: List[List[int]]
        """
        if n == 0:
            return []
        if n == 1:
            return [[1]]

        matrix = [[0 for x in range(n)] for x in range(n)]
        if n % 2 == 0:
            center = (n - 1) // 2
        else:
            center = n // 2

        i = 0
        j = 0
        depth = 0
        result = 1

        while i <= center and j <= center and depth <= center:
            j = depth
            i = depth
            while j < n - depth:
                if matrix[i][j] == 0:
                    matrix[i][j] = result
                    result += 1
                j += 1
            j -= 1

            i += 1
            while i < n - depth:
                if matrix[i][j] == 0:
                    matrix[i][j] = result
                    result += 1
                i += 1
            i -= 1

            j -= 1
            while j >= depth:
                if matrix[i][j] == 0:
                    matrix[i][j] = result
                    result += 1
                j -= 1
            j += 1

            i -= 1
            while i > depth:
                if matrix[i][j] == 0:
                    matrix[i][j] = result
                    result += 1
                i -= 1

            depth += 1

        return matrix
