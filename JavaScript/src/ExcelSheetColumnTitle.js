/**
 * Given a positive integer, return its corresponding column title as appear in an Excel sheet.
 *
 * For example:
 *
 * 1 -> A
 * 2 -> B
 * 3 -> C
 * ...
 * 26 -> Z
 * 27 -> AA
 * 28 -> AB
 *
 * Accepted.
 */


/**
 * @param {number} n
 * @return {string}
 */
let convertToTitle = function (n) {
    let builder = "";

    while (n !== 0) {
        if (n % 26 === 0) {
            builder = builder.concat("Z");
            n -= 26;
        } else {
            builder = builder.concat(String.fromCharCode(n % 26 - 1 + 'A'.charCodeAt(0)));
            n -= n % 26;
        }
        n = parseInt(n / 26);
    }

    return builder.split("").reverse().join("");
};


if (convertToTitle(1) === "A") {
    console.log("pass")
} else {
    console.error("failed")
}

if (convertToTitle(2) === "B") {
    console.log("pass")
} else {
    console.error("failed")
}

if (convertToTitle(26) === "Z") {
    console.log("pass")
} else {
    console.error("failed")
}

if (convertToTitle(27) === "AA") {
    console.log("pass")
} else {
    console.error("failed")
}

if (convertToTitle(28) === "AB") {
    console.log("pass")
} else {
    console.error("failed")
}