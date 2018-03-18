/**
 * Given an integer, convert it to a roman numeral.
 *
 * Input is guaranteed to be within the range from 1 to 3999.
 *
 * Accepted.
 */


/**
 * @param {number} num
 * @return {string}
 */
let intToRoman = function (num) {
    let builder = "";
    let roman = ['M', 'D', 'C', 'L', 'X', 'V', 'I'];
    let value = [1000, 500, 100, 50, 10, 5, 1];

    for (let n = 0; n < 7; n += 2) {
        let x = parseInt(num / value[n]);
        if (x < 4) {
            for (let i = 1; i <= x; i++) {
                builder = builder.concat(roman[n]);
            }
        } else if (x === 4) {
            builder = builder.concat(roman[n], roman[n - 1]);
        } else if (x < 9) {
            builder = builder.concat(roman[n - 1]);
            for (let i = 6; i <= x; i++) {
                builder = builder.concat(roman[n]);
            }
        } else if (x === 9) {
            builder = builder.concat(roman[n], roman[n - 2]);
        }
        num %= value[n];
    }
    return builder;
};


if (intToRoman(1).toString() === "I") {
    console.log("pass")
} else {
    console.error("failed")
}

if (intToRoman(621).toString() === "DCXXI") {
    console.log("pass")
} else {
    console.error("failed")
}

if (intToRoman(1996).toString() === "MCMXCVI") {
    console.log("pass")
} else {
    console.error("failed")
}

if (intToRoman(999).toString() === "CMXCIX") {
    console.log("pass")
} else {
    console.error("failed")
}