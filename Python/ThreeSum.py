# -*- coding: UTF-8 -*-
#
# Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0?
# Find all unique triplets in the array which gives the sum of zero.
#
# Note: The solution set must not contain duplicate triplets.
#
# For example, given array S = [-1, 0, 1, 2, -1, -4],
#
# A solution set is:
# [
# [-1, 0, 1],
# [-1, -1, 2]
# ]
#
# Python 2 accepted. Python 3 Time Limit Exceeded.
class ThreeSum:
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        nums = sorted(nums)

        m_set = set()

        for first in range(len(nums) - 2):
            if nums[first] > 0:
                break

            target = 0 - nums[first]
            second = first + 1
            third = len(nums) - 1

            while second < third:
                if nums[second] + nums[third] == target:
                    m_set.add(Triple(nums[first], nums[second], nums[third]))
                    while second < third and nums[second] == nums[second + 1]:
                        second += 1
                    while second < third and nums[third] == nums[third - 1]:
                        third -= 1
                    second += 1
                    third -= 1
                elif nums[second] + nums[third] < target:
                    second += 1
                else:
                    third -= 1

        lists = []

        for t in m_set:
            lists.append([t.a, t.b, t.c])

        return lists


class Triple:
    def __init__(self, a, b, c):
        """
        :param a: int
        :param b: int
        :param c: int
        """
        self.a = a
        self.b = b
        self.c = c

    def __eq__(self, other):
        if isinstance(other, self.__class__):
            return self.a == other.a and self.b == other.b and self.c == other.c

    def __hash__(self):
        return (-self.a) * 100 + abs(self.b) * 10 + self.c


ts = ThreeSum()

# Expected: []
print(ts.threeSum([-1, 0]))

# Expected: [[-1, -1, 2], [-1, 0, 1]]
print(ts.threeSum([-1, 0, 1, 2, -1, -4]))

# Expected: [[0, 0, 0]]
print(ts.threeSum([0, 0, 0]))

# Expected: [[-4, -2, 6], [-4, 0, 4], [-4, 1, 3], [-4, 2, 2], [-2, -2, 4], [-2, 0, 2]]
print(ts.threeSum([-4, -2, -2, -2, 0, 1, 2, 2, 2, 3, 3, 4, 4, 6, 6]))
