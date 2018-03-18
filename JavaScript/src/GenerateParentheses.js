/**
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 *
 * For example, given n = 3, a solution set is:
 *
 * [
 * "((()))",
 * "(()())",
 * "(())()",
 * "()(())",
 * "()()()"
 * ]
 *
 * Accepted.
 */


/**
 * @param {number} n
 * @return {string[]}
 */
let generateParenthesis = function (n) {
    let set = new Set();
    let list = [];

    if (n <= 0) {
        return list;
    }
    if (n === 1) {
        list.push("()");
        return list;
    }

    generateParenthesis(n - 1).forEach(function (s) {
        let builder = "";
        let chars = s.split('');

        for (let j = 0; j < chars.length; j++) {
            builder = builder.concat(chars[j]);
            if (chars[j] === '(') {
                let b = builder;
                b = b.concat("()");
                for (let k = j + 1; k < chars.length; k++) {
                    b = b.concat(chars[k]);
                }
                set.add(b);
            }
        }

        set.add(s + "()");
    });

    set.forEach(function (s) {
        list.push(s);
    });

    return list;
};


if (generateParenthesis(0).length === 0) {
    console.log("pass")
} else {
    console.error("failed")
}

let set = new Set();
let list0 = generateParenthesis(1);
set.add("()");
if (new Set(list0).toString() === set.toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

let list1 = generateParenthesis(2);
set.clear();
set.add("()()");
set.add("(())");
if (list1.length === 2) {
    console.log("pass")
} else {
    console.error("failed")
}
if (new Set(list1).toString() === set.toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

let list2 = generateParenthesis(3);
set.clear();
["()()()", "()(())", "(()())", "(())()", "((()))"].forEach(function (s) {
    set.add(s);
});
if (list2.length === 5) {
    console.log("pass")
} else {
    console.error("failed")
}
if (new Set(list2).toString() === set.toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

let list3 = generateParenthesis(4);
set.clear();
["()((()))", "(())(())", "(((())))", "(())()()", "()()(())", "(()())()", "(()(()))", "()()()()", "()(())()", "()(()())", "(()()())", "((()()))", "((()))()", "((())())"].forEach(function (s) {
    set.add(s);
});
if (list3.length === 14) {
    console.log("pass")
} else {
    console.error("failed")
}
if (new Set(list3).toString() === set.toString()) {
    console.log("pass")
} else {
    console.error("failed")
}