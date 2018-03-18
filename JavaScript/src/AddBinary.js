/**
 * Given two binary strings, return their sum (also a binary string).
 *
 * For example,
 * a = "11"
 * b = "1"
 * Return "100".
 *
 * Accepted.
 */


/**
 * @param {string} a
 * @param {string} b
 * @return {string}
 */
let addBinary = function (a, b) {
    if (a == null || b == null) {
        return "";
    }
    if (a.length === 0) {
        return b;
    }
    if (b.length === 0) {
        return a;
    }

    let flag = false; // if it needs to plus one

    let longer = a.length >= b.length ? a : b;
    let shorter = a.length < b.length ? a : b;

    let builder = "";

    for (let i = longer.length - 1, j = shorter.length - 1; i >= 0; i--, j--) {
        if (j < 0) {
            if (longer.charAt(i) === "1") {
                if (flag) {
                    builder = builder.concat("0");
                } else {
                    builder = builder.concat("1");
                }
            } else { // l == "0"
                if (flag) {
                    builder = builder.concat("1");
                    flag = false;
                } else {
                    builder = builder.concat("0");
                }
            }
        } else {
            if ((longer.charAt(i) === "1" && shorter.charAt(j) === "1")) {
                if (flag) {
                    builder = builder.concat("1");
                } else {
                    builder = builder.concat("0");
                }
                flag = true;
            } else if (longer.charAt(i) === "0" && shorter.charAt(j) === "0") {
                if (flag) {
                    builder = builder.concat("1");
                } else {
                    builder = builder.concat("0");
                }
                flag = false;
            } else { // (l == "1" && s == "0") || (l == "0" && s == "1")
                if (flag) {
                    builder = builder.concat("0");
                    flag = true;
                } else {
                    builder = builder.concat("1");
                }
            }
        }

    }
    if (flag) {
        builder = builder.concat("1");
    }

    return builder.split('').reverse().join('');
};


if (addBinary("0", "0") === "0") {
    console.log("pass")
} else {
    console.error("failed")
}

if (addBinary("11", "1") === "100") {
    console.log("pass")
} else {
    console.error("failed")
}

if (addBinary("101", "101") === "1010") {
    console.log("pass")
} else {
    console.error("failed")
}