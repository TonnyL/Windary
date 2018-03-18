/**
 * Given a roman numeral, convert it to an integer.
 * Input is guaranteed to be within the range from 1 to 3999.
 *
 * Accepted.
 */


/**
 * @param {string} s
 * @return {number}
 */
let romanToInt = function (s) {
    if (s == null) {
        return -1;
    }

    let dict = new Map();
    dict.set('I', 1);
    dict.set('V', 5);
    dict.set('X', 10);
    dict.set('L', 50);
    dict.set('C', 100);
    dict.set('D', 500);
    dict.set('M', 1000);

    let chars = s.split('');
    let result = 0;

    for (let i = 0; i < chars.length; i++) {
        if (i + 1 < chars.length
            && dict.get(chars[i + 1]) > dict.get(chars[i])
            && (chars[i] === 'I' || chars[i] === 'X' || chars[i] === 'C')) {
            result += dict.get(chars[i + 1]) - dict.get(chars[i]);

            i++;
        } else {
            result += dict.get(chars[i]);
        }
    }

    return result;
};


// Expected: 621 = 500 + 100 + 10 + 10 +1
if (romanToInt("DCXXI") === 621) {
    console.log("pass")
} else {
    console.error("failed")
}
// Expected: 1996 = 1000 - (100 - 1000) - (10 - 100) + 5 + 1
if (romanToInt("MCMXCVI") === 1996) {
    console.log("pass")
} else {
    console.error("failed")
}
// Expected: 999 = - (100 - 1000) - (10 - 100) - (1 - 10)
if (romanToInt("CMXCIX") === 999) {
    console.log("pass")
} else {
    console.error("failed")
}