import java.util.Arrays;

/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * <p>
 * Note:
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 * <p>
 * Accepted.
 */
public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) return;
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1, 0, m + n);
//        System.out.print("[");
//        Arrays.stream(nums1).forEach(it -> System.out.print(it + ","));
//        System.out.println("]");
    }

    public static void main(String[] args) {
        MergeSortedArray msa = new MergeSortedArray();

        // Expected: [1]
        msa.merge(new int[]{1}, 1, new int[]{}, 0);
        // Expected: []
        msa.merge(new int[]{0}, 0, new int[]{1}, 1);
        // Expected: [1, 2, 3, 4, 5, 6]
        msa.merge(new int[]{4, 5, 6, 0, 0, 0}, 3, new int[]{1, 2, 3}, 3);
        // Expected: [0, 0, 0, 0, 1, 2, 3, 4, -1]
        msa.merge(new int[]{0, 0, 0, 1, 2, 3, -1, -1, -1}, 6, new int[]{0, 4}, 2);
        // Expected: [0, 1, 2, 3, 3, 4, 0, 0, 0]
        msa.merge(new int[]{0, 1, 2, 3, 0, 0, 0, 0, 0}, 4, new int[]{3, 4, 0}, 2);
        // Expected: [1, 1, 2, 0]
        msa.merge(new int[]{1, 2, 0, 0}, 2, new int[]{1}, 1);
        // Expected: [1, 2, 2, 3, 5, 6]
        msa.merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
    }

}
