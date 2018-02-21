/**
 * A message containing letters from A-Z is being encoded to numbers using the following mapping:
 *
 * 'A' -> 1
 * 'B' -> 2
 * ...
 * 'Z' -> 26
 * Given an encoded message containing digits, determine the total number of ways to decode it.
 *
 * For example,
 * Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12).
 *
 * The number of ways decoding "12" is 2.
 *
 * Accepted.
 */


/**
 * @param {string} s
 * @return {number}
 */
let numDecodings = function (s) {
    if (s == null || s.length === 0 || s.charAt(0) === '0') {
        return 0;
    }

    let ints = new Int32Array(s.length + 1);
    ints[0] = 1;

    for (let i = 1; i < ints.length; i++) {
        ints[i] = s.charAt(i - 1) === '0' ? 0 : ints[i - 1];

        if (i > 1 && (s.charAt(i - 2) === '1' || (s.charAt(i - 2) === '2') && s.charAt(i - 1) <= '6')) {
            ints[i] += ints[i - 2];
        }
    }

    return ints[s.length];
};


// Expected: 1, ['A']
if (numDecodings("1") === 1) {
    console.log("pass")
} else {
    console.error("failed")
}

// Expected: 0
if (numDecodings("0") === 0) {
    console.log("pass")
} else {
    console.error("failed")
}

// Expected: 1, ['JA']
if (numDecodings("101") === 1) {
    console.log("pass")
} else {
    console.error("failed")
}

// Expected: 1, ['AK']
if (numDecodings("110") === 1) {
    console.log("pass")
} else {
    console.error("failed")
}

// Expected: 1, ['JJ']
if (numDecodings("1010") === 1) {
    console.log("pass")
} else {
    console.error("failed")
}

// Expected: 0
if (numDecodings("012") === 0) {
    console.log("pass")
} else {
    console.error("failed")
}

// Expected: 2, ['JAA', 'JK']
if (numDecodings("1011") === 2) {
    console.log("pass")
} else {
    console.error("failed")
}

// Expected: 2, ['AB', 'L']
if (numDecodings("12") === 2) {
    console.log("pass")
} else {
    console.error("failed")
}

// Expected: 3, ['ABC', 'LC', 'AW']
if (numDecodings("123") === 3) {
    console.log("pass")
} else {
    console.error("failed")
}

// Expected: 3, ['ABAT', 'LAT', 'AUT']
if (numDecodings("12120") === 3) {
    console.log("pass")
} else {
    console.error("failed")
}