# Given a collection of candidate numbers (C) and a target number (T),
# find all unique combinations in C where the candidate numbers sums to T.
#
# Each number in C may only be used once in the combination.
#
# Note:
# All numbers (including target) will be positive integers.
# The solution set must not contain duplicate combinations.
# For example, given candidate set [10, 1, 2, 7, 6, 1, 5] and target 8,
# A solution set is:
# [
# [1, 7],
# [1, 2, 5],
# [2, 6],
# [1, 1, 6]
# ]
#
# Python, Python3 all accepted.
class CombinationSumII:
    def combinationSum2(self, candidates, target):
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
            if i != index and candidates[i] == candidates[i - 1]:
                continue
            path.append(candidates[i])
            self.dfs(candidates, target - candidates[i], path, ret, i + 1)
            del path[len(path) - 1]


cs = CombinationSumII()

# Expected: [[1, 7], [1, 2, 5], [2, 6], [1, 1, 6]]
print(cs.combinationSum2([10, 1, 2, 7, 6, 1, 5], 8))

# Expected: []
print(cs.combinationSum2([1], 2))

# Expected: [[1, 1, 2], [2, 2]]
print(cs.combinationSum2([1, 1, 2, 2], 4))
