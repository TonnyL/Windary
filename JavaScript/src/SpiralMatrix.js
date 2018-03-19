/**
 * Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
 *
 * For example,
 * Given the following matrix:
 *
 * [
 * [ 1, 2, 3 ],
 * [ 4, 5, 6 ],
 * [ 7, 8, 9 ]
 * ]
 * You should return [1,2,3,6,9,8,7,4,5].
 *
 * Accepted.
 */

/**
 * @param {number[][]} matrix
 * @return {number[]}
 */
let spiralOrder = function (matrix) {
    if (matrix.length === 0 || matrix[0].length === 0) {
        return [];
    }

    let result = [];
    let added = new Array(matrix.length);
    for (let i = 0; i < matrix.length; i++) {
        added[i] = new Array(matrix[0].length);
        for (let j = 0; j < matrix[0].length; j++) {
            added[i][j] = false;
        }
    }

    if (matrix.length === 1) {
        matrix[0].forEach(function (i) {
            result.push(i);
        });
        return result;
    }

    if (matrix[0].length === 1) {
        matrix.forEach(function (ints) {
            result.push(ints[0]);
        });
        return result;
    }

    let centerX = matrix.length % 2 === 0 ? parseInt((matrix.length - 1) / 2) : parseInt(matrix.length / 2);
    let centerY = matrix[0].length % 2 === 0 ? parseInt((matrix[0].length - 1) / 2) : parseInt(matrix[0].length / 2);
    let i = 0, j = 0, depth = 0;

    while (i <= centerX && j <= centerY && depth <= centerX && depth <= centerY) {
        for (j = depth, i = depth; j < matrix[0].length - depth; j++) {
            if (!added[i][j]) {
                result.push(matrix[i][j]);
                added[i][j] = true;
            }
        }

        for (j--, i++; i < matrix.length - depth; i++) {
            if (!added[i][j]) {
                result.push(matrix[i][j]);
                added[i][j] = true;
            }
        }

        for (i--, j--; j >= depth; j--) {
            if (!added[i][j]) {
                result.push(matrix[i][j]);
                added[i][j] = true;
            }
        }

        for (j++, i--; i > depth; i--) {
            if (!added[i][j]) {
                result.push(matrix[i][j]);
                added[i][j] = true;
            }
        }

        depth++;
    }
    return result;
};


if (spiralOrder([]).toString() === [].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

if (spiralOrder([[1], [2], [3]]).toString() === [1, 2, 3].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

if (spiralOrder([[1, 2, 3]]).toString() === [1, 2, 3].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

if (spiralOrder([[1, 2, 3, 4, 5, 6, 7, 8, 9, 10], [11, 12, 13, 14, 15, 16, 17, 18, 19, 20]]).toString() === [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

if (spiralOrder([[1, 2], [3, 4]]).toString() === [1, 2, 4, 3].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

if (spiralOrder([[1, 2], [3, 4], [5, 6]]).toString() === [1, 2, 4, 6, 5, 3].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

if (spiralOrder([[1, 2, 3], [4, 5, 6], [7, 8, 9]]).toString() === [1, 2, 3, 6, 9, 8, 7, 4, 5].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

if (spiralOrder([[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]]).toString() === [1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}
    