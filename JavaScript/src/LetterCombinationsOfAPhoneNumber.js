/**
 * Given a digit string, return all possible letter combinations that the number could represent.
 *
 * A mapping of digit to letters (just like on the telephone buttons) is given below.
 *
 * Input:Digit string "23"
 * Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 * Note:
 * Although the above answer is in lexicographical order, your answer could be in any order you want.
 *
 * Accepted.
 */


/**
 * @param {string} digits
 * @return {string[]}
 */
let letterCombinations = function (digits) {
    let dict = [" ", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"];
    let results = [];

    if (digits.length === 0) {
        return results;
    }

    if (digits.length === 1) {
        dict[parseInt(digits)].split('').forEach(function (c) {
            results.push(c.toString());
        });
        return results;
    }

    let list = letterCombinations(digits.substring(1, digits.length));
    let builder = "";

    dict[parseInt(digits.substring(0, 1))].split('').forEach(function (c) {
        list.forEach(function (s) {
            builder = builder.concat(c.toString(), s);
            results.push(builder);
            builder = "";
        });
    });

    return results;
};


if (letterCombinations("").length === 0) {
    console.log("pass")
} else {
    console.error("failed")
}

if (letterCombinations("1").length === 0) {
    console.log("pass")
} else {
    console.error("failed")
}

let list0 = letterCombinations("2");
if (list0.length === 3) {
    console.log("pass")
} else {
    console.error("failed")
}
if (new Set(list0).toString() === new Set(["a", "b", "c"]).toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

let list1 = letterCombinations("23");
if (list1.length === 9) {
    console.log("pass")
} else {
    console.error("failed")
}
if (new Set(list1).toString() === new Set(["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]).toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

let list2 = letterCombinations("234");
if (list2.length === 27) {
    console.log("pass")
} else {
    console.error("failed")
}
if (new Set(list2).toString() === new Set(["adg", "adh", "adi", "aeg", "aeh", "aei", "afg", "afh", "afi", "bdg", "bdh", "bdi", "beg", "beh", "bei", "bfg", "bfh", "bfi", "cdg", "cdh", "cdi", "ceg", "ceh", "cei", "cfg", "cfh", "cfi"]).toString()) {
    console.log("pass")
} else {
    console.error("failed")
}