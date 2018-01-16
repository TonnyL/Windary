package SpiralMatrixII

//Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.
//
//For example,
//Given n = 3,
//
//You should return the following matrix:
//[
//[ 1, 2, 3 ],
//[ 8, 9, 4 ],
//[ 7, 6, 5 ]
//]
//
//

func generateMatrix(n int) [][]int {
	if n <= 0 {
		return [][]int{}
	}
	if n == 1 {
		return [][]int{{1}}
	}

	matrix := make([][]int, n)
	for i := range matrix {
		sub := make([]int, n)
		for j := range sub {
			sub[j] = 0
		}
		matrix[i] = sub
	}

	centerX, centerY := n/2, n/2
	if n%2 == 0 {
		centerX, centerY = (n-1)/2, (n-1)/2
	}

	i, j, depth, result := 0, 0, 0, 1

	for ; i <= centerX && j <= centerY && depth <= centerX && depth <= centerY; {
		j, i = depth, depth
		for ; j < len(matrix[0])-depth; j++ {
			if matrix[i][j] == 0 {
				matrix[i][j] = result
				result++
			}
		}

		j--
		i++
		for ; i < len(matrix)-depth; i++ {
			if matrix[i][j] == 0 {
				matrix[i][j] = result
				result++
			}
		}

		i--
		j--
		for ; j >= depth; j-- {
			if matrix[i][j] == 0 {
				matrix[i][j] = result
				result++
			}
		}

		j++
		i--
		for ; i > depth; i-- {
			if matrix[i][j] == 0 {
				matrix[i][j] = result
				result++
			}
		}

		depth++
	}

	return matrix
}
