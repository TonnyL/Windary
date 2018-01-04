/**
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.
 *
 * Each element in the array represents your maximum jump length at that position.
 *
 * Determine if you are able to reach the last index.
 *
 * For example:
 * A = [2,3,1,1,4], return true.
 *
 * A = [3,2,1,0,4], return false.
 *
 * Accepted.
 */
class JumpGame {

    fun canJump(nums: IntArray): Boolean {
        if (nums.isEmpty()) {
            return false
        }

        if (nums.size == 1) {
            return true
        }

        var maxLength = 0
        for (i in 0 until nums.size - 1) {
            maxLength--
            maxLength = Math.max(maxLength, nums[i])

            if (maxLength == 0) {
                return false
            }
        }

        return maxLength > 0
    }

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val jg = JumpGame()

            // Expected: false
            println(jg.canJump(intArrayOf()))

            // Expected: true
            println(jg.canJump(intArrayOf(1)))

            // Expected: true
            println(jg.canJump(intArrayOf(0)))

            // Expected: true
            println(jg.canJump(intArrayOf(2, 3, 1, 1, 4)))

            // Expected: false
            println(jg.canJump(intArrayOf(3, 2, 1, 0, 4)))

            // Expected: true
            println(jg.canJump(intArrayOf(4, 0, 0, 0)))
        }
    }

}
