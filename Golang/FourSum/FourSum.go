package FourSum

import "sort"

func fourSum(nums []int, target int) [][]int {
	results := make([][]int, 0)
	sort.Ints(nums)
	numsLength := len(nums)

	for i := 0; i < numsLength-3; i++ {
		for j := i + 1; j < numsLength-2; j++ {
			left, right := j+1, numsLength-1
			for ; left < right; {
				sum := nums[i] + nums[j] + nums[left] + nums[right]
				if sum == target {
					tmp := []int{nums[i], nums[j], nums[left], nums[right]}

					exits := false
					for _, l := range results {
						if sameIntSlice(l, tmp) {
							exits = true
							break
						}
					}
					if !exits {
						results = append(results, tmp)
					}

					left++
					right--
				} else if sum < target {
					left++
				} else {
					right--
				}
			}
		}
	}

	return results;
}

func sameIntSlice(x, y []int) bool {
	if len(x) != len(y) {
		return false
	}
	// create a map of int -> int
	diff := make(map[int]int, len(x))
	for _, xx := range x {
		// 0 value for int is 0, so just increment a counter for the int
		diff[xx]++
	}
	for _, yy := range y {
		// If the string yy is not in diff bail out early
		if _, ok := diff[yy]; !ok {
			return false
		}
		diff[yy] -= 1
		if diff[yy] == 0 {
			delete(diff, yy)
		}
	}
	if len(diff) == 0 {
		return true
	}
	return false
}
