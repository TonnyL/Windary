/**
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 *
 * You may assume that the array is non-empty and the majority element always exist in the array.
 *
 * Accepted.
 */
class MajorityElement {

    fun majorityElement(nums: IntArray): Int {
        val map = mutableMapOf<Int, Int>()

        for (i in nums) {
            if (map.containsKey(i)) {
                map[i] = map[i]!! + 1
            } else {
                map[i] = 1
            }

            if (map[i]!! > nums.size / 2) {
                return i
            }
        }

        return nums[0]
    }

}
