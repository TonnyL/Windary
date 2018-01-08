/**
 * Given a collection of integers that might contain duplicates, nums, return all possible subsets (the power set).
 *
 * Note: The solution set must not contain duplicate subsets.
 *
 * For example,
 * If nums = [1,2,2], a solution is:
 *
 * [
 * [2],
 * [1],
 * [1,2,2],
 * [2,2],
 * [1,2],
 * []
 * ]
 *
 * Accepted.
 */
class SubsetsII {

    fun subsetsWithDup(nums: IntArray): List<List<Int>> {
        if (nums.isEmpty()) {
            return emptyList()
        }

        val lists = mutableListOf<List<Int>>()

        if (nums.size == 1) {
            // Add the empty list.
            lists.add(emptyList())

            lists.add(listOf(nums[0]))

            return lists
        }

        nums.sort()

        for (list in subsetsWithDup(nums.copyOfRange(0, nums.size - 1))) {
            val l = mutableListOf(nums[nums.size - 1])
            l.addAll(list)

            if (!lists.contains(l)) {
                lists.add(l)
            }

            if (!lists.contains(list)) {
                lists.add(list)
            }
        }

        return lists
    }

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val s = SubsetsII()

            // Expected: []
            println(s.subsetsWithDup(intArrayOf()))

            // Expected: [[1], []]
            println(s.subsetsWithDup(intArrayOf(1)))

            // Expected: [[], [1], [1, 1]]
            println(s.subsetsWithDup(intArrayOf(1, 1)))

            // Expected: [[1], [2], [1, 2], []]
            println(s.subsetsWithDup(intArrayOf(1, 2)))

            // Expected: [[2], [1], [1, 2, 2], [2, 2], [1, 2], []]
            println(s.subsetsWithDup(intArrayOf(1, 2, 2)))

            // Expected: [[], [1], [1, 4], [1, 4, 4], [1, 4, 4, 4], [1, 4, 4, 4, 4], [4], [4, 4], [4, 4, 4], [4, 4, 4, 4]]
            println(s.subsetsWithDup(intArrayOf(4, 4, 4, 1, 4)))

        }
    }

}
