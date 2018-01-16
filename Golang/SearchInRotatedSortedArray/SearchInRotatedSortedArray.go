package SearchInRotatedSortedArray

//Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
//(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
//You are given nums target value to search. If found in the array return its index, otherwise return -1.
//You may assume no duplicate exists in the array.
//
//Accepted.

func search(nums []int, target int) int {
	if nums == nil || len(nums) == 0 {
		return -1
	}

	l, r := 0, len(nums)-1
	for ; l <= r; {
		m := (l + r) / 2
		if nums[m] == target {
			return m
		}
		if nums[m] >= nums[l] {
			if nums[l] <= target && target < nums[m] {
				r = m - 1
			} else {
				l = m + 1
			}
		} else {
			if nums[m] < target && target <= nums[r] {
				l = m + 1
			} else {
				r = m - 1
			}
		}
	}

	return -1
}
