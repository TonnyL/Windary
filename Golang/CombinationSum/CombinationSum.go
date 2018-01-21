package CombinationSum

import (
	"sort"
)

//Given a set of candidate numbers (C) (without duplicates) and a target number (T),
//find all unique combinations in C where the candidate numbers sums to T.
//
//The same repeated number may be chosen from C unlimited number of times.
//
//Note:
//All numbers (including target) will be positive integers.
//The solution set must not contain duplicate combinations.
//For example, given candidate set [2, 3, 6, 7] and target 7,
//A solution set is:
//[
//[7],
//[2, 2, 3]
//]
//
//Accepted.

func combinationSum(candidates []int, target int) [][]int {
	if len(candidates) == 0 {
		return [][]int{}
	}

	sort.Ints(candidates)

	return dfs(candidates, target, []int{}, [][]int{}, 0)
}

func dfs(candidates []int, target int, path []int, ret [][]int, index int) (rets [][]int) {
	rets = ret
	if target < 0 {
		return
	}

	if target == 0 {
		rets = append(rets, path)
		return
	}

	for i := index; i < len(candidates); i++ {
		// Slice sucks.
		anotherPath := make([]int, len(path))
		copy(anotherPath, path)
		anotherPath = append(anotherPath, candidates[i])

		rets = dfs(candidates, target-candidates[i], anotherPath, rets, i)

		anotherPath = anotherPath[:len(anotherPath)-1]
	}
	return
}
