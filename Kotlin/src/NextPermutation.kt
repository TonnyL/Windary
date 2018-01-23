import java.util.Arrays

/**
 * Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.
 *
 * If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).
 *
 * The replacement must be in-place, do not allocate extra memory.
 *
 * Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.
 * 1,2,3 → 1,3,2
 * 3,2,1 → 1,2,3
 * 1,1,5 → 1,5,1
 *
 * Accepted.
 */
class NextPermutation {

    fun nextPermutation(nums: IntArray) {
        var i = nums.size - 2
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--
        }
        if (i >= 0) {
            var j = nums.size - 1
            while (nums[j] <= nums[i]) {
                j--
            }
            swap(nums, i, j)
        }
        reverse(nums, i + 1, nums.size - 1)
    }

    private fun swap(nums: IntArray, i: Int, j: Int) {
        val tmp = nums[i]
        nums[i] = nums[j]
        nums[j] = tmp
    }

    private fun reverse(nums: IntArray, i: Int, j: Int) {
        var tmpI = i
        var tmpJ = j
        while (tmpI < tmpJ) {
            swap(nums, tmpI++, tmpJ--)
        }
    }

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val np = NextPermutation()

            // Expected: [1, 3, 2]
            val array123 = intArrayOf(1, 2, 3)
            np.nextPermutation(array123)
            println(Arrays.toString(array123))

            // Expected: [1, 2, 3]
            val array321 = intArrayOf(3, 2, 1)
            np.nextPermutation(array321)
            println(Arrays.toString(array321))

            // Expected: [1, 5, 1]
            val array115 = intArrayOf(1, 1, 5)
            np.nextPermutation(array115)
            println(Arrays.toString(array115))
        }
    }

}
