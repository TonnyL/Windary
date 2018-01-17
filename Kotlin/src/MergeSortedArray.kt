//import java.util.Arrays

/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 *
 * Note:
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 *
 * Accepted.
 */
class MergeSortedArray {

    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        if (n == 0) return
        System.arraycopy(nums2, 0, nums1, m, n)
        nums1.sort(0, m + n)
//        println(Arrays.toString(nums1))
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val msa = MergeSortedArray()

            // Expected: [1]
            msa.merge(intArrayOf(1), 1, intArrayOf(), 0)
            // Expected: []
            msa.merge(intArrayOf(0), 0, intArrayOf(1), 1)
            // Expected: [1, 2, 3, 4, 5, 6]
            msa.merge(intArrayOf(4, 5, 6, 0, 0, 0), 3, intArrayOf(1, 2, 3), 3)
            // Expected: [0, 0, 0, 0, 1, 2, 3, 4, -1]
            msa.merge(intArrayOf(0, 0, 0, 1, 2, 3, -1, -1, -1), 6, intArrayOf(0, 4), 2)
            // Expected: [0, 1, 2, 3, 3, 4, 0, 0, 0]
            msa.merge(intArrayOf(0, 1, 2, 3, 0, 0, 0, 0, 0), 4, intArrayOf(3, 4, 0), 2)
            // Expected: [1, 1, 2, 0]
            msa.merge(intArrayOf(1, 2, 0, 0), 2, intArrayOf(1), 1)
            // Expected: [1, 2, 2, 3, 5, 6]
            msa.merge(intArrayOf(1, 2, 3, 0, 0, 0), 3, intArrayOf(2, 5, 6), 3)
        }
    }

}
