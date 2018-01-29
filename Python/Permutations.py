# -*- coding: UTF-8 -*-
#
# Given a collection of distinct numbers, return all possible permutations.
#
# For example,
# [1,2,3] have the following permutations:
# [
# [1,2,3],
# [1,3,2],
# [2,1,3],
# [2,3,1],
# [3,1,2],
# [3,2,1]
# ]
#
# Python, Python 3 all accepted.


class Permutations:
    def permute(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        results = []

        length = len(nums)
        if length == 0:
            return results
        if length == 1:
            results.append([nums[0]])
            return results

        ints = nums[0:length - 1]

        for l in self.permute(ints):
            for i in range(len(l) + 1):
                tmp = []
                tmp.extend(l)
                tmp.insert(i, nums[length - 1])
                results.append(tmp)

        return results
