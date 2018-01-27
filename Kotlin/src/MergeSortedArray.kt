import java.util.Arrays

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
        if (n == 0) {
            return
        }
        System.arraycopy(nums2, 0, nums1, m, n)
        nums1.sort(0, m + n)
        // println(Arrays.toString(nums1))
    }

}
