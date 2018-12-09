/**
 * Given a matrix A, return the transpose of A.
 * <p>
 * The transpose of a matrix is the matrix flipped over it's main diagonal, switching the row and column indices of the matrix.
 * <p>
 * Example 1:
 * <p>
 * Input: [[1,2,3],[4,5,6],[7,8,9]]
 * Output: [[1,4,7],[2,5,8],[3,6,9]]
 * Example 2:
 * <p>
 * Input: [[1,2,3],[4,5,6]]
 * Output: [[1,4],[2,5],[3,6]]
 * <p>
 * Note:
 * <p>
 * 1 <= A.length <= 1000
 * 1 <= A[0].length <= 1000
 * <p>
 * Result: Accepted.
 */

/**
 * @param {number[][]} A
 * @return {number[][]}
 */
let transpose = function (A) {
    let tmp = new Array(A[0].length);
    for (let i = 0; i < tmp.length; i++) {
        tmp[i] = new Array(A.length);
    }

    for (let i = 0; i < A[0].length; i++) {
        for (let j = 0; j < A.length; j++) {
            tmp[i][j] = A[j][i];
        }
    }

    return tmp;
};

if (transpose([[1, 1]]).toString() === [[1], [1]].toString()) {
    console.log("pass");
} else {
    console.error("failed");
}

if (transpose([[1], [1]]).toString() === [[1, 1]].toString()) {
    console.log("pass");
} else {
    console.error("failed");
}

if (transpose([[1, 2, 3], [4, 5, 6], [7, 8, 9]]).toString() === [[1, 4, 7], [2, 5, 8], [3, 6, 9]].toString()) {
    console.log("pass");
} else {
    console.error("failed");
}

if (transpose([[1, 2, 3], [4, 5, 6]]).toString() === [[1, 4], [2, 5], [3, 6]].toString()) {
    console.log("pass");
} else {
    console.error("failed");
}