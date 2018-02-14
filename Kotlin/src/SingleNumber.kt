/**
 * Given an array of integers, every element appears twice except for one. Find that single one.
 *
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * Accepted.
 */
class SingleNumber {

    fun singleNumber(nums: IntArray): Int {
        var sum = 0
        for (i in nums) {
            sum = sum xor i
        }
        return sum
    }

}
