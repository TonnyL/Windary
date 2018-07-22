# Reverse bits of a given 32 bits unsigned integer.
#
# Example:
#
# Input: 43261596
# Output: 964176192
# Explanation: 43261596 represented in binary as 00000010100101000001111010011100,
#              return 964176192 represented in binary as 00111001011110000010100101000000.
# Follow up:
# If this function is called many times, how would you optimize it?
#
# Python2 accepted. Python3 not submitted.


class ReverseBits:
    # @param n, an integer
    # @return an integer
    def reverseBits(self, n):
        tmp = 0
        for i in range(0, 32):
            tmp = tmp * 2 + n % 2
            n = n // 2
        return tmp
