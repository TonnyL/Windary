/**
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.
 *
 * Each element in the array represents your maximum jump length at that position.
 *
 * Determine if you are able to reach the last index.
 *
 * For example:
 * A = [2,3,1,1,4], return true.
 *
 * A = [3,2,1,0,4], return false.
 *
 * Accepted.
 */

/**
 * @param {number[]} nums
 * @return {boolean}
 */
let canJump = function (nums) {
    if (nums == null || nums.length === 0) {
        return false;
    }

    if (nums.length === 1) {
        return true;
    }

    let maxLength = 0;
    for (let i = 0; i < nums.length - 1; i++) {
        maxLength--;
        maxLength = Math.max(maxLength, nums[i]);

        if (maxLength === 0) {
            return false;
        }
    }

    return maxLength > 0;
};


if (canJump(null) === false) {
    console.log("pass")
} else {
    console.error("failed")
}

if (canJump([]) === false) {
    console.log("pass")
} else {
    console.error("failed")
}

if (canJump([1])) {
    console.log("pass")
} else {
    console.error("failed")
}

if (canJump([0])) {
    console.log("pass")
} else {
    console.error("failed")
}

if (canJump([2, 3, 1, 1, 4])) {
    console.log("pass")
} else {
    console.error("failed")
}

if (canJump([3, 2, 1, 0, 4]) === false) {
    console.log("pass")
} else {
    console.error("failed")
}

if (canJump([4, 0, 0, 0])) {
    console.log("pass")
} else {
    console.error("failed")
}