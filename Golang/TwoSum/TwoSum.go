package TwoSum

//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//Given nums = [2, 7, 11, 15], target = 9,
//Because nums[0] + nums[1] = 2 + 7 = 9,
//return [0, 1].
//
//Result: Accepted

func twoSum(nums []int, target int) []int {

	numsLength := len(nums)
	for i := 0; i < numsLength; i++ {
		for j := i + 1; j < numsLength; j++ {
			if target == (nums[i] + nums[j]) {
				return []int{i, j}
			}
		}
	}

	return []int{0, 0}
}