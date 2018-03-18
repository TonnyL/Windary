/**
 * Given a set of candidate numbers (C) (without duplicates) and a target number (T),
 * find all unique combinations in C where the candidate numbers sums to T.
 *
 * The same repeated number may be chosen from C unlimited number of times.
 *
 * Note:
 * All numbers (including target) will be positive integers.
 * The solution set must not contain duplicate combinations.
 * For example, given candidate set [2, 3, 6, 7] and target 7,
 * A solution set is:
 * [
 * [7],
 * [2, 2, 3]
 * ]
 *
 * Accepted.
 */

/**
 * @param {number[]} candidates
 * @param {number} target
 * @return {number[][]}
 */
let combinationSum = function (candidates, target) {
    if (candidates == null || candidates.length === 0) {
        return [];
    }
    let lists = [];

    candidates.sort();

    dfs(candidates, target, [], lists, 0);

    return lists;
};

let dfs = function (candidates, target, path, ret, index) {
    if (target < 0) {
        return;
    }

    if (target === 0) {
        let tmp = [];
        path.forEach(function (i) {
            tmp.push(i);
        });
        ret.push(tmp);
        return;
    }

    for (let i = index; i < candidates.length; i++) {
        path.push(candidates[i]);
        dfs(candidates, target - candidates[i], path, ret, i);
        path.splice(path.length - 1, 1)
    }
};

let list0 = combinationSum([2, 3, 6, 7], 7);
let set = new Set();
set.add([[7], [2, 2, 3]]);
if (list0.length === 2) {
    console.log("pass")
} else {
    console.error("failed")
}
if (new Set(list0).toString() === set.toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

let list1 = combinationSum([1], 3);
set.clear();
set.add([1, 1, 1]);
if (list1.length === 1) {
    console.log("pass")
} else {
    console.error("failed")
}
if (new Set(list1).toString() === set.toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

let list2 = combinationSum([1, 2], 4);
set.clear();
set.add([[1, 1, 1, 1], [1, 1, 2], [2, 2]]);
if (list2.length === 3) {
    console.log("pass")
} else {
    console.error("failed")
}
if (new Set(list2).toString() === set.toString()) {
    console.log("pass")
} else {
    console.error("failed")
}