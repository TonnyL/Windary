/**
 * Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2.
 *
 * Note:
 *
 * The length of both num1 and num2 is < 110.
 * Both num1 and num2 contains only digits 0-9.
 * Both num1 and num2 does not contain any leading zero.
 * You must not use any built-in BigInteger library or convert the inputs to integer directly.
 *
 * Accepted.
 */


/**
 * @param {string} num1
 * @param {string} num2
 * @return {string}
 */
let multiply = function (num1, num2) {
    let ints = new Array(num1.length + num2.length + 1);
    for (let i = 0; i < ints.length; i++) {
        ints[i] = 0;
    }

    for (let i = 0; i < num1.length; i++) {
        for (let j = 0; j < num2.length; j++) {
            ints[(num1.length - i - 1) + (num2.length - j - 1)] += (num1[i].charCodeAt(0) - '0'.charCodeAt(0)) * (num2[j].charCodeAt(0) - '0'.charCodeAt(0))
        }
    }

    let res = [];
    for (let m = 0; m < num1.length + num2.length; m++) {
        let digit = ints[m] % 10;
        let carry = parseInt(ints[m] / 10);
        res.splice(0, 0, digit.toString());
        if (m < (num1.length + num2.length - 1)) {
            ints[m + 1] += carry
        }
    }

    while (res.length > 0 && res[0] === "0") {
        res.splice(0, 1)
    }

    if (res.length === 0) {
        return "0"
    }

    return res.join('');
};


if (multiply("", "") === "0") {
    console.log("pass")
} else {
    console.error("failed")
}

if (multiply("0", "0") === "0") {
    console.log("pass")
} else {
    console.error("failed")
}

if (multiply("100", "1") === "100") {
    console.log("pass")
} else {
    console.error("failed")
}

if (multiply("123", "45") === "5535") {
    console.log("pass")
} else {
    console.error("failed")
}

if (multiply("99", "99") === "9801") {
    console.log("pass")
} else {
    console.error("failed")
}

if (multiply("123", "123") === "15129") {
    console.log("pass")
} else {
    console.error("failed")
}

if (multiply("123456789", "123456789") === "15241578750190521") {
    console.log("pass")
} else {
    console.error("failed")
}