package MinimumPathSum

//Given a m x n grid filled with non-negative numbers,
//find a path from top left to bottom right which minimizes the sum of all numbers along its path.
//
//Note: You can only move either down or right at any point in time.
//
//Example 1:
//[[1,3,1],
//[1,5,1],
//[4,2,1]]
//Given the above grid map, return 7. Because the path 1→3→1→1→1 minimizes the sum.
//
//Accepted.

func minPathSum(grid [][]int) int {
	gridLength := len(grid)
	if gridLength == 0 {
		return 0
	}

	gridSingleLength := len(grid[0])
	if gridLength == 1 {
		if gridSingleLength == 0 {
			return 0
		}
		if gridSingleLength == 1 {
			return grid[0][0]
		}
	}

	matrix := make([][]int, gridLength)
	for i := range matrix {
		subArray := make([]int, gridSingleLength)
		for j := range subArray {
			subArray[j] = 0
		}
		matrix[i] = subArray
	}
	matrix[0][0] = grid[0][0]

	for i := 1; i < gridLength; i++ {
		matrix[i][0] = matrix[i-1][0] + grid[i][0]
	}

	for i := 1; i < gridSingleLength; i++ {
		matrix[0][i] = matrix[0][i-1] + grid[0][i]
	}

	for i := 1; i < gridLength; i++ {
		for j := 1; j < gridSingleLength; j++ {
			matrix[i][j] = min(matrix[i-1][j]+grid[i][j], matrix[i][j-1]+grid[i][j])
		}
	}

	return matrix[gridLength-1][gridSingleLength-1]
}

func min(a int, b int) int {
	if a < b {
		return a
	}
	return b
}
