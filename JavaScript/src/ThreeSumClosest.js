/**
 * Given an array S of n integers, find three integers in S such that the sum is closest to a given number, targe
 * Return the sum of the three integers.
 * You may assume that each input would have exactly one solution.
 *
 * For example, given array S = {-1 2 1 -4}, and target = 1.
 *
 * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 *
 * Accepted.
 */


/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
let threeSumClosest = function (nums, target) {
    nums.sort(function (a, b) {
        return a - b;
    });

    let result = nums[0] + nums[1] + nums[2];
    for (let i = 0; i < nums.length - 2; i++) {
        let l = i + 1, r = nums.length - 1;
        while (l < r) {
            let tmp = nums[i] + nums[l] + nums[r];
            if (tmp === target) {
                return tmp;
            }
            if (abs(tmp - target) < abs(result - target)) {
                result = tmp;
            }
            if (tmp < target) {
                l++;
            } else if (tmp > target) {
                r--;
            }
        }
    }

    return result;
};

let abs = function (a, b) {
    if (a < 0) {
        return -a;
    }
    return a;
};


if (threeSumClosest([-1, 2, 1, 4], 1) === 2) {
    console.log("pass")
} else {
    console.error("failed")
}

if (threeSumClosest([1, 1, 1, 0], 100) === 3) {
    console.log("pass")
} else {
    console.error("failed")
}

if (threeSumClosest([1, 1, 1, 0], -100) === 2) {
    console.log("pass")
} else {
    console.error("failed")
}

if (threeSumClosest([-1, 2, 1, -4], 1) === 2) {
    console.log("pass")
} else {
    console.error("failed")
}

console.log(threeSumClosest([1, 2, 4, 8, 16, 32, 64, 128], 82));