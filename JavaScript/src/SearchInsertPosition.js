/**
 * Given a sorted array and a target value, return the index if the target is found. If not,
 * return the index where it would be if it were inserted in order.
 * You may assume no duplicates in the array.
 * Here are few examples.
 *
 * [1,3,5,6], 5 → 2
 * [1,3,5,6], 2 → 1
 * [1,3,5,6], 7 → 4
 * [1,3,5,6], 0 → 0
 *
 * Accepted.
 */


/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
let searchInsert = function (nums, target) {
    if (nums == null || nums.length === 0) {
        return 0;
    }
    for (let i = 0; i < nums.length; i++) {
        if (nums[i] === target) {
            return i;
        } else if (nums[i] < target) {
            if ((i + 1 < nums.length && nums[i + 1] > target)
                || (i + 1 === nums.length)) {
                return i + 1;
            }
        }
    }
    return 0;
};


if (searchInsert([1], 0) === 0) {
    console.log("pass")
} else {
    console.error("failed")
}

if (searchInsert([1, 3, 5, 6], 5) === 2) {
    console.log("pass")
} else {
    console.error("failed")
}

if (searchInsert([1, 3, 5, 6], 2) === 1) {
    console.log("pass")
} else {
    console.error("failed")
}

if (searchInsert([1, 3, 5, 6], 7) === 4) {
    console.log("pass")
} else {
    console.error("failed")
}

if (searchInsert([1, 3, 5, 6], 0) === 0) {
    console.log("pass")
} else {
    console.error("failed")
}