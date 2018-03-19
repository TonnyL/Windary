/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * Accepted.
 */

/**
 * @param {string[]} strs
 * @return {string}
 */
let longestCommonPrefix = function (strs) {
    if (strs == null || strs.length === 0) {
        return "";
    }

    if (strs.length === 1) {
        return strs[0];
    }

    for (let i = 0; i < strs[0].length; i++) {
        for (let j = 1; j < strs.length; j++) {
            if (i === strs[j].length || strs[0].charAt(i) !== strs[j].charAt(i)) {
                return strs[0].substring(0, i);
            }
        }
    }
    return strs[0];
};


if (longestCommonPrefix([]).length === 0) {
    console.log("pass")
} else {
    console.error("failed")
}

if (longestCommonPrefix(["abc"]) === "abc") {
    console.log("pass")
} else {
    console.error("failed")
}

if (longestCommonPrefix(["abcf", "abcd", "abcdefg"]) === "abc") {
    console.log("pass")
} else {
    console.error("failed")
}

if (longestCommonPrefix(["aa", "a"]) === "a") {
    console.log("pass")
} else {
    console.error("failed")
}