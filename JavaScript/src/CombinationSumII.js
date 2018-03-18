/**
 * Given a collection of candidate numbers (C) and a target number (T),
 * find all unique combinations in C where the candidate numbers sums to T.
 *
 * Each number in C may only be used once in the combination.
 *
 * Note:
 * All numbers (including target) will be positive integers.
 * The solution set must not contain duplicate combinations.
 * For example, given candidate set [10, 1, 2, 7, 6, 1, 5] and target 8,
 * A solution set is:
 * [
 * [1, 7],
 * [1, 2, 5],
 * [2, 6],
 * [1, 1, 6]
 * ]
 *
 * Accepted.
 */

/**
 * @param {number[]} candidates
 * @param {number} target
 * @return {number[][]}
 */
let combinationSum2 = function (candidates, target) {
    if (candidates.length === 0) {
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
        if (i !== index && candidates[i] === candidates[i - 1]) {
            continue;
        }

        path.push(candidates[i]);
        dfs(candidates, target - candidates[i], path, ret, i + 1);
        path.splice(path.length - 1, 1);
    }
};


// Expected: [[1, 7], [1, 2, 5], [2, 6], [1, 1, 6]]
let list0 = combinationSum2([10, 1, 2, 7, 6, 1, 5], 8);
let set = new Set([[1, 7], [1, 2, 5], [2, 6], [1, 1, 6]]);
if (list0.length === 4) {
    console.log("pass")
} else {
    console.error("failed")
}
if (new Set(list0).toString() === set.toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

// Expected: []
if (combinationSum2([1], 2).length === 0) {
    console.log("pass")
} else {
    console.error("failed")
}

// Expected: [[1, 1, 2], [2, 2]]
set.clear();
let list1 = combinationSum2([1, 1, 2, 2], 4);
set.add([[1, 1, 2], [2, 2]]);
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

console.log(combinationSum2([5, 4, 5, 1, 5, 3, 1, 4, 5, 5, 4], 10));
console.log(combinationSum2([3, 5, 4, 1, 2, 2, 4, 2, 2, 1, 5], 2));