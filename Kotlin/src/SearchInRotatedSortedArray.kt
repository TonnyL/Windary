/**
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 * You are given nums target value to search. If found in the array return its index, otherwise return -1.
 * You may assume no duplicate exists in the array.
 *
 * Accepted.
 */
class SearchInRotatedSortedArray {

    fun search(nums: IntArray, target: Int): Int {
        if (nums.isEmpty()) return -1

        var l = 0
        var r = nums.size - 1
        while (l <= r) {
            val m = (l + r) / 2
            if (nums[m] == target) return m
            if (nums[m] >= nums[l]) {
                if (nums[l] <= target && target < nums[m])
                    r = m - 1
                else
                    l = m + 1
            } else {
                if (nums[m] < target && target <= nums[r])
                    l = m + 1
                else
                    r = m - 1
            }
        }
        return -1
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val s = SearchInRotatedSortedArray()

            // Expected: -1
            println(s.search(intArrayOf(), 1))
            // Expected: 6
            println(s.search(intArrayOf(0, 1, 2, 4, 5, 6, 7), 7))
            // Expected: 3
            println(s.search(intArrayOf(4, 5, 6, 7, 0, 1, 2), 7))
            // Expected: 2
            println(s.search(intArrayOf(5, 6, 7, 0, 1, 2, 4), 7))
            // Expected: -1
            println(s.search(intArrayOf(4, 5, 6, 7, 0, 1, 2), 8))
        }
    }

}
