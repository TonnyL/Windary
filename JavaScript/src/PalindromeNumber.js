/**
 * @param {number} x
 * @return {boolean}
 */
let isPalindrome = function (x) {
    if (x < 10 && x >= 0) {
        return true;
    }
    if (x % 10 === 0) {
        return false;
    }

    let y = 0;
    while (x > y) {
        y = y * 10 + x % 10;
        x = parseInt(x / 10);
    }

    return x === y || x === parseInt(y / 10);
};


if (!isPalindrome(-1)) {
    console.log("pass")
} else {
    console.error("failed")
}

if (isPalindrome(1)) {
    console.log("pass")
} else {
    console.error("failed")
}

if (isPalindrome(121)) {
    console.log("pass")
} else {
    console.error("failed")
}

if (isPalindrome(1001)) {
    console.log("pass")
} else {
    console.error("failed")
}

if (!isPalindrome(1000021)) {
    console.log("pass")
} else {
    console.error("failed")
}