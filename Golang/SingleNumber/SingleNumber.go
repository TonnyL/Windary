package SingleNumber

//Given an array of integers, every element appears twice except for one. Find that single one.
//
//Note:
//Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
//
//Accepted.

func singleNumber(nums []int) int {
	sum := 0
	if nums == nil {
		return sum
	}
	for _, x := range nums {
		sum ^= x
	}
	return sum
}
