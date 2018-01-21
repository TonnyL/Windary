package CombinationSumII

import "sort"

//Given a collection of candidate numbers (C) and a target number (T),
//find all unique combinations in C where the candidate numbers sums to T.
//
//Each number in C may only be used once in the combination.
//
//Note:
//All numbers (including target) will be positive integers.
//The solution set must not contain duplicate combinations.
//For example, given candidate set [10, 1, 2, 7, 6, 1, 5] and target 8,
//A solution set is:
//[
//[1, 7],
//[1, 2, 5],
//[2, 6],
//[1, 1, 6]
//]
//
//Accepted.

func combinationSum2(candidates []int, target int) [][]int {
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
		if i != index && candidates[i] == candidates[i-1] {
			continue
		}

		// Slice sucks.
		anotherPath := make([]int, len(path))
		copy(anotherPath, path)
		anotherPath = append(anotherPath, candidates[i])

		rets = dfs(candidates, target-candidates[i], anotherPath, rets, i+1)

		anotherPath = anotherPath[:len(anotherPath)-1]
	}
	return
}
