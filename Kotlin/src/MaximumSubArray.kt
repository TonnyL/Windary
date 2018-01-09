/**
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
 *
 * For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
 * the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 *
 * If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 *
 * Accepted.
 */
class MaximumSubArray {

    fun maxSubArray(nums: IntArray): Int {
        var tmp = 0
        var max = nums[0]

        for (i in nums) {
            tmp += i
            if (tmp > max) {
                max = tmp
            }

            if (tmp < 0) {
                tmp = 0
            }
        }

        return max
    }

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val ms = MaximumSubArray()

            // Expected: 1
            println(ms.maxSubArray(intArrayOf(1)))

            // Expected: -2
            println(ms.maxSubArray(intArrayOf(-4, -2)))

            // Expected: 1
            println(ms.maxSubArray(intArrayOf(1, 0, -1)))

            // Expected: 6
            println(ms.maxSubArray(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)))
        }
    }

}
