/**
 * Given an array of integers, every element appears twice except for one. Find that single one.
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
var singleNumber = function (nums) {
    var sum = 0;
    if (nums === null) {
        return sum;
    }
    nums.forEach(function (i) {
        sum ^= i;
    });
    return sum;
};

if (singleNumber(null) === 0) {
    console.log("pass")
} else {
    console.error("failed")
}

if (singleNumber([1]) === 1) {
    console.log("pass")
} else {
    console.error("failed")
}

if (singleNumber([1, 1, 2]) === 2) {
    console.log("pass")
} else {
    console.error("failed")
}

if (singleNumber([1, 1, 2, 2, 3]) === 3) {
    console.log("pass")
} else {
    console.error("failed")
}
