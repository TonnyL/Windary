import java.util.*
import kotlin.collections.ArrayList

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
        val set = HashSet<Triple>()

        for (first in 0 until nums.size - 2) {
            if (nums[first] > 0) break

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

        return ArrayList<ArrayList<Int>>().apply { addAll(set.map { arrayListOf(it.a, it.b, it.c) }) }
    }

    internal data class Triple(
            val a: Int,
            val b: Int,
            val c: Int
    )

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val ts = ThreeSum()

            // Expected: []
            println("[${ts.threeSum(intArrayOf(-1, 0)).joinToString { "[${it.joinToString()}]" }}]")

            // Expected: [[-1, -1, 2], [-1, 0, 1]]
            println("[${ts.threeSum(intArrayOf(-1, 0, 1, 2, -1, -4)).joinToString { "[${it.joinToString()}]" }}]")

            // Expected: [[0, 0, 0]]
            println("[${ts.threeSum(intArrayOf(0, 0, 0)).joinToString { "[${it.joinToString()}]" }}]")

            // Expected: [[-4, -2, 6], [-4, 0, 4], [-4, 1, 3], [-4, 2, 2], [-2, -2, 4], [-2, 0, 2]]
            println("[${ts.threeSum(intArrayOf(-4, -2, -2, -2, 0, 1, 2, 2, 2, 3, 3, 4, 4, 6, 6)).joinToString { "[${it.joinToString()}]" }}]")
        }
    }

}
