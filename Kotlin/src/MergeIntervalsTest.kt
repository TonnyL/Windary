import org.junit.Test

class MergeIntervalsTest {

    @Test
    fun testMerge() {
        val mi = MergeIntervals()

        assert(mi.merge(listOf(MergeIntervals.Interval(1, 1))) == listOf(MergeIntervals.Interval(1, 1)))

        assert(mi.merge(listOf(MergeIntervals.Interval(1, 2), MergeIntervals.Interval(2, 2))) == listOf(MergeIntervals.Interval(1, 2)))

        assert(mi.merge(listOf(MergeIntervals.Interval(1, 2), MergeIntervals.Interval(4, 5), MergeIntervals.Interval(7, 8))) == listOf(MergeIntervals.Interval(1, 2), MergeIntervals.Interval(4, 5), MergeIntervals.Interval(7, 8)))

        assert(mi.merge(listOf(MergeIntervals.Interval(1, 3), MergeIntervals.Interval(2, 4))) == listOf(MergeIntervals.Interval(1, 4)))

        assert(mi.merge(listOf(MergeIntervals.Interval(1, 4), MergeIntervals.Interval(2, 3))) == listOf(MergeIntervals.Interval(1, 4)))
    }

}