/**
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 * You are given nums target value to search. If found in the array return its index, otherwise return -1.
 * You may assume no duplicate exists in the array.
 *
 * Accepted.
 */

/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
let search = function (nums, target) {
    if (nums == null || nums.length === 0) {
        return -1;
    }

    let l = 0, r = nums.length - 1;
    while (l <= r) {
        let m = parseInt((l + r) / 2);
        if (nums[m] === target) {
            return m;
        }
        if (nums[m] >= nums[l]) {
            if (nums[l] <= target && target < nums[m]) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        } else {
            if (nums[m] < target && target <= nums[r]) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
    }
    return -1;
};


if (search([], 1) === -1) {
    console.log("pass")
} else {
    console.error("failed")
}

if (search([0, 1, 2, 4, 5, 6, 7], 7) === 6) {
    console.log("pass")
} else {
    console.error("failed")
}

if (search([4, 5, 6, 7, 0, 1, 2], 7) === 3) {
    console.log("pass")
} else {
    console.error("failed")
}

if (search([5, 6, 7, 0, 1, 2, 4], 7) === 2) {
    console.log("pass")
} else {
    console.error("failed")
}

if (search([4, 5, 6, 7, 0, 1, 2], 8) === -1) {
    console.log("pass")
} else {
    console.error("failed")
}