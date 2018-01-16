package Subsets

import (
	"sort"
)

//Given a set of distinct integers, nums, return all possible subsets (the power set).
//
//Note: The solution set must not contain duplicate subsets.
//
//For example,
//If nums = [1,2,3], a solution is:
//
//[
//[3],
//[1],
//[2],
//[1,2,3],
//[1,3],
//[2,3],
//[1,2],
//[]
//]
//
//Accepted.

func subsets(nums []int) [][]int {
	results := make([][]int, 0)
	results = append(results, []int{})

	if nums == nil || len(nums) == 0 {
		return results
	}

	sort.Ints(nums)

	for _, i := range nums {
		size := len(results)
		for j := 0; j < size; j++ {
			l := make([]int, 0)
			for _, r := range results[j] {
				l = append(l, r)
			}
			l = append(l, i)
			results = append(results, l)
		}
	}

	return results
}
