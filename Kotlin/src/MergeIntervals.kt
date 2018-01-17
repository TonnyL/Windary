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

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val mi = MergeIntervals()

            // Expected: [1, 1]
            println(mi.merge(listOf(Interval(1, 1))))

            // Expected: [1, 2]
            println(mi.merge(listOf(Interval(1, 2), Interval(2, 2))))

            // Expected: [1, 2], [4, 5], [7, 8]
            println(mi.merge(listOf(Interval(1, 2), Interval(4, 5), Interval(7, 8))))

            // Expected: [1, 4]
            println(mi.merge(listOf(Interval(1, 3), Interval(2, 4))))

            // Expected: [1, 4]
            println(mi.merge(listOf(Interval(1, 4), Interval(2, 3))))
        }
    }

}
