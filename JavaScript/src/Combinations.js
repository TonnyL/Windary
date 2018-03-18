/**
 * Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.
 *
 * For example,
 * If n = 4 and k = 2, a solution is:
 *
 * [
 * [2,4],
 * [3,4],
 * [2,3],
 * [1,2],
 * [1,3],
 * [1,4],
 * ]
 */

/**
 * Iterative solution.
 *
 * @param {number} n
 * @param {number} k
 * @return {number[][]}
 */
let combine = function (n, k) {
    let results = [];
    if (n === 0 || k === 0 || k > n) {
        return results;
    }

    for (let i = 1; i <= n + 1 - k; i++) {
        results.push([i]);
    }

    for (let i = 2; i <= k; i++) {
        let tmp = [];
        results.forEach(function (list) {
            for (let m = list[list.length - 1] + 1; m <= n - (k - i); m++) {
                let newList = [];
                list.forEach(function (element) {
                    newList.push(element);
                });
                newList.push(m);
                tmp.push(newList);
            }
        });
        results = tmp;
    }
    return results;
};

/**
 * Recursive solution.
 * Time Limit Exceeded.
 *
 * @param {number} n
 * @param {number} k
 * @return {number[][]}
 */
/*let combine = function (n, k) {
    let results = [];
    if (n === 0 || k === 0 || k > n) {
        return results;
    }
    if (k === 1) {
        for (let i = 1; i <= n; i++) {
            let list = [];
            list.push(i);
            results.push(list);
        }
        return results;
    }
    combine(n, k - 1).forEach(function (list) {
        for (let i = list[list.length - 1]; i < n; i++) {
            let tmp = [];
            list.forEach(function (a) {
                tmp.push(a);
            });
            tmp.push(i + 1);
            results.push(tmp);
        }
    });
    return results;
};*/

if (combine(2, 0).length === 0) {
    console.log("pass")
} else {
    console.error("failed")
}

let list0 = combine(2, 1);
let tmp = new Set([[1], [2]]);
if (list0.length === 2) {
    console.log("pass")
} else {
    console.error("failed")
}
if (new Set(list0).toString() === tmp.toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

tmp.clear();
let list1 = combine(4, 2);
tmp.add([[2, 4], [3, 4], [2, 3], [1, 2], [1, 3], [1, 4]]);
if (list1.length === 6) {
    console.log("pass")
} else {
    console.error("failed")
}
if (new Set(list1).toString() === tmp.toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

tmp.clear();
let list2 = combine(4, 3);
tmp.add([[1, 2, 3], [1, 2, 4], [1, 3, 4], [2, 3, 4]]);
if (list2.length === 4) {
    console.log("pass")
} else {
    console.error("failed")
}
if (new Set(list2).toString() === tmp.toString()) {
    console.log("pass")
} else {
    console.error("failed")
}
