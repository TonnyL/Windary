/**
 * Follow up for RemoveDuplicatesFromSortedArray:
 * What if duplicates are allowed at most twice?
 * <p>
 * For example,
 * Given sorted array nums = [1,1,1,2,2,3],
 * <p>
 * Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3.
 * It doesn't matter what you leave beyond the new length.
 * <p>
 * Accepted.
 */

/**
 * @param {number[]} nums
 * @return {number}
 */
let removeDuplicates = function (nums) {
    if (nums == null) {
        return 0;
    }
    if (nums.length <= 2) {
        return nums.length;
    }

    let i = 0;
    while (i < (nums.length - 2)) {
        if (nums[i + 1] === nums[i] && nums[i + 2] === nums[i]) {
            nums.splice(i + 2, 1);
        } else {
            i++;
        }
    }

    return nums.length;
};


if (removeDuplicates([1, 1, 1, 2, 2, 3]) === 5) {
    console.log("pass")
} else {
    console.error("failed")
}

if (removeDuplicates([1, 1, 2, 2, 3]) === 5) {
    console.log("pass")
} else {
    console.error("failed")
}

if (removeDuplicates(null) === 0) {
    console.log("pass")
} else {
    console.error("failed")
}

if (removeDuplicates([1, 1]) === 2) {
    console.log("pass")
} else {
    console.error("failed")
}

if (removeDuplicates([1, 1, 1, 1]) === 2) {
    console.log("pass")
} else {
    console.error("failed")
}