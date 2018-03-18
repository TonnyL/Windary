/**
 * Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
 *
 * Integers in each row are sorted from left to right.
 * The first integer of each row is greater than the last integer of the previous row.
 * For example,
 *
 * Consider the following matrix:
 *
 * [
 * [1,   3,  5,  7],
 * [10, 11, 16, 20],
 * [23, 30, 34, 50]
 * ]
 * Given target = 3, return true.
 *
 * Accepted.
 */


/**
 * @param {number[][]} matrix
 * @param {number} target
 * @return {boolean}
 */
let searchMatrix = function (matrix, target) {
    if (matrix.length === 0 || matrix[0].length === 0) {
        return false;
    }

    for (let i = 0; i < matrix.length - 1; i++) {
        if (matrix[i][0] === target || matrix[i + 1][0] === target) {
            return true;
        } else if (matrix[i][0] < target && matrix[i + 1][0] > target) {
            return binarySearch(matrix[i], target, 0, matrix[0].length - 1) >= 0;
        }
    }

    return binarySearch(matrix[matrix.length - 1], target, 0, matrix[0].length - 1) >= 0;
};


/**
 * @param {number[]} array
 * @param {number} target
 * @param {number} low
 * @param {number} high
 */
let binarySearch = function (array, target, low, high) {
    while (low < high) {
        let mid = parseInt((low + high) / 2);
        if (array[mid] < target) {
            low = mid + 1
        } else {
            high = mid
        }
    }
    return array[low] === target ? low : -1;
};


if (!searchMatrix([], 0)) {
    console.log("pass")
} else {
    console.error("failed")
}

if (!searchMatrix([[]], 1)) {
    console.log("pass")
} else {
    console.error("failed")
}

if (searchMatrix([[1, 3, 5, 7], [10, 11, 16, 20], [23, 30, 34, 50]], 3)) {
    console.log("pass")
} else {
    console.error("failed")
}

if (searchMatrix([[1]], 1)) {
    console.log("pass")
} else {
    console.error("failed")
}