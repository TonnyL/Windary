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

    def __str__(self):
        return "Interval start " + str(self.start) + " end " + str(self.end) + " "


mi = MergeIntervals()

# Expected: [1, 1]
print("".join(str(interval) for interval in mi.merge([Interval(1, 1)])))

# Expected: [1, 2]
print("".join(str(interval) for interval in mi.merge([Interval(1, 2), Interval(2, 2)])))

# Expected: [1, 2], [4, 5], [7, 8]
print("".join(str(interval) for interval in mi.merge([Interval(1, 2), Interval(4, 5), Interval(7, 8)])))

# Expected: [1, 4]
print("".join(str(interval) for interval in mi.merge([Interval(1, 3), Interval(2, 4)])))

# Expected: [1, 4]
print("".join(str(interval) for interval in mi.merge([Interval(1, 4), Interval(2, 3)])))
