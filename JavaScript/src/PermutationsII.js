/**
 * Given a collection of numbers that might contain duplicates, return all possible unique permutations.
 *
 * For example,
 * [1,1,2] have the following unique permutations:
 * [
 * [1,1,2],
 * [1,2,1],
 * [2,1,1]
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
        return results;
    }

    let ints = [];
    for (let i = 0; i < nums.length - 1; i++) {
        ints[i] = nums[i];
    }
    let map = new Map();
    permuteUnique(ints).forEach(function (list) {
        for (let i = 0; i < list.length; i++) {
            let tmp = [];
            list.forEach(function (element) {
                tmp.push(element);
            });
            tmp.splice(i, 0, nums[nums.length - 1]);
            map.set(tmp.toString(), tmp);
        }
    });

    map.forEach(function (value, key, map) {
        results.push(value);
    });

    return results
};

if (permuteUnique([]).length === 0) {
    console.log("pass")
} else {
    console.error("failed")
}

if (permuteUnique([1]).toString() === [[1]].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

if (new Set(permuteUnique([1, 1, 2])).toString() === new Set([[1, 1, 2], [1, 2, 1], [2, 1, 1]]).toString()) {
    console.log("pass")
} else {
    console.error("failed")
}