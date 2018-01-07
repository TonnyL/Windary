import java.util.ArrayList;
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
        public String toString() {
            return "Interval start: " + start + " end " + end;
        }
    }

    public static void main(String[] args) {
        MergeIntervals mi = new MergeIntervals();

        List<Interval> list11 = new ArrayList<>(1);
        list11.add(new Interval(1, 1));
        // Expected: [1, 1]
        System.out.println(mi.merge(list11));

        List<Interval> list1222 = new ArrayList<>(2);
        list1222.add(new Interval(1, 2));
        list1222.add(new Interval(2, 2));
        // Expected: [1, 2]
        System.out.println(mi.merge(list1222));

        List<Interval> list124578 = new ArrayList<>(3);
        list124578.add(new Interval(1, 2));
        list124578.add(new Interval(4, 5));
        list124578.add(new Interval(7, 8));
        // Expected: [1, 2], [4, 5], [7, 8]
        System.out.println(mi.merge(list124578));

        List<Interval> list1324 = new ArrayList<>(2);
        list1324.add(new Interval(1, 3));
        list1324.add(new Interval(2, 4));
        // Expected: [1, 4]
        System.out.println(mi.merge(list1324));

        List<Interval> list1423 = new ArrayList<>(2);
        list1423.add(new Interval(1, 4));
        list1423.add(new Interval(2, 3));
        // Expected: [1, 4]
        System.out.println(mi.merge(list1423));
    }

}
