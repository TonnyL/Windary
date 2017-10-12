/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 *
 */
class TwoSum {

    fun twoSum(nums: IntArray, target: Int): IntArray {

        for (i in nums.indices) {
            (i + 1 until nums.size)
                    .filter { target == nums[i] + nums[it] }
                    .forEach { return intArrayOf(i, it) }
        }

        return intArrayOf(0, 0)

    }

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val nums = intArrayOf(2, 5, 5, 11)
            val target = 10

            val result = TwoSum().twoSum(nums, target)
            for (i in result) {
                System.out.print("$i ")
            }
        }
    }

}
