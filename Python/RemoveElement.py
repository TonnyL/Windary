# -*- coding: UTF-8 -*-
# Given an array and a value, remove all instances of that value in place and return the new length.
#
# Do not allocate extra space for another array, you must do this in place with constant memory.
#
# The order of elements can be changed. It doesn't matter what you leave beyond the new length.
#
# Example:
# Given input array nums = [3,2,2,3], val = 3
#
# Your function should return length = 2, with the first two elements of nums being 2.
class RemoveElement(object):
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        i = 0
        while i < len(nums):
            if nums[i] == val:
                nums.pop(i)
                i -= 1
            i += 1
        return len(nums)


re = RemoveElement()
# Expected:
# nums: [2, 2, 3, 3] length = 2
print(re.removeElement([3, 2, 2, 3], 3))
# Expected:
# nums: [3, 3] length = 0
print(re.removeElement([3, 3], 3))
