package SingleNumberII

//Given an array of integers, every element appears three times except for one, which appears exactly once. Find that single one.
//
//Note:
//Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
//
//Accepted.

func singleNumber(nums []int) int {
	one, two, three := 0, 0, 0
	for _, num := range nums {
		two |= one & num
		one ^= num
		three = one & two
		two -= three
		one -= three
	}
	return one
}
