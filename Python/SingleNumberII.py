# Given an array of integers, every element appears three times except for one, which appears exactly once. Find that single one.
#
# Note:
# Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
#
# Python, Python3 all accepted.


class SingleNumberII:
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        one, two, three = 0, 0, 0
        for i in range(0, len(nums)):
            two |= (one & nums[i])
            one ^= nums[i]
            three = one & two
            two -= three
            one -= three
        return one
