# Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
#
# You may assume that the array is non-empty and the majority element always exist in the array.
#
# Python, Python3 all accepted.


class MajorityElement:
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        m = {}
        for i in nums:
            if i in m:
                m[i] += 1
            else:
                m[i] = 1

            if m[i] > len(nums) // 2:
                return i

        return nums[0]
