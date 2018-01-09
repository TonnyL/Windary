# Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
#
# For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
# the contiguous subarray [4,-1,2,1] has the largest sum = 6.
#
# If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
#
# Python, Python3 all accepted.
class MaximumSubArray:
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        tmp = 0
        m = nums[0]

        for i in nums:
            tmp += i
            if tmp > m:
                m = tmp
            if tmp < 0:
                tmp = 0

        return m


ms = MaximumSubArray()

# Expected: 1
print(ms.maxSubArray([1]))

# Expected: -2
print(ms.maxSubArray([-4, -2]))

# Expected: 1
print(ms.maxSubArray([1, 0, -1]))

# Expected: 6
print(ms.maxSubArray([-2, 1, -3, 4, -1, 2, 1, -5, 4]))
