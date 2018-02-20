/**
 * Given an array of integers, every element appears three times except for one, which appears exactly once. Find that single one.
 *
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * Accepted.
 */
class SingleNumberII {

    fun singleNumber(nums: IntArray): Int {
        var one = 0
        var two = 0
        var three = 0
        for (num in nums) {
            two = two or (one and num)
            one = one xor num
            three = one and two
            two -= three
            one -= three
        }
        return one
    }

}
