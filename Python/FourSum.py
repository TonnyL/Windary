# Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c + d = target?
# Find all unique quadruplets in the array which gives the sum of target.
#
# Note: The solution set must not contain duplicate quadruplets.
#
# For example, given array S = [1, 0, -1, 0, -2, 2], and target = 0.
#
# A solution set is:
# [
# [-1,  0, 0, 1],
# [-2, -1, 1, 2],
# [-2,  0, 0, 2]
# ]
#
# Python2 accepted. Python3 time limit exceeded.


class FourSum:
    def fourSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[List[int]]
        """
        results = []
        nums = sorted(nums)
        nums_length = len(nums)

        for i in range(nums_length - 3):
            for j in range(i + 1, nums_length - 2):
                left, right = j + 1, nums_length - 1
                while left < right:
                    s = nums[i] + nums[j] + nums[left] + nums[right]
                    if s == target:
                        tmp = [nums[i], nums[j], nums[left], nums[right]]
                        if not results.__contains__(tmp):
                            results.append(tmp)

                        left += 1
                        right -= 1
                    elif s < target:
                        left += 1
                    else:
                        right -= 1

        return results
