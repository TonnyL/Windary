/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 *
 * Accepted.
 */


/**
 * @param {string} s
 * @return {boolean}
 */
let isValid = function (s) {
    if (s == null || s.length === 0 || s.length === 1) {
        return false;
    }

    let list = [];
    s.split('').forEach(function (c) {
        if (list.length !== 0 && ((c === ")" && list[list.length - 1] === "(")
                || (c === "]" && list[list.length - 1] === "[")
                || (c === "}" && list[list.length - 1] === "{"))) {
            list.splice(list.length - 1, 1);
        } else {
            list.push(c);
        }
    });

    // console.log(list);

    return list.length === 0;
};


if (isValid("()")) {
    console.log("pass")
} else {
    console.error("failed")
}

if (isValid("()[]{}")) {
    console.log("pass")
} else {
    console.error("failed")
}

if (!isValid("(")) {
    console.log("pass")
} else {
    console.error("failed")
}

if (!isValid("(]")) {
    console.log("pass")
} else {
    console.error("failed")
}

if (!isValid("([)]")) {
    console.log("pass")
} else {
    console.error("failed")
}