# -*- coding: UTF-8 -*-
#
# Given an array of integers sorted in ascending order, find the starting and ending position of a given target value.
#
# Your algorithm's runtime complexity must be in the order of O(log n).
#
# If the target is not found in the array, return [-1, -1].
#
# For example,
# Given [5, 7, 7, 8, 8, 10] and target value 8,
# return [3, 4].
#
# Python, Python 3 all accepted.
class SearchForARange:
    def searchRange(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        result = [-1, -1]
        length = len(nums)
        if length <= 0:
            return result

        for i in range(length):
            if nums[i] == target:
                result[0] = i
                break

        j = length - 1
        while j >= 0:
            if nums[j] == target:
                result[1] = j
                break
            j -= 1

        return result


sr = SearchForARange()

# Expected: [0, 0]
print(sr.searchRange([1], 1))

# Expected: [-1, -1]
print(sr.searchRange([5, 7, 7, 8, 8, 10], 11))

# Expected: [3, 4]
print(sr.searchRange([5, 7, 7, 8, 8, 10], 8))
