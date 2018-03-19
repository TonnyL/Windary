/**
 * Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.
 *
 * For example,
 * Given n = 3,
 *
 * You should return the following matrix:
 * [
 * [ 1, 2, 3 ],
 * [ 8, 9, 4 ],
 * [ 7, 6, 5 ]
 * ]
 *
 * Accepted.
 */


/**
 * @param {number} n
 * @return {number[][]}
 */
let generateMatrix = function (n) {
    if (n <= 0) {
        return [];
    }
    if (n === 1) {
        return [[1]];
    }

    let matrix = new Array(n);
    for (let i = 0; i < n; i++) {
        matrix[i] = new Array(n);
        for (let j = 0; j < n; j++) {
            matrix[i][j] = 0;
        }
    }

    let centerX = n % 2 === 0 ? parseInt((n - 1) / 2) : parseInt(n / 2);
    let centerY = n % 2 === 0 ? parseInt((n - 1) / 2) : parseInt(n / 2);
    let i = 0, j = 0, depth = 0, result = 1;

    while (i <= centerX && j <= centerY && depth <= centerX && depth <= centerY) {
        for (j = depth, i = depth; j < matrix[0].length - depth; j++) {
            if (matrix[i][j] === 0) {
                matrix[i][j] = result++;
            }
        }

        for (j--, i++; i < matrix.length - depth; i++) {
            if (matrix[i][j] === 0) {
                matrix[i][j] = result++;
            }
        }

        for (i--, j--; j >= depth; j--) {
            if (matrix[i][j] === 0) {
                matrix[i][j] = result++;
            }
        }

        for (j++, i--; i > depth; i--) {
            if (matrix[i][j] === 0) {
                matrix[i][j] = result++;
            }
        }

        depth++;
    }

    return matrix;
};


if (generateMatrix(0).toString() === [].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

if (generateMatrix(1).toString() === [[1]].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

if (generateMatrix(2).toString() === [[1, 2], [4, 3]].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

if (generateMatrix(4).toString() === [[1, 2, 3, 4], [12, 13, 14, 5], [11, 16, 15, 6], [10, 9, 8, 7]].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}