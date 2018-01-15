package ThreeSum

//Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0?
//Find all unique triplets in the array which gives the sum of zero.
//
//Note: The solution set must not contain duplicate triplets.
//
//For example, given array S = [-1, 0, 1, 2, -1, -4],
//
//A solution set is:
//[
//[-1, 0, 1],
//[-1, -1, 2]
//]
//
//Accepted.

import (
	"sort"
)

func threeSum(nums []int) [][]int {
	sort.Ints(nums)
	set := make(map[[3]int]*Triple)

	for first := 0; first < len(nums)-2; first++ {
		if nums[first] > 0 {
			break
		}

		target := 0 - nums[first]
		second := first + 1
		third := len(nums) - 1

		for ; second < third; {
			if nums[second]+nums[third] == target {

				key := [3]int{nums[first], nums[second], nums[third]}

				if _, ok := set[key]; !ok {
					set[key] = &Triple{
						a: nums[first],
						b: nums[second],
						c: nums[third],
					}
				}

				for ; second < third && nums[second] == nums[second+1]; {
					second++
				}
				for ; second < third && nums[third] == nums[third-1]; {
					third--
				}
				second++
				third--
			} else if nums[second]+nums[third] < target {
				second++
			} else {
				third--
			}
		}
	}

	lists := make([][]int, 0)
	for _, v := range set {
		l := make([]int, 0)
		l = append(l, v.a)
		l = append(l, v.b)
		l = append(l, v.c)
		lists = append(lists, l)
	}

	return lists
}

type Triple struct {
	a int
	b int
	c int
}
