/**
 * Given an array and a value, remove all instances of that value in place and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * Example:
 * Given input array nums = [3,2,2,3], val = 3
 * Your function should return length = 2, with the first two elements of nums being 2.
 *
 * Accepted.
 */
class RemoveElement {

    fun removeElement(nums: IntArray, `val`: Int): Int {
        if (nums.isEmpty()) {
            return 0
        }
        if (nums.size == 1) {
            return if (nums[0] == `val`) 0 else 1
        }

        var lastIndex = nums.size - 1
        for (i in 0 until lastIndex) {
            if (nums[i] == `val`) {
                exchange2values(nums, i, lastIndex)
                lastIndex--

                while (lastIndex > i && nums[i] == `val`) {
                    exchange2values(nums, i, lastIndex)
                    lastIndex--
                }
            }
        }

        return nums.indices.firstOrNull {
            nums[it] == `val`
        } ?: nums.size
    }

    private fun exchange2values(nums: IntArray, i: Int, lastIndex: Int) {
        if (i in 0..lastIndex) {
            val tmp = nums[lastIndex]
            nums[lastIndex] = nums[i]
            nums[i] = tmp
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val re = RemoveElement()
            // Expected:
            // nums: [2, 2, 3, 3] length = 2
            println(re.removeElement(intArrayOf(3, 2, 2, 3), 3))
            // Expected:
            // nums: [3, 3] length = 0
            println(re.removeElement(intArrayOf(3, 3), 3))
            // Expeted:
            // nums: [] length = 0
            println(re.removeElement(intArrayOf(), 0))
            // Expected:
            // nums: [3, 4, 5, 888, 2, 2] length = 4
            println(re.removeElement(intArrayOf(2, 3, 4, 5, 888, 2), 2))
            // Expected:
            // nums: [3, 3] length = 2
            println(re.removeElement(intArrayOf(3, 3), 0))
        }
    }

}