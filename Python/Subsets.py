# -*- coding: UTF-8 -*-
#
# Given a set of distinct integers, nums, return all possible subsets (the power set).
#
# Note: The solution set must not contain duplicate subsets.
#
# For example,
# If nums = [1,2,3], a solution is:
#
# [
# [3],
# [1],
# [2],
# [1,2,3],
# [1,3],
# [2,3],
# [1,2],
# []
# ]
#
# Python, Python 3 all accepted.
class Subsets:
    def subsets(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        results = [[]]

        if nums is None or len(nums) == 0:
            return results

        sorted(nums)

        for i in nums:
            size = len(results)
            for j in range(size):
                tmp = []
                tmp.extend(results[j])
                tmp.append(i)

                results.append(tmp)

        return results


s = Subsets()

# [[]]
print(s.subsets([]))
# [[]]
print(s.subsets(None))
# [[], [1]]
print(s.subsets([1]))
# [[], [1], [2], [1, 2]]
print(s.subsets([1, 2]))
# [[], [1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3]]
print(s.subsets([1, 2, 3]))
