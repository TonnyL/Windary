package RemoveElement

//Given an array and a value, remove all instances of that value in place and return the new length.
//Do not allocate extra space for another array, you must do this in place with constant memory.
//The order of elements can be changed. It doesn't matter what you leave beyond the new length.
//Example:
//Given input array nums = [3,2,2,3], val = 3
//Your function should return length = 2, with the first two elements of nums being 2.
//
//Accepted.

func removeElement(nums []int, val int) int {
	length := len(nums)
	if length == 0 {
		return 0
	}
	if length == 1 {
		if nums[0] == val {
			return 0
		}
		return 1
	}

	lastIndex := length - 1
	for i := 0; i < lastIndex; i++ {
		if nums[i] == val {
			exchange2values(nums, i, lastIndex);
			lastIndex--

			for ; lastIndex > i && nums[i] == val; {
				exchange2values(nums, i, lastIndex)
				lastIndex--
			}
		}
	}

	for i := 0; i < length; i++ {
		if nums[i] == val {
			return i
		}
	}

	return length
}

func exchange2values(nums []int, i, lastIndex int) {
	if lastIndex >= i && i >= 0 {
		tmp := nums[lastIndex]
		nums[lastIndex] = nums[i]
		nums[i] = tmp
	}
}
