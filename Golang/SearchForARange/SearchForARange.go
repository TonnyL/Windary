package SearchForARange

//Given an array of integers sorted in ascending order, find the starting and ending position of a given target value.
//
//Your algorithm's runtime complexity must be in the order of O(log n).
//
//If the target is not found in the array, return [-1, -1].
//
//For example,
//Given [5, 7, 7, 8, 8, 10] and target value 8,
//return [3, 4].
//
//Accepted.

func searchRange(nums []int, target int) []int {
	result := []int{-1, -1}
	if len(nums) <= 0 {
		return result
	}

	for i := 0; i < len(nums); i++ {
		if nums[i] == target {
			result[0] = i
			break
		}
	}

	for j := len(nums) - 1; j >= 0; j-- {
		if nums[j] == target {
			result[1] = j
			break
		}
	}

	return result
}
