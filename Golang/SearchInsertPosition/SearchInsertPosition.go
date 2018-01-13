package SearchInsertPosition

//Given a sorted array and a target value, return the index if the target is found. If not,
//return the index where it would be if it were inserted in order.
//You may assume no duplicates in the array.
//Here are few examples.
//
//[1,3,5,6], 5 → 2
//[1,3,5,6], 2 → 1
//[1,3,5,6], 7 → 4
//[1,3,5,6], 0 → 0
//
//Accepted.

func searchInsert(nums []int, target int) int {
	if nums == nil || len(nums) == 0 {
		return 0
	}

	length := len(nums)
	for i := 0; i < length; i++ {
		if nums[i] == target {
			return i
		} else if nums[i] < target {
			if (i+1 < length && nums[i+1] > target) || (i+1 == length) {
				return i + 1
			}
		}
	}
	return 0
}
