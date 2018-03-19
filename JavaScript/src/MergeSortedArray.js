/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 *
 * Note:
 *
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
 *
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 *
 * Accepted.
 */

/**
 * @param {number[]} nums1
 * @param {number} m
 * @param {number[]} nums2
 * @param {number} n
 * @return {void} Do not return anything, modify nums1 in-place instead.
 */
let merge = function (nums1, m, nums2, n) {
    while (n > 0) {
        if (m <= 0 || nums1[m - 1] <= nums2[n - 1]) {
            nums1[m + n - 1] = nums2[n - 1];
            n--;
        } else {
            nums1[m + n - 1] = nums1[m - 1];
            m--;
        }
    }
};


let array0 = [1];
merge(array0, 1, [], 0);
if (array0.toString() === [1].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

let array1 = [0];
merge(array1, 0, [1], 1);
if (array1.toString() === [1].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

let array2 = [4, 5, 6, 0, 0, 0];
merge(array2, 3, [1, 2, 3], 3);
if (array2.toString() === [1, 2, 3, 4, 5, 6].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

let array3 = [0, 0, 0, 1, 2, 3, -1, -1, -1];
merge(array3, 6, [0, 4], 2);
if (array3.toString() === [0, 0, 0, 0, 1, 2, 3, 4, -1].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

let array4 = [0, 1, 2, 3, 0, 0, 0, 0, 0];
merge(array4, 4, [3, 4, 0], 2);
if (array4.toString() === [0, 1, 2, 3, 3, 4, 0, 0, 0].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

let array5 = [1, 2, 0, 0];
merge(array5, 2, [1], 1);
if (array5.toString() === [1, 1, 2, 0].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

let array6 = [1, 2, 3, 0, 0, 0];
merge(array6, 3, [2, 5, 6], 3);
if (array6.toString() === [1, 2, 2, 3, 5, 6].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}