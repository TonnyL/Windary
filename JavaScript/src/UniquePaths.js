/**
 * matrix robot is located at the top-left corner of matrix m x n grid (marked 'Start' in the diagram below).
 * The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right
 * corner of the grid (marked 'Finish' in the diagram below).
 * How many possible unique paths are there?
 *
 * Note: m and n will be at most 100.
 *
 * Accepted.
 */

/**
 * @param {number} m
 * @param {number} n
 * @return {number}
 */
let uniquePaths = function (m, n) {
    if (m === 1 || n === 1) {
        return 1;
    }

    let matrix = new Array(m);
    for (let i = 0; i < m; i++) {
        matrix[i] = new Array(n);
        for (let j = 0; j < n; j++) {
            matrix[i][j] = 0;
        }
    }
    for (let i = 0; i < m; i++) {
        matrix[i][0] = 1;
    }
    for (let i = 0; i < n; i++) {
        matrix[0][i] = 1;
    }
    for (let i = 1; i < m; i++) {
        for (let j = 1; j < n; j++) {
            matrix[i][j] = matrix[i - 1][j] + matrix[i][j - 1];
        }
    }

    return matrix[m - 1][n - 1];
};

if (uniquePaths(1, 1) === 1) {
    console.log("pass")
} else {
    console.error("failed")
}
if (uniquePaths(1, 2) === 1) {
    console.log("pass")
} else {
    console.error("failed")
}
// The matrix:
// 1 1
// 1 2(result)
if (uniquePaths(2, 2) === 2) {
    console.log("pass")
} else {
    console.error("failed")
}
// The matrix:
// 1 1 1 1
// 1 2 3 4
// 1 3 6 10
// 1 4 10 20(result)
if (uniquePaths(4, 4) === 20) {
    console.log("pass")
} else {
    console.error("failed")
}