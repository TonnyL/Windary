/**
 * Follow up for "Search in Rotated Sorted Array":
 * What if duplicates are allowed?
 *
 * Would this affect the run-time complexity? How and why?
 *
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
 *
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 *
 * Write nums function to determine if nums given target is in the array.
 *
 * The array may contain duplicates.
 *
 * Accepted.
 */


/**
 * @param {number[]} nums
 * @param {number} target
 * @return {boolean}
 */
let search = function (nums, target) {
    if (nums == null || nums.length === 0) {
        return false;
    }

    let start = 0, end = nums.length - 1;
    while (start <= end) {
        let mid = parseInt(start + (end - start) / 2);
        if (nums[mid] === target) {
            return true;
        }
        if (nums[mid] < nums[end]) { // right half sorted
            if (target > nums[mid] && target <= nums[end]) {
                start = mid + 1
            } else {
                end = mid - 1
            }
        } else if (nums[mid] > nums[end]) {  // left half sorted
            if (target >= nums[start] && target < nums[mid]) {
                end = mid - 1
            } else {
                start = mid + 1
            }
        } else {
            end--;
        }
    }
    return false;
};


if (!search(null, 4)) {
    console.log("pass")
} else {
    console.error("failed")
}

if (!search([3, 2], 4)) {
    console.log("pass")
} else {
    console.error("failed")
}

if (!search([3, 1, 2], 4)) {
    console.log("pass")
} else {
    console.error("failed")
}

if (search([3, 1, 2], 2)) {
    console.log("pass")
} else {
    console.error("failed")
}

if (search([2, 2, 2, 2, 3, 4, 1, 1], 4)) {
    console.log("pass")
} else {
    console.error("failed")
}

if (search([4, 5, 6, 7, 0, 1, 2], 2)) {
    console.log("pass")
} else {
    console.error("failed")
}

if (search([4, 5, 6, 7, 0, 1, 2], 7)) {
    console.log("pass")
} else {
    console.error("failed")
}

if (search([4, 5, 6, 7, 0, 1, 2], 5)) {
    console.log("pass")
} else {
    console.error("failed")
}