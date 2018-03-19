/**
 * Divide two integers without using multiplication, division and mod operator.
 *
 * If it is overflow, return MAX_INT.
 *
 * Accepted.
 */


/**
 * @param {number} dividend
 * @param {number} divisor
 * @return {number}
 */
let divide = function (dividend, divisor) {
    let sym = dividend * divisor < 0 ? -1 : 1;
    dividend = Math.abs(dividend);
    divisor = Math.abs(divisor);
    let tmp, result = 0;

    while (dividend >= divisor) {
        tmp = 1;
        while (divisor * tmp <= dividend) {
            tmp *= 2;
        }
        dividend = dividend - divisor * parseInt(tmp / 2);
        result += parseInt(tmp / 2);
    }
    if (-1 === sym) {
        return sym * (result <= 2147483648 ? result : 2147483648);
    }
    return result <= 2147483647 ? result : 2147483647;
};


const INT_MIN_VALUE = -2147483648;
const INT_MAX_VALUE = 2147483647;

if (divide(1, 1) === 1) {
    console.log("pass")
} else {
    console.error("failed")
}

if (divide(0, 1) === 0) {
    console.log("pass")
} else {
    console.error("failed")
}

if (divide(-1, -1) === 1) {
    console.log("pass")
} else {
    console.error("failed")
}

if (divide(INT_MAX_VALUE, 1) === 2147483647) {
    console.log("pass")
} else {
    console.error("failed")
}

if (divide(INT_MAX_VALUE, INT_MIN_VALUE) === 0) {
    console.log("pass")
} else {
    console.error("failed")
}

if (divide(INT_MIN_VALUE, -1) === 2147483647) {
    console.log("pass")
} else {
    console.error("failed")
}

if (divide(100, 6) === 16) {
    console.log("pass")
} else {
    console.error("failed")
}