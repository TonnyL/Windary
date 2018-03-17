/**
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * For example,
 * Given input array nums = [1,1,2],
 * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
 * It doesn't matter what you leave beyond the new length.
 *
 * Accepted.
 */

/**
 * @param {number[]} nums
 * @return {number}
 */
let removeDuplicates = function (nums) {
    if (nums == null || nums.length === 0) {
        return 0;
    }

    let i = 0;
    for (let j = 1; j < nums.length; j++) {
        if (nums[j] !== nums[i]) {
            i++;
            nums[i] = nums[j];
        }
    }

    // console.log(nums.toString());

    return i + 1;
};

// Expected: [], length = 0
if (removeDuplicates([]) === 0) {
    console.log("pass")
} else {
    console.error("failed")
}

// Expected: [1, 2, 2], length = 2
if (removeDuplicates([1, 2, 2]) === 2) {
    console.log("pass")
} else {
    console.error("failed")
}

// Expected: [1, 1, 1], length = 1
if (removeDuplicates([1, 1, 1]) === 1) {
    console.log("pass")
} else {
    console.error("failed")
}

// Expected: [1, 2, 3, 4, 4], length = 4
if (removeDuplicates([1, 1, 2, 3, 4]) === 4) {
    console.log("pass")
} else {
    console.error("failed")
}