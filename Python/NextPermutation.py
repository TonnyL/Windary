# Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.
#
# If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).
#
# The replacement must be in-place, do not allocate extra memory.
#
# Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.
# 1,2,3 → 1,3,2
# 3,2,1 → 1,2,3
# 1,1,5 → 1,5,1
#
# Python, Python3 all accepted.


class NextPermutation:
    def nextPermutation(self, nums):
        """
        :type nums: List[int]
        :rtype: void Do not return anything, modify nums in-place instead.
        """
        nums_length = len(nums)
        i = nums_length - 2
        while i >= 0 and nums[i] >= nums[i + 1]:
            i -= 1
        if i >= 0:
            j = nums_length - 1
            while nums[j] <= nums[i]:
                j -= 1
            nums[i], nums[j] = nums[j], nums[i]
        self.reverse(nums, i + 1, nums_length - 1)

    def reverse(self, nums, i, j):
        """
        :param nums: List[int]
        :param i: int
        :param j: int
        :return:
        """
        while i < j:
            nums[i], nums[j] = nums[j], nums[i]
            i += 1
            j -= 1
