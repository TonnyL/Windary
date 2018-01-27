/**
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * For example,
 * Given input array nums = [1,1,2],
 * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
 * It doesn't matter what you leave beyond the new length.
 *
 * Accepted.
 */
class RemoveDuplicatesFromSortedArray {

    fun removeDuplicates(nums: IntArray): Int {
        if (nums.isEmpty()) {
            return 0
        }

        var i = 0
        for (j in 1 until nums.size) {
            if (nums[j] != nums[i]) {
                i++
                nums[i] = nums[j]
            }
        }

        // println(Arrays.toString(nums))

        return i + 1
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

        }
    }

}