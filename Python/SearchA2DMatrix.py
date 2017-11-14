# -*- coding: UTF-8 -*-
#
# Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
#
# Integers in each row are sorted from left to right.
# The first integer of each row is greater than the last integer of the previous row.
# For example,
#
# Consider the following matrix:
#
# [
# [1,   3,  5,  7],
# [10, 11, 16, 20],
# [23, 30, 34, 50]
# ]
# Given target = 3, return true.
#
# Python, Python3 all accepted.
class SearchA2DMatrix:
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        if len(matrix) == 0 or len(matrix[0]) == 0:
            return False

        for i in range(len(matrix) - 1):
            if matrix[i][0] == target or matrix[i + 1][0] == target:
                return True
            elif matrix[i][0] < target <= matrix[i + 1][0]:
                return self.binary_search(matrix[i], target, 0, len(matrix[0]) - 1) >= 0

        return self.binary_search(matrix[len(matrix) - 1], target, 0, len(matrix[0]) - 1) >= 0

    def binary_search(self, array, key, low, high):
        """
        :param array: List[int]
        :param key: int
        :param low: int
        :param high: int
        :return: int
        """
        while low < high:
            mid = (low + high) // 2
            if array[mid] < key:
                low = mid + 1
            else:
                high = mid

        return low if array[low] == key else -1


s = SearchA2DMatrix()

# Expected: False
print(s.searchMatrix([], 0))

# Expected: False
print(s.searchMatrix([[]], 1))

# Expected: True
print(s.searchMatrix([[1, 3, 5, 7], [10, 11, 16, 20], [23, 30, 34, 50]], 3))

# Expected: True
print(s.searchMatrix([[1]], 1))
