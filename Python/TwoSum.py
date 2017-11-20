# -*- coding: UTF-8 -*-
# Python 2.7 Accept
# Python 3 Time Limit Exceed

# Given an array of integers, return indices of the two numbers such that they add up to a specific target.
# You may assume that each input would have exactly one solution, and you may not use the same element twice.
# Example:
# Given nums = [2, 7, 11, 15], target = 9,
#
# Because nums[0] + nums[1] = 2 + 7 = 9,
# return [0, 1].


class TwoSum(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                if (nums[i] + nums[j]) == target:
                    return [i, j]
        return [0, 0]


twoSum = TwoSum()

nums = [2, 5, 5, 11]
target = 10
twoSum.twoSum(nums, target)
print(twoSum.twoSum(nums, target))

nums = [2, 7, 11, 15]
target = 9
print(twoSum.twoSum(nums, target))

nums = [3, 2, 3]
target = 6
print(twoSum.twoSum(nums, target))
