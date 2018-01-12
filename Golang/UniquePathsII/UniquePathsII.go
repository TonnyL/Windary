package UniquePathsII

//matrix robot is located at the top-left corner of matrix m x n grid (marked 'Start' in the diagram below).
//The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right
//corner of the grid (marked 'Finish' in the diagram below).
//How many possible unique paths are there?
//
//Note: m and n will be at most 100.
//
//Accepted.

func uniquePathsWithObstacles(obstacleGrid [][]int) int {
	matrixRowLength := len(obstacleGrid)
	matrixColumnLength := len(obstacleGrid[0])

	if obstacleGrid[0][0] == 1 {
		return 0
	}
	if matrixRowLength == 1 {
		for _, i := range obstacleGrid[0] {
			if i == 1 {
				return 0
			}
		}
		return 1
	}

	matrix := make([][]int, matrixRowLength)
	//Init the slice.
	for i := range matrix {
		subArray := make([]int, matrixColumnLength)
		for j := range subArray {
			subArray[j] = 0
		}
		matrix[i] = subArray
	}

	for i := 0; i < matrixRowLength; i++ {
		if obstacleGrid[i][0] == 1 {
			for j := i; j < matrixRowLength; j++ {
				matrix[j][0] = 0
			}
			break
		} else {
			matrix[i][0] = 1
		}
	}

	for i := 0; i < matrixColumnLength; i++ {
		if obstacleGrid[0][i] == 1 {
			for j := i; j < matrixColumnLength; j++ {
				matrix[0][i] = 0
			}
			break
		} else {
			matrix[0][i] = 1
		}
	}

	for i := 1; i < matrixRowLength; i++ {
		for j := 1; j < len(matrix[0]); j++ {
			if obstacleGrid[i][j] == 1 {
				matrix[i][j] = 0
			} else {
				matrix[i][j] = matrix[i-1][j] + matrix[i][j-1]
			}
		}
	}

	return matrix[matrixRowLength-1][matrixColumnLength-1]
}
