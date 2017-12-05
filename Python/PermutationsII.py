# -*- coding: UTF-8 -*-
#
# Given a collection of numbers that might contain duplicates, return all possible unique permutations.
#
# For example,
# [1,1,2] have the following unique permutations:
# [
# [1,1,2],
# [1,2,1],
# [2,1,1]
# ]
#
#
class PermutationsII:
    def permuteUnique(self, nums):
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

        m_set = set()

        for l in self.permuteUnique(ints):
            for i in range(len(l) + 1):
                tmp = []
                tmp.extend(l)
                tmp.insert(i, nums[length - 1])
                tp = tuple(tmp)
                m_set.add(tp)

        results.extend(m_set)
        return results


p = PermutationsII()

# Expected: [[]]
print(p.permuteUnique([]))

# Expected: [[1]]
print(p.permuteUnique([1]))

# Expected: [[1, 1, 2], [1, 2, 1], [2, 1, 1]]
print(p.permuteUnique([1, 1, 2]))
