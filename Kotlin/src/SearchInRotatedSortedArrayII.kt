import java.util.Arrays

/**
 * Follow up for "Search in Rotated Sorted Array":
 * What if duplicates are allowed?
 *
 * Would this affect the run-time complexity? How and why?
 *
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
 *
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 *
 * Write nums function to determine if nums given target is in the array.
 *
 * The array may contain duplicates.
 *
 * Accepted.
 */
class SearchInRotatedSortedArrayII {

    fun search(nums: IntArray, target: Int): Boolean {
        if (nums.isEmpty()) {
            return false
        }

        var start = 0
        var end = nums.size - 1
        while (start <= end) {
            val mid = start + (end - start) / 2
            if (nums[mid] == target) {
                return true
            }
            if (nums[mid] < nums[end]) { // right half sorted
                if (target > nums[mid] && target <= nums[end]) {
                    return Arrays.binarySearch(nums, mid, end + 1, target) >= 0
                } else {
                    end = mid - 1
                }
            } else if (nums[mid] > nums[end]) {  // left half sorted
                if (target >= nums[start] && target < nums[mid]) {
                    return Arrays.binarySearch(nums, start, mid + 1, target) >= 0
                } else {
                    start = mid + 1
                }
            } else {
                end--
            }
        }
        return false
    }

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val s = SearchInRotatedSortedArrayII()

            // Expected: false
            println(s.search(intArrayOf(3, 2), 4))

            // Expected: false
            println(s.search(intArrayOf(3, 1, 2), 4))

            // Expected: true
            println(s.search(intArrayOf(3, 1, 2), 2))

            // Expected: true
            println(s.search(intArrayOf(2, 2, 2, 2, 3, 4, 1, 1), 4))

            // Expected: true
            println(s.search(intArrayOf(4, 5, 6, 7, 0, 1, 2), 2))

            // Expected: true
            println(s.search(intArrayOf(4, 5, 6, 7, 0, 1, 2), 7))

            // Expected: true
            println(s.search(intArrayOf(4, 5, 6, 7, 0, 1, 2), 5))

        }
    }

}
