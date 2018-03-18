/**
 * Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in place.
 *
 * Accepted.
 */

/**
 * @param {number[][]} matrix
 * @return {void} Do not return anything, modify matrix in-place instead.
 */
let setZeroes = function (matrix) {
    if (matrix.length === 0 || matrix[0].length === 0) {
        return;
    }

    let row = new Set();
    let column = new Set();
    for (let i = 0; i < matrix.length; i++) {
        for (let j = 0; j < matrix[0].length; j++) {
            if (matrix[i][j] === 0) {
                row.add(i);
                column.add(j);
            }
        }
    }

    row.forEach(function (i) {
        for (let k = 0; k < matrix[0].length; k++) {
            matrix[i][k] = 0;
        }
    });

    column.forEach(function (i) {
        for (let k = 0; k < matrix.length; k++) {
            matrix[k][i] = 0;
        }
    });

    // console.log(matrix);
};


let array0 = [];
setZeroes(array0);
if (array0.toString() === [].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

let array1 = [[0, 1]];
setZeroes(array1);
if (array1.toString() === [[0, 0]].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

let array2 = [[1, 0, 2], [3, 4, 5], [6, 7, 8]];
setZeroes(array2);
if (array2.toString() === [[0, 0, 0], [3, 0, 5], [6, 0, 8]].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

let array3 = [[0, 1, 1], [2, 0, 2], [3, 3, 0]];
setZeroes(array3);
if (array3.toString() === [[0, 0, 0], [0, 0, 0], [0, 0, 0]].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

let array4 = [[0, 0, 0, 5], [4, 3, 1, 4], [0, 1, 1, 4], [1, 2, 1, 3], [0, 0, 1, 1]];
setZeroes(array4);
if (array4.toString() === [[0, 0, 0, 0], [0, 0, 0, 4], [0, 0, 0, 0], [0, 0, 0, 3], [0, 0, 0, 0]].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}