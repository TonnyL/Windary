/**
 *
 * Given a 32-bit signed integer, reverse digits of an integer.
 *
 * Example 1: Input: 123, Output:  321
 * Example 2: Input: -123, Output: -321
 *
 * Have you thought about this?
 * Here are some good questions to ask before coding. Bonus points for you if you have already thought through this!
 * If the integer's last digit is 0, what should the output be? ie, cases such as 10, 100.
 * Did you notice that the reversed integer might overflow? Assume the input is a 32-bit integer, then the reverse of 1000000003 overflows.
 * How should you handle such cases?
 * For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 *
 * Note:
 * Assume we are dealing with an environment which could only hold integers within the 32-bit signed integer range.
 * For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 */

/**
 * @param {number} x
 * @return {number}
 */
let reverse = function (x) {
    if (x === 0) {
        return 0;
    }

    let result = 0;
    let anotherX = x;

    while (anotherX !== 0) {
        result = result * 10 + anotherX % 10;
        anotherX = parseInt(anotherX / 10);
    }

    let intMax = 2147483647;
    let intMin = -2147483648;
    if ((result > 0 && (result - intMax) > 0) || (result < 0 && (result - intMin) < 0)) {
        return 0
    }

    return parseInt(result)
};


if (reverse(123) === 321) {
    console.log("pass")
} else {
    console.error("failed")
}

if (reverse(-123) === -321) {
    console.log("pass")
} else {
    console.error("failed")
}

if (reverse(1000000003) === 0) {
    console.log("pass")
} else {
    console.error("failed")
}

if (reverse(1534236469) === 0) {
    console.log("pass")
} else {
    console.error("failed")
}