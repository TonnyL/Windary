/**
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0?
 * Find all unique triplets in the array which gives the sum of zero.
 *
 * Note: The solution set must not contain duplicate triplets.
 *
 * For example, given array S = [-1, 0, 1, 2, -1, -4],
 *
 * A solution set is:
 * [
 * [-1, 0, 1],
 * [-1, -1, 2]
 * ]
 *
 * Accepted.
 */
class ThreeSum {

    fun threeSum(nums: IntArray): List<List<Int>> {
        nums.sort()
        val set = mutableSetOf<Triple>()

        for (first in 0 until nums.size - 2) {
            if (nums[first] > 0) {
                break
            }

            val target = 0 - nums[first]
            var second = first + 1
            var third = nums.size - 1

            while (second < third) {
                when {
                    nums[second] + nums[third] == target -> {
                        set.add(Triple(nums[first], nums[second], nums[third]))
                        while (second < third && nums[second] == nums[second + 1]) {
                            second++
                        }
                        while (second < third && nums[third] == nums[third - 1]) {
                            third--
                        }
                        second++
                        third--
                    }
                    nums[second] + nums[third] < target -> second++
                    else -> third--
                }
            }
        }

        return mutableListOf<List<Int>>().apply {
            addAll(set.map { arrayListOf(it.a, it.b, it.c) })
        }
    }

    internal data class Triple(
            val a: Int,
            val b: Int,
            val c: Int
    )

}
