# -*- coding: UTF-8 -*-
#
# Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
#
# For example,
# Given the following matrix:
#
# [
# [ 1, 2, 3 ],
# [ 4, 5, 6 ],
# [ 7, 8, 9 ]
# ]
# You should return [1,2,3,6,9,8,7,4,5].
#
# Python, Python 3 all accepted.


class SpiralMatrix:
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        if len(matrix) == 0 or len(matrix[0]) == 0:
            return []

        matrix0_length = len(matrix[0])
        matrix_length = len(matrix)
        result = []
        added = [[0 for x in range(matrix0_length)] for x in range(matrix_length)]

        if matrix_length == 1:
            for i in matrix[0]:
                result.append(i)
            return result

        if matrix0_length == 1:
            for ints in matrix:
                result.append(ints[0])
            return result

        if matrix_length % 2 == 0:
            center_x = (matrix_length - 1) // 2
        else:
            center_x = matrix_length // 2

        if matrix0_length % 2 == 0:
            center_y = (matrix_length - 1) // 2
        else:
            center_y = matrix_length // 2

        i = 0
        j = 0
        depth = 0

        while i <= center_x and j <= center_y and depth <= center_x and depth <= center_y:
            j = depth
            i = depth
            while j < matrix0_length - depth:
                if not added[i][j]:
                    result.append(matrix[i][j])
                    added[i][j] = True
                j += 1
            j -= 1

            i += 1
            while i < matrix_length - depth:
                if not added[i][j]:
                    result.append(matrix[i][j])
                    added[i][j] = True
                i += 1
            i -= 1

            j -= 1
            while j >= depth:
                if not added[i][j]:
                    result.append(matrix[i][j])
                    added[i][j] = True
                j -= 1
            j += 1

            i -= 1
            while i > depth:
                if not added[i][j]:
                    result.append(matrix[i][j])
                    added[i][j] = True
                i -= 1

            depth += 1

        return result
