/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows
 * like this: (you may want to display this pattern in a fixed font for better legibility)
 *
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 * Write the code that will take a string and make this conversion given a number of rows:
 *
 * string convert(string text, int nRows);
 * convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 *
 * Accepted.
 */


/**
 * @param {string} s
 * @param {number} numRows
 * @return {string}
 */
let convert = function (s, numRows) {
    if (s == null || s.length < 2 || numRows <= 1) {
        return s;
    }

    let builder = "";
    for (let i = 0; i < numRows; i++) {
        for (let j = 0, index = i; index < s.length; j++, index = (2 * numRows - 2) * j + i) {
            builder = builder.concat(s.charAt(index));
            if (i !== 0 && i !== numRows - 1 && index + (numRows - i - 1) * 2 < s.length) {
                builder = builder.concat(s.charAt(index + (numRows - i - 1) * 2));
            }
        }
    }

    return builder;
};


if (convert("0123456789", 1) === "0123456789") {
    console.log("pass")
} else {
    console.error("failed")
}

if (convert("PAYPALISHIRING", 3) === "PAHNAPLSIIGYIR") {
    console.log("pass")
} else {
    console.error("failed")
}

if (convert("0123456789", 2) === "0246813579") {
    console.log("pass")
} else {
    console.error("failed")
}

if (convert("0123456789", 3) === "0481357926") {
    console.log("pass")
} else {
    console.error("failed")
}