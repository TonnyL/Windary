/**
 * The gray code is a binary numeral system where two successive values differ in only one bit.
 * Given a non-negative integer n representing the total number of bits in the code, print the sequence of gray code. A gray code sequence must begin with 0.
 * For example, given n = 2, return [0,1,3,2]. Its gray code sequence is:
 *
 * 00 - 0
 * 01 - 1
 * 11 - 3
 * 10 - 2
 *
 * Note:
 * For a given n, a gray code sequence is not uniquely defined.
 * For example, [0,2,3,1] is also a valid gray code sequence according to the above definition.
 * For now, the judge is able to judge based on one instance of gray code sequence. Sorry about that.
 *
 * Accepted.
 */


/**
 * @param {number} n
 * @return {number[]}
 */
let grayCode = function (n) {
    let resultList = new Array(0);

    if (n <= 0) {
        resultList.push(0);
        return resultList;
    }

    if (n === 1) {
        resultList.push(0, 1);
        return resultList;
    }

    resultList = grayCode(n - 1);
    for (let i = resultList.length - 1; i >= 0; i--) {
        resultList.push(resultList[i] + Math.trunc(Math.pow(2, n - 1)));
    }

    return resultList;
};


if (grayCode(0).toString() === [0].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

if (grayCode(2).toString() === [0, 1, 3, 2].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

if (grayCode(3).toString() === [0, 1, 3, 2, 6, 7, 5, 4].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}