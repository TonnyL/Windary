/**
 * Follow up for {@link RemoveDuplicatesFromSortedArray}:
 * What if duplicates are allowed at most twice?
 * <p>
 * For example,
 * Given sorted array nums = [1,1,1,2,2,3],
 * <p>
 * Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3.
 * It doesn't matter what you leave beyond the new length.
 * <p>
 * Accepted.
 */
public class RemoveDuplicatesFromSortedArrayII {

    public int removeDuplicates(int[] nums) {
        if (nums == null) {
            return 0;
        }
        if (nums.length <= 2) {
            return nums.length;
        }

        int count = 0, i = 0;
        while (i + 2 < nums.length - count) {
            if (nums[i + 1] == nums[i] && nums[i + 2] == nums[i]) {
                count++;
                if (i + 3 <= nums.length - count) {
                    System.arraycopy(nums, i + 3, nums, i + 2, nums.length - count - (i + 2));
                }
            } else {
                i++;
            }
        }

        return nums.length - count;
    }

}
