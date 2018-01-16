package Permutations

//Given a collection of distinct numbers, return all possible permutations.
//
//For example,
//[1,2,3] have the following permutations:
//[
//[1,2,3],
//[1,3,2],
//[2,1,3],
//[2,3,1],
//[3,1,2],
//[3,2,1]
//]
//
//Accepted.

func permute(nums []int) [][]int {
	results := make([][]int, 0)

	length := len(nums)
	if length == 0 {
		return results
	}
	if length == 1 {
		results = append(results, []int{nums[0]})
		return results
	}

	ints := nums[0:length-1]
	for _, l := range permute(ints) {
		for i := 0; i < len(l)+1; i++ {
			tmp := make([]int, 0)
			tmp = append(tmp, l...)

			rear := append([]int{}, tmp[i:]...)
			tmp = append(tmp[0:i], nums[length-1])
			tmp = append(tmp, rear...)

			results = append(results, tmp)
		}
	}

	return results
}
