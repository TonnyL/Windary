/**
 * Follow up for "Unique Paths":
 * Now consider if some obstacles are added to the grids. How many unique paths would there be?
 * An obstacle and empty space is marked as 1 and 0 respectively in the grid.
 *
 * For example,
 * There is one obstacle in the middle of a 3x3 grid as illustrated below.
 *
 * [
 * [0,0,0],
 * [0,1,0],
 * [0,0,0]
 * ]
 *
 * The total number of unique paths is 2.
 *
 * Note: m and n will be at most 100.
 *
 * Accepted.
 */


/**
 * @param {number[][]} obstacleGrid
 * @return {number}
 */
let uniquePathsWithObstacles = function (obstacleGrid) {
    if (obstacleGrid[0][0] === 1) {
        return 0;
    }
    if (obstacleGrid.length === 1) {
        for (let i = 0; i < obstacleGrid[0].length; i++) {
            if (obstacleGrid[0][i] === 1) {
                return 0;
            }
        }
        return 1;
    }

    let matrix = new Array(obstacleGrid.length);
    for (let i = 0; i < matrix.length; i++) {
        matrix[i] = new Array(obstacleGrid[0].length);
        for (let j = 0; j < obstacleGrid[0].length; j++) {
            matrix[i][j] = 0;
        }
    }

    for (let i = 0; i < obstacleGrid.length; i++) {
        if (obstacleGrid[i][0] === 1) {
            for (let j = i; j < obstacleGrid.length; j++) {
                matrix[j][0] = 0;
            }
            break;
        } else {
            matrix[i][0] = 1;
        }
    }

    for (let i = 0; i < obstacleGrid[0].length; i++) {
        if (obstacleGrid[0][i] === 1) {
            for (let j = i; j < obstacleGrid[0].length; j++) {
                matrix[0][i] = 0;
            }
            break;
        } else {
            matrix[0][i] = 1;
        }
    }

    for (let i = 1; i < matrix.length; i++) {
        for (let j = 1; j < matrix[0].length; j++) {
            matrix[i][j] = obstacleGrid[i][j] === 1 ? 0 : (matrix[i - 1][j] + matrix[i][j - 1])
        }
    }

    return matrix[matrix.length - 1][matrix[0].length - 1];
};


if (uniquePathsWithObstacles([[0, 0, 0]]) === 1) {
    console.log("pass")
} else {
    console.error("failed")
}

if (uniquePathsWithObstacles([[0, 1, 0]]) === 0) {
    console.log("pass")
} else {
    console.error("failed")
}

if (uniquePathsWithObstacles([[1], [0]]) === 0) {
    console.log("pass")
} else {
    console.error("failed")
}

if (uniquePathsWithObstacles([[0], [1]]) === 0) {
    console.log("pass")
} else {
    console.error("failed")
}

if (uniquePathsWithObstacles([[0, 0], [1, 1], [0, 0]]) === 0) {
    console.log("pass")
} else {
    console.error("failed")
}

if (uniquePathsWithObstacles([[0], [0]]) === 1) {
    console.log("pass")
} else {
    console.error("failed")
}
// The matrix:
// 1 1 1
// 1 0 1
// 1 1 2
if (uniquePathsWithObstacles([[0, 0, 0], [0, 1, 0], [0, 0, 0]]) === 2) {
    console.log("pass")
} else {
    console.error("failed")
}
// 1 1 1 1
// 1 0 1 2
// 1 1 2 4
// 1 2 4 8
if (uniquePathsWithObstacles([[0, 0, 0, 0], [0, 1, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]]) === 8) {
    console.log("pass")
} else {
    console.error("failed")
}