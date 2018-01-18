/**
 * Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target.
 * Return the sum of the three integers.
 * You may assume that each input would have exactly one solution.
 *
 * For example, given array S = {-1 2 1 -4}, and target = 1.
 *
 * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 *
 * Accepted.
 */
class ThreeSumClosest {

    fun threeSumClosest(nums: IntArray, target: Int): Int {
        nums.sort()

        var result = nums[0] + nums[1] + nums[2]
        for (i in 0 until nums.size - 2) {
            var l = i + 1
            var r = nums.size - 1
            while (l < r) {
                val tmp = nums[i] + nums[l] + nums[r]
                if (tmp == target) {
                    return tmp
                }
                if (Math.abs(tmp - target) < Math.abs(result - target)) {
                    result = tmp
                }
                if (tmp < target) {
                    l++
                } else if (tmp > target) {
                    r--
                }
            }
        }

        return result
    }

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val t = ThreeSumClosest()

            // Expected: 2
            println(t.threeSumClosest(intArrayOf(-1, 2, 1, 4), 1))

            // Expected: 3
            println(t.threeSumClosest(intArrayOf(1, 1, 1, 0), 100))

            // Expected: 2
            println(t.threeSumClosest(intArrayOf(1, 1, 1, 0), -100))

            // Expected: 2
            println(t.threeSumClosest(intArrayOf(-1, 2, 1, -4), 1))
        }
    }

}
