/**
 * Given an index k, return the kth row of the Pascal's triangle.
 *
 * For example, given k = 3,
 * Return [1,3,3,1].
 *
 * Note:
 * Could you optimize your algorithm to use only O(k) extra space?
 *
 * Accepted.
 */

/**
 * @param {number} rowIndex
 * @return {number[]}
 */
let getRow = function (rowIndex) {
    let results = [];
    results.push(1);

    if (rowIndex === 0) {
        return results;
    }

    for (let i = 0; i < rowIndex; i++) {
        results.push(1);
        for (let j = results.length - 2; j > 0; j--) {
            results[j] = results[j - 1] + results[j];
        }
    }

    return results;
};


if (getRow(0).toString() === [1].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

if (getRow(1).toString() === [1, 1].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

if (getRow(2).toString() === [1, 2, 1].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

if (getRow(3).toString() === [1, 3, 3, 1].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

if (getRow(4).toString() === [1, 4, 6, 4, 1].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}