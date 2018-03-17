/**
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 *
 * You may assume that the array is non-empty and the majority element always exist in the array.
 *
 * Accepted.
 */

/**
 * @param {number[]} nums
 * @return {number}
 */
let majorityElement = function (nums) {
    let map = [];
    for (let i = 0, len = nums.length; i < len; i++) {
        if (!map[nums[i]]) {
            map[nums[i]] = 1;
        } else {
            map[nums[i]]++;
        }

        if (map[nums[i]] > len / 2) {
            return nums[i];
        }
    }
};

if (majorityElement([2, 1, 1]) === 1) {
    console.log("pass")
} else {
    console.error("failed")
}

if (majorityElement([0, 1, 1, 1, 2, 3, 1]) === 1) {
    console.log("pass")
} else {
    console.error("failed")
}

if (majorityElement([1, 1]) === 1) {
    console.log("pass")
} else {
    console.error("failed")
}
