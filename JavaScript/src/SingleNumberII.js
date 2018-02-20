/**
 * Given an array of integers, every element appears three times except for one, which appears exactly once. Find that single one.
 *
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * Accepted.
 */

/**
 * @param {number[]} nums
 * @return {number}
 */
let singleNumber = function (nums) {
    let one = 0;
    let two = 0;
    let three = 0;
    nums.forEach(function (num) {
        two |= (one & num);
        one ^= num;
        three = one & two;
        two -= three;
        one -= three;
    });
    return one
};

if (singleNumber([1]) === 1) {
    console.log("pass")
} else {
    console.error("failed")
}

if (singleNumber([1, 1, 1]) === 0) {
    console.log("pass")
} else {
    console.error("failed")
}

if (singleNumber([1, 1, 1, 2]) === 2) {
    console.log("pass")
} else {
    console.error("failed")
}

if (singleNumber([1, 1, 1, 2, 2, 2, 3]) === 3) {
    console.log("pass")
} else {
    console.error("failed")
}