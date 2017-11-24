/**
 * Follow up for [RemoveDuplicatesFromSortedArray]:
 * What if duplicates are allowed at most twice?
 *
 * For example,
 * Given sorted array nums = [1,1,1,2,2,3],
 *
 * Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3.
 * It doesn't matter what you leave beyond the new length.
 *
 * Accepted.
 */
class RemoveDuplicatesFromSortedArrayII {

    fun removeDuplicates(nums: IntArray): Int {
        if (nums.size <= 2) return nums.size

        var count = 0
        var i = 0
        while (i + 2 < nums.size - count) {
            if (nums[i + 1] == nums[i] && nums[i + 2] == nums[i]) {
                count++
                if (i + 3 <= nums.size - count)
                    System.arraycopy(nums, i + 3, nums, i + 2, nums.size - count - (i + 2))
            } else
                i++
        }

        return nums.size - count
    }

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val r = RemoveDuplicatesFromSortedArrayII()

            // Expected: 5
            println(r.removeDuplicates(intArrayOf(1, 1, 1, 2, 2, 3)))

            // Expected: 5
            println(r.removeDuplicates(intArrayOf(1, 1, 2, 2, 3)))

            // Expected: 2
            println(r.removeDuplicates(intArrayOf(1, 1)))

            // Expected: 1
            println(r.removeDuplicates(intArrayOf(1)))

            // Expected: 3
            println(r.removeDuplicates(intArrayOf(1, 1, 2)))
        }
    }

}
