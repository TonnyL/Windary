package SubsetsII

import (
	"sort"
)

//Given a collection of integers that might contain duplicates, nums, return all possible subsets (the power set).
//
//Note: The solution set must not contain duplicate subsets.
//
//For example,
//If nums = [1,2,2], a solution is:
//
//[
//[2],
//[1],
//[1,2,2],
//[2,2],
//[1,2],
//[]
//]
//
//Accepted.

func subsetsWithDup(nums []int) [][]int {
	if nums == nil || len(nums) == 0 {
		return [][]int{}
	}

	lists := make([][]int, 0)

	if len(nums) == 1 {
		lists = append(lists, []int{})
		lists = append(lists, []int{nums[0]})

		return lists
	}

	sort.Ints(nums)

	for _, list := range subsetsWithDup(nums[:len(nums)-1]) {
		var l []int = nil
		l = append(l, nums[len(nums)-1])
		for _, integer := range list {
			l = append(l, integer)
		}

		equalsL := false
		equalsList := false
		for _, li := range lists {
			if sameIntSlice(list, li) {
				equalsList = true
			}

			if sameIntSlice(li, l) {
				equalsL = true
			}

			if equalsList && equalsL {
				break
			}
		}

		if !equalsL {
			lists = append(lists, l)
		}

		if !equalsList {
			lists = append(lists, list)
		}
	}

	return lists

}

func sameIntSlice(x, y []int) bool {
	if len(x) != len(y) {
		return false
	}
	// create a map of int -> int
	diff := make(map[int]int, len(x))
	for _, _x := range x {
		// 0 value for int is 0, so just increment a counter for the int
		diff[_x]++
	}
	for _, _y := range y {
		// If the string _y is not in diff bail out early
		if _, ok := diff[_y]; !ok {
			return false
		}
		diff[_y] -= 1
		if diff[_y] == 0 {
			delete(diff, _y)
		}
	}
	if len(diff) == 0 {
		return true
	}
	return false
}
