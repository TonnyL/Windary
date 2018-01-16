package RemoveDuplicatesFromSortedArrayII

//Follow up for "Remove Duplicates":
//What if duplicates are allowed at most twice?
//
//For example,
//Given sorted array nums = ,
//
//Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3. 
//It doesn't matter what you leave beyond the new length.
//
//Accepted.

func removeDuplicates(nums []int) int {
	if nums == nil {
		return 0
	}
	if len(nums) <= 2 {
		return len(nums)
	}

	i := 0
	for ; i < len(nums)-2; {
		if nums[i+1] == nums[i] && nums[i+2] == nums[i] {
			nums = removeIndex(nums, i+2)
		} else {
			i += 1
		}
	}

	return len(nums)
}

func removeIndex(s []int, index int) []int {
	return append(s[:index], s[index+1:]...)
}
