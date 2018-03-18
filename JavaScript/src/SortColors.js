/**
 * Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.
 *
 * Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
 *
 * Note:
 * You are not suppose to use the library's sort function for this problem.
 *
 * Follow up:
 * A rather straight forward solution is a two-pass algorithm using counting sort.
 * First, iterate the array counting number of 0's, 1's, and 2's, then overwrite array with total number of 0's, then 1's and followed by 2's.
 *
 * Could you come up with an one-pass algorithm using only constant space?
 *
 * Accepted.
 */

/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
let sortColors = function (nums) {
    for (let k = 0, i = 0, j = 0; k < nums.length; k++) {
        let tmp = nums[k];
        nums[k] = 2;
        if (tmp < 2) {
            nums[j] = 1;
            j++;
        }

        if (tmp === 0) {
            nums[i] = 0;
            i++;
        }
    }

    // console.log(nums);
};


let array0 = [];
sortColors(array0);
if (array0.toString() === [].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

let array1 = [0];
sortColors(array1);
if (array1.toString() === [0].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

let array2 = [2, 1, 0];
sortColors(array2);
if (array2.toString() === [0, 1, 2].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

let array3 = [0, 1, 0, 1, 1, 1, 2, 0, 1];
sortColors(array3);
if (array3.toString() === [0, 0, 0, 1, 1, 1, 1, 1, 2].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

let array4 = [0, 1, 2, 0, 1];
sortColors(array4);
if (array4.toString() === [0, 0, 1, 1, 2].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

let array5 = [2, 2, 2, 2, 1, 0, 2, 0, 1];
sortColors(array5);
if (array5.toString() === [0, 0, 1, 1, 2, 2, 2, 2, 2].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

let array6 = [0, 0, 1, 1, 1, 2, 2, 2];
sortColors(array6);
if (array6.toString() === [0, 0, 1, 1, 1, 2, 2, 2].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

let array7 = [0, 0, 0, 2, 2, 2, 1, 1, 1];
sortColors(array7);
if (array7.toString() === [0, 0, 0, 1, 1, 1, 2, 2, 2].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}