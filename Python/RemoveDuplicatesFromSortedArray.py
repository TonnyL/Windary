# -*- coding: UTF-8 -*-
# Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
#
# Do not allocate extra space for another array, you must do this in place with constant memory.
#
# For example,
# Given input array nums = [1,1,2],
#
# Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
# It doesn't matter what you leave beyond the new length.
#
# Python, Python 3 all accepted.
class RemoveDuplicatesFromSortedArray(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if nums is None or len(nums) == 0:
            return 0
        i = 0
        j = 1
        while j < len(nums):
            if nums[j] != nums[i]:
                i += 1
                nums[i] = nums[j]
            j += 1

        # for value in nums:
        #     print(value, end=" ")
        # print()

        return i + 1


r = RemoveDuplicatesFromSortedArray()
# Expected: [], length = 0
print(r.removeDuplicates([]))
# Expected: [1, 2, 2], length = 2
print(r.removeDuplicates([1, 2, 2]))
# Expected: [1, 1, 1], length = 1
print(r.removeDuplicates([1, 1, 1]))
# Expected: [1, 2, 3, 4, 4], length = 4
print(r.removeDuplicates([1, 1, 2, 3, 4]))
