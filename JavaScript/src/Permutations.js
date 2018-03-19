/**
 * Given a collection of distinct numbers, return all possible permutations.
 *
 * For example,
 * [1,2,3] have the following permutations:
 * [
 * [1,2,3],
 * [1,3,2],
 * [2,1,3],
 * [2,3,1],
 * [3,1,2],
 * [3,2,1]
 * ]
 *
 * Accepted.
 */

/**
 * @param {number[]} nums
 * @return {number[][]}
 */
let permuteUnique = function (nums) {
    let results = [];

    if (nums.length === 0) {
        return results;
    }
    if (nums.length === 1) {
        results.push([nums[0]]);
        return results
    }

    let ints = nums.slice(0, nums.length - 1);
    let set = new Set();

    permuteUnique(ints).forEach(function (l) {
        for (let i = 0; i <= l.length; i++) {
            let tmp = [];
            l.forEach(function (element) {
                tmp.push(element);
            });
            tmp.splice(i, 0, nums[nums.length - 1]);
            set.add(tmp.join(','));
        }
    });

    set.forEach(function (value, value2, set) {
        let tmp = value.split(',');
        for (let i = 0; i < tmp.length; i++) {
            tmp[i] = parseInt(tmp[i]);
        }
        results.push(tmp);
    });

    return results
};


if (permuteUnique([]).length === 0) {
    console.log("pass")
} else {
    console.error("failed")
}

let list0 = permuteUnique([1]);
if (list0.length === 1) {
    console.log("pass")
} else {
    console.error("failed")
}
if (new Set(list0).toString() === new Set([[1]]).toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

let list1 = permuteUnique([1, 2]);
if (list1.length === 2) {
    console.log("pass")
} else {
    console.error("failed")
}
if (new Set(list1).toString() === new Set([[1, 2], [2, 1]]).toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

let list2 = permuteUnique([1, 2, 3]);
if (list2.length === 6) {
    console.log("pass")
} else {
    console.error("failed")
}
if (new Set(list2).toString() === new Set([[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]]).toString()) {
    console.log("pass")
} else {
    console.error("failed")
}
