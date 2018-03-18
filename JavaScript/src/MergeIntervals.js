/**
 * Given a collection of intervals, merge all overlapping intervals.
 *
 * For example,
 * Given [1,3],[2,6],[8,10],[15,18],
 * return [1,6],[8,10],[15,18].
 *
 * Accepted.
 */

function Interval(start, end) {
    this.start = start;
    this.end = end;
}


/**
 * @param {Interval[]} intervals
 * @return {Interval[]}
 */
let merge = function (intervals) {
    if (intervals == null || intervals.length === 0 || intervals.length === 1) {
        return intervals;
    }

    let results = [];

    // Sort the list by starts.
    intervals.sort(function (a, b) {
        if (a.start > b.start) {
            return 1;
        } else if (a.start === b.start) {
            return 0;
        }
        return -1;
    });

    results.push(intervals[0]);
    for (let i = 1; i < intervals.length; i++) {
        let resultsSize = results.length;
        let lastResult = results[resultsSize - 1];
        if (lastResult.end >= intervals[i].start) {
            results[resultsSize - 1].end = Math.max(lastResult.end, intervals[i].end);
        } else {
            results.push(intervals[i]);
        }
    }

    return results;
};


if (merge([new Interval(1, 1)]).toString() === [new Interval(1, 1)].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

if (merge([new Interval(1, 2), new Interval(2, 2)]).toString() === [new Interval(1, 2)].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

if (merge([new Interval(1, 2), new Interval(4, 5), new Interval(7, 8)]).toString() === [new Interval(1, 2), new Interval(4, 5), new Interval(7, 8)].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

if (merge([new Interval(1, 3), new Interval(2, 4)]).toString() === [new Interval(1, 4)].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}

if (merge([new Interval(1, 4), new Interval(2, 3)]).toString() === [new Interval(1, 4)].toString()) {
    console.log("pass")
} else {
    console.error("failed")
}