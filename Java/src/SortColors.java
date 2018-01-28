/**
 * Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.
 * <p>
 * Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
 * <p>
 * Note:
 * You are not suppose to use the library's sort function for this problem.
 * <p>
 * Follow up:
 * A rather straight forward solution is a two-pass algorithm using counting sort.
 * First, iterate the array counting number of 0's, 1's, and 2's, then overwrite array with total number of 0's, then 1's and followed by 2's.
 * <p>
 * Could you come up with an one-pass algorithm using only constant space?
 * <p>
 * Accepted.
 */
public class SortColors {

    public void sortColors(int[] nums) {
        for (int k = 0, i = 0, j = 0; k < nums.length; k++) {
            int tmp = nums[k];
            nums[k] = 2;
            if (tmp < 2) {
                nums[j] = 1;
                j++;
            }

            if (tmp == 0) {
                nums[i] = 0;
                i++;
            }
        }

        // System.out.println(Arrays.toString(nums));
    }

}
