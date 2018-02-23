package PascalsTriangleII

//Given an index k, return the kth row of the Pascal's triangle.
//
//For example, given k = 3,
//Return [1,3,3,1].
//
//Note:
//Could you optimize your algorithm to use only O(k) extra space?
//
//Accepted.

func getRow(rowIndex int) []int {
	results := make([]int, 0)
	results = append(results, 1)

	if rowIndex == 0 {
		return results
	}

	for i := 0; i < rowIndex; i++ {
		results = append(results, 1)
		for j := len(results) - 2; j > 0; j-- {
			results[j] = results[j-1] + results[j]
		}
	}

	return results
}
