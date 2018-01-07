package MergeIntervals

import (
	"sort"
)

//Given a collection of intervals, merge all overlapping intervals.
//
//For example,
//Given [1,3],[2,6],[8,10],[15,18],
//return [1,6],[8,10],[15,18].
//
//Accepted.

type Interval struct {
	Start int
	End   int
}

func merge(intervals []Interval) []Interval {
	if intervals == nil || len(intervals) == 0 || len(intervals) == 1 {
		return intervals
	}

	var results []Interval

	sort.Slice(intervals, func(i, j int) bool {
		return intervals[i].Start < intervals[j].Start
	})

	results = append(results, intervals[0])
	intervalsSize := len(intervals)
	for i := 1; i < intervalsSize; i++ {
		if results[len(results)-1].End >= intervals[i].Start {
			results[len(results)-1].End = max(results[len(results)-1].End, intervals[i].End)
		} else {
			results = append(results, intervals[i])
		}
	}

	return results
}

func max(i, j int) int {
	if i > j {
		return i
	}
	return j
}
