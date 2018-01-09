/**
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
 * <p>
 * For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
 * the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 * <p>
 * If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 * <p>
 * Accepted.
 */
public class MaximumSubArray {

    public int maxSubArray(int[] nums) {
        int tmp = 0;
        int max = nums[0];

        for (int i : nums) {
            tmp += i;
            if (tmp > max) {
                max = tmp;
            }

            if (tmp < 0) {
                tmp = 0;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        MaximumSubArray ms = new MaximumSubArray();

        // Expected: 1
        System.out.println(ms.maxSubArray(new int[]{1}));

        // Expected: -2
        System.out.println(ms.maxSubArray(new int[]{-4, -2}));

        // Expected: 1
        System.out.println(ms.maxSubArray(new int[]{1, 0, -1}));

        // Expected: 6
        System.out.println(ms.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

}
