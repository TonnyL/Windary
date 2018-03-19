/**
 * Given a string s, find the longest palindromic substring in s.
 * You may assume that the maximum length of s is 1000.
 *
 * Example:
 *
 * Input: "babad"
 *
 * Output: "bab"
 *
 * Note: "aba" is also a valid answer.
 * Example:
 *
 * Input: "cbbd"
 *
 * Output: "bb"
 *
 * Accepted.
 */


/**
 * @param {string} s
 * @return {string}
 */
let longestPalindrome = function (s) {
    if (s == null || s.length <= 1) {
        return s;
    }

    let maxLength = 0, startIndex = 0;
    for (let index = 0; index < s.length; index++) {
        let leftIndex = index;
        let rightIndex = index;
        while (leftIndex >= 0 && rightIndex < s.length && s.charAt(leftIndex) === s.charAt(rightIndex)) {
            let current = rightIndex - leftIndex + 1;
            if (current > maxLength) {
                maxLength = current;
                startIndex = leftIndex;
            }
            leftIndex--;
            rightIndex++;
        }

        leftIndex = index;
        rightIndex = index + 1;
        while (leftIndex >= 0 && rightIndex < s.length && s.charAt(leftIndex) === s.charAt(rightIndex)) {
            let current = rightIndex - leftIndex + 1;
            if (current > maxLength) {
                maxLength = current;
                startIndex = leftIndex;
            }
            leftIndex--;
            rightIndex++;
        }
    }

    return s.substring(startIndex, maxLength + startIndex);
};


let s = longestPalindrome("babad");
if (s === "bab" || s === "aba") {
    console.log("pass")
} else {
    console.error("failed")
}

if (longestPalindrome("cbbd") === "bb") {
    console.log("pass")
} else {
    console.error("failed")
}

if (longestPalindrome("babaddtattarrattatddetartrateedredividerb") === "ddtattarrattatdd") {
    console.log("pass")
} else {
    console.error("failed")
}