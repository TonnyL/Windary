/**
 * Implement atoi to convert a string to an integer.
 *
 * Hint: Carefully consider all possible input cases. If you want a challenge,
 * please do not see below and ask yourself what are the possible input cases.
 *
 * Notes: It is intended for this problem to be specified vaguely (ie, no given input specs).
 * You are responsible to gather all the input requirements up front.
 *
 * Accepted.
 */


/**
 * @param {string} str
 * @return {number}
 */
let myAtoi = function (str) {
    const INT_MAX_VALUE = 2147483647;
    const INT_MIN_VALUE = -2147483648;

    let s = str.trim();
    if (s.length === 0) {
        return 0;
    }
    if (s.length === 1) {
        return (s.charAt(0) <= '0' || s.charAt(0) >= '9') ? 0 : parseInt(s);
    }

    let plus = s.charAt(0) === '+';
    let minus = s.charAt(0) === '-';

    let result = 0, startIndex = plus || minus ? 1 : 0;
    for (let i = startIndex; i < s.length; i++) {
        if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            if (parseInt(INT_MAX_VALUE / 10) - (s.charAt(i) - '0') <= result) {
                if (minus && result * 10 + (s.charAt(i) - '0') === INT_MAX_VALUE) {
                    return -INT_MAX_VALUE;
                }
                return minus ? INT_MIN_VALUE : INT_MAX_VALUE;
            }
            result = result * 10 + (s.charAt(i) - '0');
        } else {
            return minus ? -result : result;
        }
    }

    return minus ? -result : result;
};


if (myAtoi("+-1") === 0) {
    console.log("pass")
} else {
    console.error("failed")
}

if (myAtoi("-00123a66") === -123) {
    console.log("pass")
} else {
    console.error("failed")
}

if (myAtoi("-1") === -1) {
    console.log("pass")
} else {
    console.error("failed")
}

if (myAtoi("    10522545459") === 2147483647) {
    console.log("pass")
} else {
    console.error("failed")
}

if (myAtoi("-2147483647") === -2147483647) {
    console.log("pass")
} else {
    console.error("failed")
}

if (myAtoi("2147483648") === 2147483647) {
    console.log("pass")
} else {
    console.error("failed")
}

if (myAtoi("-2147483649") === -2147483648) {
    console.log("pass")
} else {
    console.error("failed")
}

if (myAtoi("2147483647") === 2147483647) {
    console.log("pass")
} else {
    console.error("failed")
}