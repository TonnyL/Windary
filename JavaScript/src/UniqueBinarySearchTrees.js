/**
 * Given n, how many structurally unique BST's (binary search trees) that store values 1...n?
 *
 * For example,
 * Given n = 3, there are a total of 5 unique BST's.
 *
 * 1        3     3      2      1
 * \       /     /      / \      \
 * 3      2     1      1   3      2
 * /     /      \                 \
 * 2    1       2                 3
 *
 * Accepted.
 */

/**
 * Recursive solution. Time limit exceeded.
 *
 * @param {number} n
 * @return {number}
 */
/*let numTrees = function (n) {
    if (n === 0 || n === 1) {
        return 1;
    }
    let r = 0;
    for (let i = 1; i <= n; i++) {
        r = r + numTrees(i - 1) * numTrees(n - i);
    }
    return r;
};*/

/**
 * Dynamic programming. Accepted.
 *
 * @param {number} n
 * @return {number}
 */
let numTrees = function (n) {
    let array = new Int32Array(n + 2);
    array[0] = 1;
    array[1] = 1;

    for (let i = 2; i <= n; i++) {
        for (let j = 0; j < i; j++) {
            array[i] += array[j] * array[i - j - 1];
        }
    }

    return array[n];
};

if (numTrees(0) === 1) {
    console.log("pass")
} else {
    console.error("failed")
}

if (numTrees(1) === 1) {
    console.log("pass")
} else {
    console.error("failed")
}

if (numTrees(2) === 2) {
    console.log("pass")
} else {
    console.error("failed")
}

if (numTrees(3) === 5) {
    console.log("pass")
} else {
    console.error("failed")
}

if (numTrees(4) === 14) {
    console.log("pass")
} else {
    console.error("failed")
}
