# -*- coding: UTF-8 -*-
#
# Given an array of non-negative integers, you are initially positioned at the first index of the array.
#
# Each element in the array represents your maximum jump length at that position.
#
# Determine if you are able to reach the last index.
#
# For example:
# A = [2,3,1,1,4], return true.
#
# A = [3,2,1,0,4], return false.
#
# Python, Python3 all accepted.
class JumpGame:
    def canJump(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        if nums is None:
            return False

        nums_length = len(nums)
        if nums_length == 0:
            return False
        if nums_length == 1:
            return True

        max_length = 0
        for i in range(nums_length - 1):
            max_length -= 1
            max_length = max(max_length, nums[i])

            if max_length == 0:
                return False

        return max_length >= 0


jg = JumpGame()
# Expected: False
print(jg.canJump([]))

# Expected: True
print(jg.canJump([1]))

# Expected: True
print(jg.canJump([0]))

# Expected: True
print(jg.canJump([2, 3, 1, 1, 4]))

# Expected: False
print(jg.canJump([3, 2, 1, 0, 4]))

# Expected: True
print(jg.canJump([4, 0, 0, 0]))
