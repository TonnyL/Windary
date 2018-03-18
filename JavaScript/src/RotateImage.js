/**
 * You are given an n x n 2D matrix representing an image.
 *
 * Rotate the image by 90 degrees (clockwise).
 *
 * Note:
 * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
 *
 * Example 1:
 *
 * Given input matrix =
 * [
 * [1,2,3],
 * [4,5,6],
 * [7,8,9]
 * ],
 *
 * rotate the input matrix in-place such that it becomes:
 * [
 * [7,4,1],
 * [8,5,2],
 * [9,6,3]
 * ]
 * Example 2:
 *
 * Given input matrix =
 * [
 * [ 5, 1, 9,11],
 * [ 2, 4, 8,10],
 * [13, 3, 6, 7],
 * [15,14,12,16]
 * ],
 *
 * rotate the input matrix in-place such that it becomes:
 * [
 * [15,13, 2, 5],
 * [14, 3, 4, 1],
 * [12, 6, 8, 9],
 * [16, 7,10,11]
 * ]
 *
 * Accepted.
 */


/**
 * @param {number[][]} matrix
 * @return {void} Do not return anything, modify matrix in-place instead.
 */
let rotate = function (matrix) {
    // Reverse
    for (let i = 0; i < parseInt(matrix.length / 2); i++) {
        let j = matrix.length - 1 - i;
        let cache = matrix[i];
        matrix[i] = matrix[j];
        matrix[j] = cache;
    }
    // Transpose
    for (let i = 0; i < matrix.length; i++) {
        for (let j = i + 1; j < matrix.length; j++) {
            let cache = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = cache;
        }
    }
};


let ints1 = [[1, 2, 3], [4, 5, 6], [7, 8, 9]];
rotate(ints1);
if (ints1.toString() === [[7, 4, 1], [8, 5, 2], [9, 6, 3]].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

let ints2 = [[5, 1, 9, 11], [2, 4, 8, 10], [13, 3, 6, 7], [15, 14, 12, 16]];
rotate(ints2);
if (ints2.toString() === [[15, 13, 2, 5], [14, 3, 4, 1], [12, 6, 8, 9], [16, 7, 10, 11]].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}