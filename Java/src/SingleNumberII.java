/**
 * Given an array of integers, every element appears three times except for one, which appears exactly once. Find that single one.
 * <p>
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 * <p>
 * Accepted.
 */
public class SingleNumberII {

    public int singleNumber(int[] nums) {
        int one = 0, two = 0, three = 0;
        for (int num : nums) {
            two |= (one & num);
            one ^= num;
            three = one & two;
            two -= three;
            one -= three;
        }
        return one;
    }

}
