import java.util.Arrays;

/**
 * Follow up for "Search in Rotated Sorted Array":
 * What if duplicates are allowed?
 * <p>
 * Would this affect the run-time complexity? How and why?
 * <p>
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
 * <p>
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 * <p>
 * Write nums function to determine if nums given target is in the array.
 * <p>
 * The array may contain duplicates.
 * <p>
 * Accepted.
 */
public class SearchInRotatedSortedArrayII {

    public boolean search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return false;
        }

        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return true;
            }
            if (nums[mid] < nums[end]) { // right half sorted
                if (target > nums[mid] && target <= nums[end]) {
                    return Arrays.binarySearch(nums, mid, end + 1, target) >= 0;
                } else {
                    end = mid - 1;
                }
            } else if (nums[mid] > nums[end]) {  // left half sorted
                if (target >= nums[start] && target < nums[mid]) {
                    return Arrays.binarySearch(nums, start, mid + 1, target) >= 0;
                } else {
                    start = mid + 1;
                }
            } else {
                end--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        SearchInRotatedSortedArrayII s = new SearchInRotatedSortedArrayII();

        // Expected: false
        System.out.println(s.search(null, 4));

        // Expected: false
        System.out.println(s.search(new int[]{3, 2}, 4));

        // Expected: false
        System.out.println(s.search(new int[]{3, 1, 2}, 4));

        // Expected: true
        System.out.println(s.search(new int[]{3, 1, 2}, 2));

        // Expected: true
        System.out.println(s.search(new int[]{2, 2, 2, 2, 3, 4, 1, 1}, 4));

        // Expected: true
        System.out.println(s.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 2));

        // Expected: true
        System.out.println(s.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 7));

        // Expected: true
        System.out.println(s.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 5));

    }

}
