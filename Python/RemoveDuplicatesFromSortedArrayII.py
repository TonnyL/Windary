# -*- coding: UTF-8 -*-
#
# Follow up for "Remove Duplicates":
# What if duplicates are allowed at most twice?
#
# For example,
# Given sorted array nums = ,
#
# Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3. It doesn't matter what you leave beyond the new length.
#
# Python, Python 3 all accepted.


class RemoveDuplicatesFromSortedArrayII:
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if nums is None:
            return 0
        if len(nums) <= 2:
            return len(nums)

        i = 0
        while i < len(nums) - 2:
            if nums[i + 1] == nums[i] and nums[i + 2] == nums[i]:
                del nums[i + 2]
            else:
                i += 1

        return len(nums)
