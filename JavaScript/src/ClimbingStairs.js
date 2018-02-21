/**
 * You are climbing a stair case. It takes n steps to reach to the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * Note: Given n will be a positive integer.
 *
 * Accepted. Recursion will exceed the time limit.
 */

/**
 * @param {number} n
 * @return {number}
 */
let climbStairs = function (n) {
    if (n <= 0) {
        return 0;
    }
    if (n === 1 || n === 2) {
        return n;
    }

    let results = new Int32Array(n);
    results[0] = 1;
    results[1] = 2;

    for (let i = 2; i < n; i++) {
        results[i] = results[i - 1] + results[i - 2];
    }

    return results[n - 1];
};

if (climbStairs(1) === 1) {
    console.log("pass")
} else {
    console.error("failed")
}

if (climbStairs(3) === 3) {
    console.log("pass")
} else {
    console.error("failed")
}

if (climbStairs(5) === 8) {
    console.log("pass")
} else {
    console.error("failed")
}