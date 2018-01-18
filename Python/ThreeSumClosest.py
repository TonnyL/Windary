# Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target.
# Return the sum of the three integers.
# You may assume that each input would have exactly one solution.
#
# For example, given array S = {-1 2 1 -4}, and target = 1.
#
# The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
#
# Python, Python3 all accepted.
class ThreeSumClosest:
    def threeSumClosest(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        nums = sorted(nums)

        result = nums[0] + nums[1] + nums[2]
        for i in range(len(nums) - 2):
            left = i + 1
            right = len(nums) - 1
            while left < right:
                tmp = nums[i] + nums[left] + nums[right]
                if tmp == target:
                    return tmp
                if abs(tmp - target) < abs(result - target):
                    result = tmp
                if tmp < target:
                    left += 1
                elif tmp > target:
                    right -= 1

        return result


t = ThreeSumClosest()

# Expected: 2
print(t.threeSumClosest([-1, 2, 1, 4], 1))

# Expected: 3
print(t.threeSumClosest([1, 1, 1, 0], 100))

# Expected: 2
print(t.threeSumClosest([1, 1, 1, 0], -100))

# Expected: 2
print(t.threeSumClosest([-1, 2, 1, -4], 1))
