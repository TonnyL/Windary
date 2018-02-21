/**
 * Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai).
 * n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
 * Find two lines, which together with x-axis forms a container, such that the container contains the most water.
 *
 * Note: You may not slant the container and n is at least 2.
 */


/**
 * @param {number[]} height
 * @return {number}
 */
let maxArea = function (height) {
    if (height.length < 2) {
        return 0;
    }
    let low = 0, high = height.length - 1, maxCapacity = 0;

    while (low < high) {
        let cap = (high - low) * Math.min(height[low], height[high]);
        if (cap > maxCapacity) {
            maxCapacity = cap;
        }
        if (height[low] < height[high]) {
            low++;
        } else {
            high--;
        }
    }

    return maxCapacity;
};


if (maxArea([1, 1]) === 1) {
    console.log("pass")
} else {
    console.error("failed")
}

if (maxArea([1, 4, 9]) === 4) {
    console.log("pass")
} else {
    console.error("failed")
}

if (maxArea([1, 4, 9, 4]) === 8) {
    console.log("pass")
} else {
    console.error("failed")
}