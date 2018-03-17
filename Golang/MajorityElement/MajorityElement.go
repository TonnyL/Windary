package MajorityElement

//Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
//
//You may assume that the array is non-empty and the majority element always exist in the array.
//
//Accepted.

func majorityElement(nums []int) int {
	m := make(map[int]int)

	for _, i := range nums {
		if _, ok := m[i]; ok {
			m[i]++
		} else {
			m[i] = 1
		}

		if m[i] > len(nums)/2 {
			return i
		}
	}

	return nums[0]
}
