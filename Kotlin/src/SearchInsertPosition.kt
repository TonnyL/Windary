/**
 * Given a sorted array and a target value, return the index if the target is found. If not,
 * return the index where it would be if it were inserted in order.
 * You may assume no duplicates in the array.
 * Here are few examples.
 *
 * [1,3,5,6], 5 → 2
 * [1,3,5,6], 2 → 1
 * [1,3,5,6], 7 → 4
 * [1,3,5,6], 0 → 0
 *
 */
class SearchInsertPosition {

    fun searchInsert(nums: IntArray?, target: Int): Int {
        if (nums == null || nums.isEmpty()) {
            return 0
        }
        for (i in nums.indices) {
            if (nums[i] == target) {
                return i
            } else if (nums[i] < target) {
                if (i + 1 < nums.size && nums[i + 1] > target || i + 1 == nums.size) {
                    return i + 1
                }
            }
        }
        return 0
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val sip = SearchInsertPosition()
            // Expected: 0
            println(sip.searchInsert(intArrayOf(1), 0))
            // Expected: 2
            println(sip.searchInsert(intArrayOf(1, 3, 5, 6), 5))
            // Expected: 1
            println(sip.searchInsert(intArrayOf(1, 3, 5, 6), 2))
            // Expected: 4
            println(sip.searchInsert(intArrayOf(1, 3, 5, 6), 7))
            // Expected: 0
            println(sip.searchInsert(intArrayOf(1, 3, 5, 6), 0))
        }
    }

}