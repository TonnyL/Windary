package JumpGame

//
//Given an array of non-negative integers, you are initially positioned at the first index of the array.
//
//Each element in the array represents your maximum jump length at that position.
// 
//Determine if you are able to reach the last index.
// 
//For example:
//A = [2,3,1,1,4], return true.
//
//A = [3,2,1,0,4], return false.
//
//Accepted.

func canJump(nums []int) bool {

	if nums == nil || len(nums) == 0 {
		return false
	}

	if len(nums) == 1 {
		return true
	}

	maxLength := 0
	for i := 0; i < len(nums)-1; i++ {
		maxLength--
		maxLength = max(maxLength, nums[i])

		if maxLength == 0 {
			return false
		}
	}

	return maxLength > 0
}

func max(a int, b int) int {
	if a > b {
		return a
	}
	return b
}
