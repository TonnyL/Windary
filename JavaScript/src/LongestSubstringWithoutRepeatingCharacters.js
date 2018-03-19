/**
 * Given a string, find the length of the longest substring without repeating characters.
 * Examples:
 *
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * Given "bbbbb", the answer is "b", with the length of 1.
 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 *
 * Result: Accepted
 */


/**
 * @param {string} s
 * @return {number}
 */
let lengthOfLongestSubstring = function (s) {
    if (s.length === 0) {
        return 0;
    }

    let result = "";
    let tmp = "";
    let inputChars = s.split('');

    for (let i = 0; i < inputChars.length; i++) {
        for (let j = 0; j < tmp.length; j++) {
            if (inputChars[i] === (tmp[j])) {
                tmp = tmp.slice(j + 1, tmp.length);
                break;
            }
        }

        tmp += inputChars[i].toString();

        if (tmp.length > result.length) {
            result = tmp
        }
    }

    return result.length
};


if (lengthOfLongestSubstring("pwwkew") === 3) {
    console.log("pass")
} else {
    console.error("failed")
}

if (lengthOfLongestSubstring("bbbbbb") === 1) {
    console.log("pass")
} else {
    console.error("failed")
}

if (lengthOfLongestSubstring("abcabcbb") === 3) {
    console.log("pass")
} else {
    console.error("failed")
}

if (lengthOfLongestSubstring("dvdf") === 3) {
    console.log("pass")
} else {
    console.error("failed")
}