/**
 * Reverse bits of a given 32 bits unsigned integer.
 *
 *
 * Example:
 *
 *
 * Input: 43261596
 * Output: 964176192
 * Explanation: 43261596 represented in binary as 00000010100101000001111010011100,
 * return 964176192 represented in binary as 00111001011110000010100101000000.
 * Follow up:
 * If this function is called many times, how would you optimize it?
 */

class ReverseBits {

    // you need treat n as an unsigned value
    fun reverseBits(n: Int): Int {
        return Integer.reverse(n)
        // This solution cannot pass some test cases
        // because java does not have a definition of unsigned int.
        // var newN = n
        // var tmp = 0
        // for (i in 0 until 32) {
        // tmp = tmp * 2 + newN % 2
        // newN /= 2
        // }
        // return tmp
    }

}
