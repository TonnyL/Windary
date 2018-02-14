/**
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * <p>
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 * <p>
 * Accepted.
 */
public class SingleNumber {

    public int singleNumber(int[] nums) {
        int sum = 0;
        if (nums == null) {
            return sum;
        }
        for (int i : nums) {
            sum ^= i;
        }
        return sum;
    }

}
