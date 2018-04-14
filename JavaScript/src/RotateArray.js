/**
 * Rotate an array of n elements to the right by k steps.
 *
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 *
 * Accepted.
 */

/**
 * @param {number[]} nums
 * @param {number} k
 * @return {void} Do not return anything, modify nums in-place instead.
 */
let rotate = function (nums, k) {
    k %= nums.length;
    reverse(nums, 0, nums.length - 1);
    reverse(nums, 0, k - 1);
    reverse(nums, k, nums.length - 1);
};

let reverse = function (nums, start, end) {
    while (start < end) {
        let temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--;
    }
};

let array0 = [1];
rotate(array0, 1);
if (array0.toString() === [1].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

let array1 = [1, 2];
rotate(array1, 1);
if (array1.toString() === [2, 1].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

let array2 = [1, 2, 3, 4, 5, 6, 7];
rotate(array2, 3);
if (array2.toString() === [5, 6, 7, 1, 2, 3, 4].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}
