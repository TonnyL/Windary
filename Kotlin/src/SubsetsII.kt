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

}
