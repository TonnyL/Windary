package ThreeSumClosest

import "sort"

//Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target.
//Return the sum of the three integers.
//You may assume that each input would have exactly one solution.
//
//For example, given array S = {-1 2 1 -4}, and target = 1.
//
//The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
//
//Accepted.

func threeSumClosest(nums []int, target int) int {
	sort.Ints(nums)

	result := nums[0] + nums[1] + nums[2]
	for i := 0; i < len(nums)-2; i++ {
		l, r := i+1, len(nums)-1
		for ; l < r; {
			tmp := nums[i] + nums[l] + nums[r]
			if tmp == target {
				return tmp
			}
			if abs(tmp-target) < abs(result-target) {
				result = tmp
			}
			if tmp < target {
				l++
			} else if tmp > target {
				r--
			}
		}
	}

	return result
}

func abs(a int) int {
	if a < 0 {
		return -a
	}
	return a
}
