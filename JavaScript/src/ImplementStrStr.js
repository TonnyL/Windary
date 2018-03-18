/**
 * Implement strStr().
 * Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 * Accepted.
 */


/**
 * @param {string} haystack
 * @param {string} needle
 * @return {number}
 */
let strStr = function (haystack, needle) {
    if (haystack == null || needle == null || needle.length > haystack.length) {
        return -1;
    }
    if (haystack.length === 0 || needle.length === 0) {
        return 0;
    }

    for (let i = 0; i <= haystack.length - needle.length; i++) {
        if (haystack.substring(i, i + needle.length) === needle) {
            return i;
        }
    }

    return -1;
};


if (strStr("aaab", "b") === 3) {
    console.log("pass")
} else {
    console.error("failed")
}

if (strStr("", "") === 0) {
    console.log("pass")
} else {
    console.error("failed")
}

if (strStr("", "a") === -1) {
    console.log("pass")
} else {
    console.error("failed")
}

if (strStr("whats up", "s ") === 4) {
    console.log("pass")
} else {
    console.error("failed")
}