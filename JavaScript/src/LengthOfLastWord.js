/**
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 * If the last word does not exist, return 0.
 * Note: A word is defined as a character sequence consists of non-space characters only.
 * For example,
 * Given s = "Hello World",
 * return 5.
 *
 * Accepted.
 */


/**
 * @param {string} s
 * @return {number}
 */
let lengthOfLastWord = function (s) {
    if (s === null || s.length === 0) {
        return 0;
    }

    let strs = s.split(new RegExp(" ")).filter(function (it) {
        return it.length !== 0
    });
    if (strs.length === 0) {
        return 0;
    }

    return strs[strs.length - 1].length;
};


if (lengthOfLastWord("Hello World") === 5) {
    console.log("pass")
} else {
    console.error("failed")
}

if (lengthOfLastWord(" ") === 0) {
    console.log("pass")
} else {
    console.error("failed")
}

if (lengthOfLastWord("a") === 1) {
    console.log("pass")
} else {
    console.error("failed")
}

if (lengthOfLastWord("a ") === 1) {
    console.log("pass")
} else {
    console.error("failed")
}