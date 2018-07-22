/**
 * Reverse bits of a given 32 bits unsigned integer.
 * <p>
 * Example:
 * <p>
 * Input: 43261596
 * Output: 964176192
 * Explanation: 43261596 represented in binary as 00000010100101000001111010011100,
 * return 964176192 represented in binary as 00111001011110000010100101000000.
 * Follow up:
 * If this function is called many times, how would you optimize it?
 * <p>
 * Accepted.
 */

public class ReverseBits {

    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        // a trick to solve this problem.
        return Integer.reverse(n);
        // This solution cannot pass some test cases
        // because java does not have a definition of unsigned int.
        // int tmp = 0;
        // for (int i = 0; i < 32; i++) {
        // tmp = tmp * 2 + n % 2;
        // n = n / 2;
        // }
        // return tmp;
    }

}
