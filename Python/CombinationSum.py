# Given a set of candidate numbers (C) (without duplicates) and a target number (T),
# find all unique combinations in C where the candidate numbers sums to T.
#
# The same repeated number may be chosen from C unlimited number of times.
#
# Note:
# All numbers (including target) will be positive integers.
# The solution set must not contain duplicate combinations.
# For example, given candidate set [2, 3, 6, 7] and target 7,
# A solution set is:
# [
# [7],
# [2, 2, 3]
# ]
#
# Python, Python3 all accepted.


class CombinationSum:
    def combinationSum(self, candidates, target):
        """
        :type candidates: List[int]
        :type target: int
        :rtype: List[List[int]]
        """
        if len(candidates) == 0:
            return []

        lists = []

        candidates = sorted(candidates)

        self.dfs(candidates, target, [], lists, 0)

        return lists

    def dfs(self, candidates, target, path, ret, index):
        """
        :param candidates: List[int]
        :param target: int
        :param path: List[int]
        :param ret: List[List[int]]
        :param index: int
        :return:
        """
        if target < 0:
            return

        if target == 0:
            tmp = []
            tmp.extend(path)
            ret.append(tmp)
            return

        for i in range(index, len(candidates)):
            path.append(candidates[i])
            self.dfs(candidates, target - candidates[i], path, ret, i)
            del path[len(path) - 1]
