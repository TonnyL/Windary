/**
 * Given an array of integers sorted in ascending order, find the starting and ending position of a given target value.
 *
 * Your algorithm's runtime complexity must be in the order of O(log n).
 *
 * If the target is not found in the array, return [-1, -1].
 *
 * For example,
 * Given [5, 7, 7, 8, 8, 10] and target value 8,
 * return [3, 4].
 *
 * Accepted.
 */


/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
let searchRange = function (nums, target) {
    let result = [-1, -1];
    if (nums.length <= 0) {
        return result;
    }

    for (let i = 0; i < nums.length; i++) {
        if (nums[i] === target) {
            result[0] = i;
            break;
        }
    }

    for (let j = nums.length - 1; j >= 0; j--) {
        if (nums[j] === target) {
            result[1] = j;
            break;
        }
    }

    return result;
};


if (searchRange([1], 1).toString() === [0, 0].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

if (searchRange([5, 7, 7, 8, 8, 10], 11).toString() === [-1, -1].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

if (searchRange([5, 7, 7, 8, 8, 10], 8).toString() === [3, 4].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}