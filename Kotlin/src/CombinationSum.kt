/**
 * Given a set of candidate numbers (C) (without duplicates) and a target number (T),
 * find all unique combinations in C where the candidate numbers sums to T.
 *
 * The same repeated number may be chosen from C unlimited number of times.
 *
 * Note:
 * All numbers (including target) will be positive integers.
 * The solution set must not contain duplicate combinations.
 * For example, given candidate set [2, 3, 6, 7] and target 7,
 * A solution set is:
 * [
 * [7],
 * [2, 2, 3]
 * ]
 *
 * Accepted.
 */
class CombinationSum {

    fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
        if (candidates.isEmpty()) {
            return emptyList()
        }
        val lists = mutableListOf<List<Int>>()

        candidates.sort()

        dfs(candidates, target, mutableListOf(), lists, 0)

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
            path.add(candidates[i])
            dfs(candidates, target - candidates[i], path, ret, i)
            path.removeAt(path.size - 1)
        }
    }

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val cs = CombinationSum()

            // Expected: [[7], [2, 2, 3]]
            println(cs.combinationSum(intArrayOf(2, 3, 6, 7), 7))

            // Expected: [[1, 1, 1]]
            println(cs.combinationSum(intArrayOf(1), 3))

            // Expected: [[1, 1, 1, 1], [1, 1, 2], [2, 2]]
            println(cs.combinationSum(intArrayOf(1, 2), 4))
        }
    }

}
