# Given a collection of integers that might contain duplicates, nums, return all possible subsets (the power set).
#
# Note: The solution set must not contain duplicate subsets.
#
# For example,
# If nums = [1,2,2], a solution is:
#
# [
# [2],
# [1],
# [1,2,2],
# [2,2],
# [1,2],
# []
# ]
#
# Python, Python3 all accepted.


class SubsetsII:
    def subsetsWithDup(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        if nums is None or len(nums) == 0:
            return []

        lists = []

        if len(nums) == 1:
            lists.append([])
            # Add the empty list.
            lists.append([nums[0]])

            return lists

        nums = sorted(nums)

        for lst in self.subsetsWithDup(nums[0:len(nums) - 1]):
            li = []
            li.extend(lst)
            li.append(nums[len(nums) - 1])

            if not lists.__contains__(li):
                lists.append(li)

            if not lists.__contains__(lst):
                lists.append(lst)

        return lists
