package NextPermutation

//Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.
//
//If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).
//
//The replacement must be in-place, do not allocate extra memory.
//
//Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.
//1,2,3 → 1,3,2
//3,2,1 → 1,2,3
//1,1,5 → 1,5,1
//
//Accepted.

func nextPermutation(nums []int) {
	i := len(nums) - 2
	for ; i >= 0 && nums[i] >= nums[i+1]; {
		i--
	}
	if i >= 0 {
		j := len(nums) - 1
		for ; nums[j] <= nums[i]; {
			j--
		}
		nums[i], nums[j] = nums[j], nums[i]
	}
	i, j := i+1, len(nums)-1
	for ; i < j; {
		nums[i], nums[j] = nums[j], nums[i]
		i += 1
		j -= 1
	}
}
