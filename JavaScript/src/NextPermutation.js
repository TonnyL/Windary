/**
 * Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.
 *
 * If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).
 *
 * The replacement must be in-place, do not allocate extra memory.
 *
 * Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.
 * 1,2,3 → 1,3,2
 * 3,2,1 → 1,2,3
 * 1,1,5 → 1,5,1
 *
 * Accepted.
 */


/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
let nextPermutation = function (nums) {
    let i = nums.length - 2;
    while (i >= 0 && nums[i] >= nums[i + 1]) {
        i--;
    }
    if (i >= 0) {
        let j = nums.length - 1;
        while (nums[j] <= nums[i]) {
            j--;
        }
        swap(nums, i, j);
    }
    reverse(nums, i + 1, nums.length - 1);
};

let swap = function (nums, i, j) {
    let tmp = nums[i];
    nums[i] = nums[j];
    nums[j] = tmp;
};

let reverse = function (nums, i, j) {
    while (i < j) {
        swap(nums, i++, j--);
    }
};


let array123 = [1, 2, 3];
nextPermutation(array123);
if (array123.toString() === [1, 3, 2].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

let array321 = [3, 2, 1];
nextPermutation(array321);
if (array321.toString() === [1, 2, 3].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

let array115 = [1, 1, 5];
nextPermutation(array115);
if (array115.toString() === [1, 5, 1].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}
