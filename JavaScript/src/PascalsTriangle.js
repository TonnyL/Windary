/**
 * Given numRows, generate the first numRows of Pascal's triangle.
 *
 * For example, given numRows = 5,
 * Return
 *
 * [
 * [1],
 * [1,1],
 * [1,2,1],
 * [1,3,3,1],
 * [1,4,6,4,1]
 * ]
 *
 * Accepted.
 */

/**
 * @param {number} numRows
 * @return {number[][]}
 */
let generate = function (numRows) {
    let results = [];
    if (numRows === 0) {
        return results;
    }
    if (numRows === 1) {
        results.push([1]);
        return results;
    }
    if (numRows === 2) {
        results.push([1]);
        results.push([1, 1]);
        return results;
    }
    let tmp = generate(numRows - 1);
    let list = [];

    let last = tmp[tmp.length - 1];
    list.push(1);
    for (let i = 1; i < last.length; i++) {
        list.push(last[i - 1] + last[i]);
    }
    list.push(1);
    tmp.push(list);

    return tmp;
};

let lists = [];
if (generate(0).toString() === lists.toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

lists.push([1]);
if (generate(1).toString() === lists.toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

lists.push([1, 1]);
if (generate(2).toString() === lists.toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

lists.push([1, 2, 1]);
if (generate(3).toString() === lists.toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

lists.push([1, 3, 3, 1]);
if (generate(4).toString() === lists.toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

lists.push([1, 4, 6, 4, 1]);
if (generate(5).toString() === lists.toString()) {
    console.log("pass")
} else {
    console.error("failed")
}