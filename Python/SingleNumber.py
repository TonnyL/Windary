# Given an array of integers, every element appears twice except for one. Find that single one.
#
# Note:
# Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
#
# Python, Python3 all accepted.


class SingleNumber:
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        s = 0
        if nums is None:
            return s
        for i in nums:
            s ^= i
        return s
