/*
 * Reverse bits of a given 32 bits unsigned integer.
 *
 * Example:
 *
 * Input: 43261596
 * Output: 964176192
 * Explanation: 43261596 represented in binary as 00000010100101000001111010011100,
 * return 964176192 represented in binary as 00111001011110000010100101000000.
 * Follow up:
 * If this function is called many times, how would you optimize it?
 */

/**
 * @param {number} n - a positive integer
 * @return {number} - a positive integer
 */
let reverseBits = function (n) {
    let tmp = 0;
    for (let i = 0; i < 32; i++) {
        tmp = tmp * 2 + n % 2;
        n = parseInt(n / 2);
    }
    return tmp
};

if (reverseBits(0) === 0) {
    console.log("pass")
} else {
    console.error("failed")
}

if (reverseBits(964176192) === 43261596) {
    console.log("pass")
} else {
    console.error("failed")
}