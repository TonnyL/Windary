/**
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.
 * <p>
 * Each element in the array represents your maximum jump length at that position.
 * <p>
 * Determine if you are able to reach the last index.
 * <p>
 * For example:
 * A = [2,3,1,1,4], return true.
 * <p>
 * A = [3,2,1,0,4], return false.
 * <p>
 * Accepted.
 */
public class JumpGame {

    public boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }

        if (nums.length == 1) {
            return true;
        }

        int maxLength = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            maxLength--;
            maxLength = Math.max(maxLength, nums[i]);

            if (maxLength == 0) {
                return false;
            }
        }

        return maxLength > 0;
    }

    public static void main(String[] args) {
        JumpGame jg = new JumpGame();

        // Expected: false
        System.out.println(jg.canJump(null));

        // Expected: false
        System.out.println(jg.canJump(new int[]{}));

        // Expected: true
        System.out.println(jg.canJump(new int[]{1}));

        // Expected: true
        System.out.println(jg.canJump(new int[]{0}));

        // Expected: true
        System.out.println(jg.canJump(new int[]{2, 3, 1, 1, 4}));

        // Expected: false
        System.out.println(jg.canJump(new int[]{3, 2, 1, 0, 4}));

        // Expected: true
        System.out.println(jg.canJump(new int[]{4, 0, 0, 0}));
    }

}
