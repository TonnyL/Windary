/**
 * Given a collection of candidate numbers (C) and a target number (T),
 * find all unique combinations in C where the candidate numbers sums to T.
 *
 * Each number in C may only be used once in the combination.
 *
 * Note:
 * All numbers (including target) will be positive integers.
 * The solution set must not contain duplicate combinations.
 * For example, given candidate set [10, 1, 2, 7, 6, 1, 5] and target 8,
 * A solution set is:
 * [
 * [1, 7],
 * [1, 2, 5],
 * [2, 6],
 * [1, 1, 6]
 * ]
 *
 * Accepted.
 */

class CombinationSumII {

    fun combinationSum2(candidates: IntArray, target: Int): List<List<Int>> {
        if (candidates.isEmpty()) {
            return emptyList()
        }
        val lists = mutableListOf<List<Int>>()

        candidates.sort()

        dfs(candidates, target, ArrayList(), lists, 0)

        return lists
    }

    private fun dfs(candidates: IntArray, target: Int, path: MutableList<Int>, ret: MutableList<List<Int>>, index: Int) {
        if (target < 0) {
            return
        }

        if (target == 0) {
            ret.add(ArrayList(path))
            return
        }

        for (i in index until candidates.size) {
            if (i != index && candidates[i] == candidates[i - 1]) {
                continue
            }

            path.add(candidates[i])
            dfs(candidates, target - candidates[i], path, ret, i + 1)
            path.removeAt(path.size - 1)
        }
    }

}
