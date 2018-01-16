package PermutationsII

import (
	"strconv"
)

//Given a collection of numbers that might contain duplicates, return all possible unique permutations.
//
//For example,
//[1,1,2] have the following unique permutations:
//[
//[1,1,2],
//[1,2,1],
//[2,1,1]
//]
//
//Accepted.

func permuteUnique(nums []int) [][]int {
	results, numsLength := make([][]int, 0), len(nums)

	if numsLength == 0 {
		return results
	}
	if numsLength == 1 {
		l := make([]int, 0)
		l = append(l, nums[0])
		results = append(results, l)
		return results
	}

	ints := append([]int{}, nums[0:numsLength-1]...)
	dict := map[string][]int{}

	for _, l := range permuteUnique(ints) {
		for i := 0; i <= len(l); i++ {
			tmp := append([]int{}, l...)

			rear := append([]int{}, tmp[i:]...)
			tmp = append(tmp[0:i], nums[numsLength-1])
			tmp = append(tmp, rear...)

			key := ""
			for _, i := range tmp {
				key += strconv.Itoa(i)
			}
			dict[key] = tmp
		}
	}

	for _, v := range dict {
		results = append(results, v)
	}

	return results
}
