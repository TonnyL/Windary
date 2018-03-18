/**
 * Given a collection of integers that might contain duplicates, nums, return all possible subsets (the power set).
 *
 * Note: The solution set must not contain duplicate subsets.
 *
 * For example,
 * If nums = [1,2,2], a solution is:
 *
 * [
 * [2],
 * [1],
 * [1,2,2],
 * [2,2],
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
let subsetsWithDup = function (nums) {
    if (nums === null || nums.length === 0) {
        return [];
    }

    let lists = [];

    if (nums.length === 1) {
        lists.push([], [nums[0]]);
        return lists;
    }

    nums.sort();
    subsetsWithDup(nums.slice(0, nums.length - 1)).forEach(function (list) {
        let l = [];
        l.push(nums[nums.length - 1]);
        list.forEach(function (i) {
            l.push(i);
        });

        let equalsL = false;
        let equalsList = false;

        for (let i = 0; i < lists.length; i++) {
            if (lists[i].toString() === list.toString()) {
                equalsList = true;
            }
            if (lists[i].toString() === l.toString()) {
                equalsL = true;
            }
            if (equalsList && equalsL) {
                break;
            }
        }

        if (!equalsList) {
            lists.push(list);
        }

        if (!equalsL) {
            lists.push(l);
        }
    });

    return lists;
};


if (subsetsWithDup(null).length === 0) {
    console.log("pass")
} else {
    console.error("failed")
}

if (subsetsWithDup([]).length === 0) {
    console.log("pass")
} else {
    console.error("failed")
}

if (subsetsWithDup([1]).toString() === [[], [1]].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

if (new Set(subsetsWithDup([1, 1])).toString() === new Set([[], [1], [1, 1]]).toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

if (new Set(subsetsWithDup([1, 2])).toString() === new Set([[], [1], [2], [1, 2]]).toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

if (new Set(subsetsWithDup([1, 2, 2])).toString() === new Set([[], [1], [2], [1, 2], [2, 2], [1, 2, 2]]).toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

if (new Set(subsetsWithDup([4, 4, 4, 1, 4])).toString() === new Set([[], [1], [4], [1, 4], [1, 4, 4], [1, 4, 4, 4], [1, 4, 4, 4, 4], [4, 4], [4, 4, 4], [4, 4, 4, 4]]).toString()) {
    console.log("pass")
} else {
    console.error("failed")
}
