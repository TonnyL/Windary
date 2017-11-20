import java.util.*;

/**
 * Given an array of integers sorted in ascending order, find the starting and ending position of a given target value.
 * <p>
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * <p>
 * If the target is not found in the array, return [-1, -1].
 * <p>
 * For example,
 * Given [5, 7, 7, 8, 8, 10] and target value 8,
 * return [3, 4].
 * <p>
 * Accepted.
 */
public class SearchForARange {

    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        if (nums.length <= 0) return result;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                result[0] = i;
                break;
            }
        }

        for (int j = nums.length - 1; j >= 0; j--) {
            if (nums[j] == target) {
                result[1] = j;
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        SearchForARange sr = new SearchForARange();

        // Expected: [0, 0]
        System.out.println(Arrays.toString(sr.searchRange(new int[]{1}, 1)));

        // Expected: [-1, -1]
        System.out.println(Arrays.toString(sr.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 11)));

        // Expected: [3, 4]
        System.out.println(Arrays.toString(sr.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)));
    }

}
