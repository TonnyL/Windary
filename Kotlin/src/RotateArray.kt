/**
 * Rotate an array of n elements to the right by k steps.
 *
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 *
 * Accepted.
 */
class RotateArray {

    fun rotate(nums: IntArray, k: Int) {
        var newK = k
        newK %= nums.size
        reverse(nums, 0, nums.size - 1)
        reverse(nums, 0, newK - 1)
        reverse(nums, newK, nums.size - 1)
    }

    private fun reverse(nums: IntArray, start: Int, end: Int) {
        var newStart = start
        var newEnd = end
        while (newStart < newEnd) {
            val temp = nums[newStart]
            nums[newStart] = nums[newEnd]
            nums[newEnd] = temp
            newStart++
            newEnd--
        }
    }

}
