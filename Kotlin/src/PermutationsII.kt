/**
 * Given a collection of numbers that might contain duplicates, return all possible unique permutations.
 *
 * For example,
 * [1,1,2] have the following unique permutations:
 * [
 * [1,1,2],
 * [1,2,1],
 * [2,1,1]
 * ]
 *
 * Accepted.
 */
class PermutationsII {

    fun permuteUnique(nums: IntArray): List<List<Int>> {
        val results = mutableListOf<List<Int>>()

        if (nums.isEmpty()) return results
        if (nums.size == 1) return results.apply { add(mutableListOf(nums[0])) }

        val ints = IntArray(nums.size - 1)
        System.arraycopy(nums, 0, ints, 0, nums.size - 1)

        val set = mutableSetOf<List<Int>>()

        for (list in permuteUnique(ints)) {
            for (i in 0..list.size) {
                val tmp = mutableListOf<Int>()
                tmp.addAll(list)
                tmp.add(i, nums[nums.size - 1])
                set.add(tmp)
            }
        }

        return results.apply { addAll(set) }
    }

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val p = PermutationsII()

            // Expected: [[]]
            println(p.permuteUnique(intArrayOf()))

            // Expected: [[1]]
            println(p.permuteUnique(intArrayOf(1)))

            // Expected: [[1, 1, 2], [1, 2, 1], [2, 1, 1]]
            println(p.permuteUnique(intArrayOf(1, 1, 2)))
        }
    }

}
