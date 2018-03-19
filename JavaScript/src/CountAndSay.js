/**
 * The count-and-say sequence is the sequence of integers with the first five terms as following:
 *
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 * Given an integer n, generate the nth term of the count-and-say sequence.
 *
 * Note: Each term of the sequence of integers will be represented as a string.
 *
 * Example 1:
 *
 * Input: 1
 * Output: "1"
 * Example 2:
 *
 * Input: 4
 * Output: "1211"
 *
 * Accepted.
 */


/**
 * @param {number} n
 * @return {string}
 */
let countAndSay = function (n) {
    if (n <= 0) {
        return "0"
    }
    if (n === 1) {
        return "1"
    }

    let result = [];
    let charArray = countAndSay(n - 1).split('');
    let i = 0;
    while (i < (charArray.length - 1)) {
        let count = 1;
        while ((i + 1) < charArray.length && charArray[i] === charArray[i + 1]) {
            count += 1;
            i++;
        }

        result.push(count.toString());
        result.push(charArray[i].toString());

        i++;
    }

    if ((charArray.length - 2) >= 0 && charArray[(charArray.length - 1)] === charArray[(charArray.length - 2)]) {
        result[result.length - 2] = parseInt(result[result.length - 2]).toString();
    } else {
        result.push(charArray[charArray.length - 1].toString());
        result.push("1");
    }

    return result.join('');
};


if (countAndSay(1) === "1") {
    console.log("pass")
} else {
    console.error("failed")
}

if (countAndSay(2) === "11") {
    console.log("pass")
} else {
    console.error("failed")
}

if (countAndSay(3) === "21") {
    console.log("pass")
} else {
    console.error("failed")
}

if (countAndSay(4) === "1211") {
    console.log("pass")
} else {
    console.error("failed")
}

if (countAndSay(5) === "111221") {
    console.log("pass")
} else {
    console.error("failed")
}

if (countAndSay(6) === "312211") {
    console.log("pass")
} else {
    console.error("failed")
}