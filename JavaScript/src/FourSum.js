/**
 * Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c + d = target?
 * Find all unique quadruplets in the array which gives the sum of target.
 *
 * Note: The solution set must not contain duplicate quadruplets.
 *
 * For example, given array S = [1, 0, -1, 0, -2, 2], and target = 0.
 *
 * A solution set is:
 * [
 * [-1,  0, 0, 1],
 * [-2, -1, 1, 2],
 * [-2,  0, 0, 2]
 * ]
 *
 * Accepted.
 */


/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[][]}
 */
let fourSum = function (nums, target) {
    let results = [];
    nums.sort(function (a, b) {
        return a - b
    });
    for (let i = 0; i < nums.length - 3; i++) {
        while (i > 0 && i < nums.length - 3 && nums[i] === nums[i - 1]) {
            i++;
        }
        for (let j = i + 1; j < nums.length - 2; j++) {
            while (j > i + 1 && j < nums.length - 2 && nums[j] === nums[j - 1]) {
                j++;
            }
            let low = j + 1;
            let high = nums.length - 1;
            let newTarget = target - (nums[i] + nums[j]);
            while (low < high) {
                let partialSum = nums[low] + nums[high];
                if (partialSum === newTarget) {
                    results.push([nums[i], nums[j], nums[low], nums[high]]);
                    high--;
                    low++;
                    while (low < high && nums[low] === nums[low - 1]) {
                        low++;
                    }
                    while (low < high && nums[high] === nums[high + 1]) {
                        high--;
                    }
                } else if (partialSum > newTarget) {
                    high--;
                } else {
                    low++;
                }
            }
        }
    }
    return results;
};


let list0 = fourSum([1, 0, -1, 0, -2, 2], 0);
let set = new Set();
set.add([-1, 0, 0, 1]);
set.add([-2, -1, 1, 2]);
set.add([-2, 0, 0, 2]);
if (list0.length === 3) {
    console.log("pass")
} else {
    console.error("failed")
}
if (new Set(list0).toString() === set.toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

set.clear();
let list1 = fourSum([-5, 5, 4, -3, 0, 0, 4, -2], 4);
set.add([-5, 0, 4, 5]);
set.add([-3, -2, 4, 5]);
if (new Set(list1).toString() === set.toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

console.log(fourSum([-3, -2, -1, 0, 0, 1, 2, 3], 0));
console.log(fourSum([-1, 0, -5, -2, -2, -4, 0, 1, -2], -9));