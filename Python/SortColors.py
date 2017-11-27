# -*- coding: UTF-8 -*-
# Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.
#
# Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
#
# Note:
# You are not suppose to use the library's sort function for this problem.
#
# Follow up:
# A rather straight forward solution is a two-pass algorithm using counting sort.
# First, iterate the array counting number of 0's, 1's, and 2's, then overwrite array with total number of 0's, then 1's and followed by 2's.
#
# Could you come up with an one-pass algorithm using only constant space?
#
# Python, Python 3 all accepted.
class SortColors:
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: void Do not return anything, modify nums in-place instead.
        """
        if nums is None:
            return

        length = len(nums)

        if length > 1:
            index = 0
            counter = 0
            while counter < length:
                if nums[index] == 0:
                    nums.insert(0, 0)
                    index += 1
                    del nums[index]
                elif nums[index] == 2:
                    nums.append(2)
                    del nums[index]
                elif nums[index] == 1:
                    index += 1
                else:
                    return
                counter += 1
        # print(nums)


sc = SortColors()

# Expected: []
sc.sortColors([])

# Expected: [0]
sc.sortColors([0])

# Expected: [0, 1, 2]
sc.sortColors([2, 1, 0])

# Expected: [0, 0, 0, 1, 1, 1, 1, 1, 2]
sc.sortColors([0, 1, 0, 1, 1, 1, 2, 0, 1])

# Expected: [0, 0, 1, 1, 2]
sc.sortColors([0, 1, 2, 0, 1])

# Expected: [0, 0, 1, 1, 2, 2, 2, 2, 2]
sc.sortColors([2, 2, 2, 2, 1, 0, 2, 0, 1])

# Expected: [0, 0, 1, 1, 1, 2, 2, 2]
sc.sortColors([0, 0, 1, 1, 1, 2, 2, 2])

# Expected: [0, 0, 0, 1, 1, 1, 2, 2, 2]
sc.sortColors([0, 0, 0, 2, 2, 2, 1, 1, 1])
