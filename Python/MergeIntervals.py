# Given a collection of intervals, merge all overlapping intervals.
#
# For example,
# Given [1,3],[2,6],[8,10],[15,18],
# return [1,6],[8,10],[15,18].
#
# Python, Python3 all accepted.


class MergeIntervals:
    def merge(self, intervals):
        """
        :type intervals: List[Interval]
        :rtype: List[Interval]
        """
        if intervals is None or len(intervals) == 0 or len(intervals) == 1:
            return intervals

        results = []

        # Sort the list by starts.
        intervals = sorted(intervals, key=lambda interval: interval.start)

        results.append(intervals[0])
        intervals_size = len(intervals)
        for i in range(1, intervals_size):
            results_size = len(results)
            if results[results_size - 1].end >= intervals[i].start:
                results[results_size - 1].end = max(results[results_size - 1].end, intervals[i].end)
            else:
                results.append(intervals[i])

        return results


class Interval:
    def __init__(self, s=0, e=0):
        self.start = s
        self.end = e

    def __eq__(self, other):
        return self.start == other.start and self.end == other.end
