/**
 * Implement int sqrt(int x).
 * Compute and return the square root of x.
 *
 * Accepted.
 */

/**
 * @param {number} x
 * @return {number}
 */
let mySqrt = function (x) {
    // A tricky way to solve the problem.
    // return parseInt(Math.sqrt(x));
    if (x <= 0) {
        return 0;
    }
    if (x <= 3) {
        return 1;
    }

    let high = parseInt(x / 2), low = 1;
    // To avoid overflow.
    if (x >= 46340 * 46340) {
        return 46340;
    }
    if (high > 46340) {
        high = 46340;
    }

    let mid = parseInt((high + 1) / 2);
    do {
        if (mid * mid > x) {
            high = mid - 1;
        } else if (mid * mid < x) {
            if ((mid + 1) * (mid + 1) > x) {
                return mid;
            }
            low = mid + 1;
        } else {
            return mid;
        }
        mid = parseInt((low + high) / 2);
    } while (high > low);

    return mid;
};


if (mySqrt(0) === 0) {
    console.log("pass")
} else {
    console.error("failed")
}


if (mySqrt(1) === 1) {
    console.log("pass")
} else {
    console.error("failed")
}

if (mySqrt(2147395599) === 46339) {
    console.log("pass")
} else {
    console.error("failed")
}

if (mySqrt(2147395600) === 46340) {
    console.log("pass")
} else {
    console.error("failed")
}

if (mySqrt(6) === 2) {
    console.log("pass")
} else {
    console.error("failed")
}
