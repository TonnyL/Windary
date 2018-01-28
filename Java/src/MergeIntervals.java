import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * Given a collection of intervals, merge all overlapping intervals.
 * <p>
 * For example,
 * Given [1,3],[2,6],[8,10],[15,18],
 * return [1,6],[8,10],[15,18].
 * <p>
 * Accepted.
 */
public class MergeIntervals {

    public List<Interval> merge(List<Interval> intervals) {
        if (intervals == null || intervals.isEmpty() || intervals.size() == 1) {
            return intervals;
        }

        List<Interval> results = new LinkedList<>();

        // Sort the list by starts.
        intervals.sort(Comparator.comparingInt(o -> o.start));

        results.add(intervals.get(0));
        for (int i = 1; i < intervals.size(); i++) {
            int resultsSize = results.size();
            Interval lastResult = results.get(resultsSize - 1);
            if (lastResult.end >= intervals.get(i).start) {
                results.get(resultsSize - 1).end = Math.max(lastResult.end, intervals.get(i).end);
            } else {
                results.add(intervals.get(i));
            }
        }

        return results;
    }

    public static class Interval {

        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Interval) {
                Interval interval = (Interval) obj;
                return this.start == interval.start && this.end == interval.end;
            }
            return false;
        }

    }

}
