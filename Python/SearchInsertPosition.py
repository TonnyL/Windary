# -*- coding: UTF-8 -*-
# Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
#
# You may assume no duplicates in the array.
#
# Here are few examples.
# [1,3,5,6], 5 → 2
# [1,3,5,6], 2 → 1
# [1,3,5,6], 7 → 4
# [1,3,5,6], 0 → 0
#
# Python, Python 3 all accepted.
class SearchInsertPosition(object):
    def searchInsert(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        if nums is None or len(nums) == 0:
            return 0

        for i in range(0, len(nums)):
            if nums[i] == target:
                return i
            elif nums[i] < target:
                if (i + 1 < len(nums) and nums[i + 1] > target) or i + 1 == len(nums):
                    return i + 1

        return 0


sip = SearchInsertPosition()
# Expected: 0
print(sip.searchInsert([1], 0))
# Expected: 1
print(sip.searchInsert([1], 2))
# Expected: 2
print(sip.searchInsert([1, 3, 5, 6], 5))
# Expected: 1
print(sip.searchInsert([1, 3, 5, 6], 2))
# Expected: 4
print(sip.searchInsert([1, 3, 5, 6], 7))
# Expected: 0
print(sip.searchInsert([1, 3, 5, 6], 0))
