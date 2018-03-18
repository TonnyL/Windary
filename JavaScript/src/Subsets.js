/**
 * Given a set of distinct integers, nums, return all possible subsets (the power set).
 *
 * Note: The solution set must not contain duplicate subsets.
 *
 * For example,
 * If nums = [1,2,3], a solution is:
 *
 * [
 * [3],
 * [1],
 * [2],
 * [1,2,3],
 * [1,3],
 * [2,3],
 * [1,2],
 * []
 * ]
 *
 * Accepted.
 */

/**
 * @param {number[]} nums
 * @return {number[][]}
 */
let subsets = function (nums) {
    let results = [];
    results.push([]);

    if (nums == null || nums.length === 0) {
        return results;
    }

    nums.sort();

    nums.forEach(function (i) {
        let size = results.length;
        for (let j = 0; j < size; j++) {
            let list = [];
            results[j].forEach(function (element) {
                list.push(element);
            });
            list.push(i);

            results.push(list);
        }
    });

    return results;
};


if (subsets([]).toString() === [[]].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

if (subsets(null).toString() === [[]].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

if (subsets([1]).toString() === [[], [1]].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

if (subsets([1, 2]).toString() === [[], [1], [2], [1, 2]].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

if (subsets([1, 2, 3]).toString() === [[], [1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3]].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}