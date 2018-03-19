/**
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0?
 * Find all unique triplets in the array which gives the sum of zero.
 * <p>
 * Note: The solution set must not contain duplicate triple
 * <p>
 * For example, given array S = [-1, 0, 1, 2, -1, -4],
 * <p>
 * A solution set is:
 * [
 * [-1, 0, 1],
 * [-1, -1, 2]
 * ]
 * <p>
 * Accepted.
 */

/**
 * @param {number[]} nums
 * @return {number[][]}
 */
let threeSum = function (nums) {
    let sum, right, left;
    let result = [];

    nums.sort((a, b) => a - b).forEach((n, i) => {
        [left, right] = [i + 1, nums.length - 1];
        if (n !== nums[i - 1]) {
            while (left < right) {
                sum = n + nums[left] + nums[right];
                if (sum === 0) {
                    result.push([n, nums[left], nums[right]]);
                    while (left < right && nums[left] === nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] === nums[right - 1]) {
                        right--;
                    }
                    right--;
                    left++;
                } else if (sum > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }
    });

    return result;
};


if (threeSum([-1, 0]).length === 0) {
    console.log("pass")
} else {
    console.error("failed")
}

if (new Set(threeSum([-1, 0, 1, 2, -1, -4])).toString() === new Set([[-1, -1, 2], [-1, 0, 1]]).toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

if (threeSum([0, 0, 0]).toString() === [[0, 0, 0]].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

if (new Set(threeSum([-4, -2, -2, -2, 0, 1, 2, 2, 2, 3, 3, 4, 4, 6, 6])).toString() === new Set([[-4, -2, 6], [-4, 0, 4], [-4, 1, 3], [-4, 2, 2], [-2, -2, 4], [-2, 0, 2]]).toString()) {
    console.log("pass")
} else {
    console.error("failed")
}