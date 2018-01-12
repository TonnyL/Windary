package UniquePaths

//matrix robot is located at the top-left corner of matrix m x n grid (marked 'Start' in the diagram below).
//The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right
//corner of the grid (marked 'Finish' in the diagram below).
//How many possible unique paths are there?
//
//Note: m and n will be at most 100.
//
//Accepted.

func uniquePaths(m int, n int) int {
	if m == 1 || n == 1 {
		return 1
	}

	matrix := make([][]int, m)
	//Init the slice.
	for i := range matrix {
		subArray := make([]int, n)
		for j := range subArray {
			subArray[j] = 0
		}
		matrix[i] = subArray
	}

	for i := 0; i < m; i++ {
		matrix[i][0] = 1
	}
	for i := 0; i < n; i++ {
		matrix[0][i] = 1
	}
	for i := 1; i < m; i++ {
		for j := 1; j < n; j++ {
			matrix[i][j] = matrix[i-1][j] + matrix[i][j-1]
		}
	}

	return matrix[m-1][n-1]
}
