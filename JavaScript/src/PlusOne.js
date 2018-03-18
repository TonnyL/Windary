/**
 * Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.
 * You may assume the integer do not contain any leading zero, except the number 0 itself.
 * The digits are stored such that the most significant digit is at the head of the list.
 *
 * Accepted.
 */


/**
 * @param {number[]} digits
 * @return {number[]}
 */
let plusOne = function (digits) {
    let flag = false;
    digits[digits.length - 1]++;

    for (let i = digits.length - 1; i >= 0; i--) {
        if (flag) {
            digits[i]++;
        }
        if (digits[i] >= 10) {
            flag = true;
            digits[i] %= 10;
        } else {
            flag = false;
        }
    }

    if (flag) {
        digits.splice(0, 0, 1)
    }

    return digits;
};


if (plusOne([1]).toString() === [2].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

if (plusOne([9]).toString() === [1, 0].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

if (plusOne([9, 9]).toString() === [1, 0, 0].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

if (plusOne([2, 8, 9, 9, 9]).toString() === [2, 9, 0, 0, 0].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

if (plusOne([2, 8, 8, 9]).toString() === [2, 8, 9, 0].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}