# -*- coding: UTF-8 -*-
#
# Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
# (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
# You are given nums target value to search. If found in the array return its index, otherwise return -1.
# You may assume no duplicate exists in the array.
#
# Python, Python 3 all accepted.
class SearchInRotatedSortedArray:
    def search(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        if len(nums) == 0:
            return -1

        left = 0
        right = len(nums) - 1
        while left <= right:
            middle = (left + right) // 2
            if nums[middle] == target:
                return middle
            if nums[middle] >= nums[left]:
                if nums[left] <= target < nums[middle]:
                    right = middle - 1
                else:
                    left = middle + 1
            else:
                if nums[middle] < target <= nums[right]:
                    left = middle + 1
                else:
                    right = middle - 1

        return -1


s = SearchInRotatedSortedArray()

# Expected: -1
print(s.search([], 1))
# Expected: 6
print(s.search([0, 1, 2, 4, 5, 6, 7], 7))
# Expected: 3
print(s.search([4, 5, 6, 7, 0, 1, 2], 7))
# Expected: 2
print(s.search([5, 6, 7, 0, 1, 2, 4], 7))
# Expected: -1
print(s.search([4, 5, 6, 7, 0, 1, 2], 8))
