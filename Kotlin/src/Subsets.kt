/**
 * Given a set of distinct integers, nums, return all possible subsets (the power set).
 *
 * Note: The solution set must not contain duplicate subsets.
 *
 * For example,
 * If nums = [1,2,3], a solution is:
 *
 * [
 * [3],
 * [1],
 * [2],
 * [1,2,3],
 * [1,3],
 * [2,3],
 * [1,2],
 * []
 * ]
 *
 * Accepted.
 */
class Subsets {

    fun subsets(nums: IntArray?): List<List<Int>> {
        val results = mutableListOf<List<Int>>()
        results.add(listOf())

        if (nums == null || nums.isEmpty()) {
            return results
        }

        nums.sort()

        for (i in nums) {
            val size = results.size
            for (j in 0 until size) {
                val list = mutableListOf<Int>()
                list.addAll(results[j])
                list.add(i)

                results.add(list)
            }
        }

        return results
    }

}
