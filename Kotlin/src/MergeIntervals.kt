/**
 * Given a collection of intervals, merge all overlapping intervals.
 *
 * For example,
 * Given [1,3],[2,6],[8,10],[15,18],
 * return [1,6],[8,10],[15,18].
 *
 * Accepted.
 */
class MergeIntervals {

    fun merge(intervals: List<Interval>): List<Interval> {
        if (intervals.isEmpty() || intervals.size == 1) {
            return intervals
        }

        val results = mutableListOf<Interval>()
        var newIntervals = intervals

        // Sort the list by starts.
        newIntervals = newIntervals.sortedBy {
            it.start
        }

        results.add(newIntervals[0])
        for (i in 1 until newIntervals.size) {
            if (results[results.size - 1].end >= newIntervals[i].start) {
                results[results.size - 1].end = Math.max(results[results.size - 1].end, newIntervals[i].end)
            } else {
                results.add(newIntervals[i])
            }
        }

        return results
    }

    data class Interval(
            var start: Int = 0,
            var end: Int = 0
    )

}
