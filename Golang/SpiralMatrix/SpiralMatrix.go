package SpiralMatrix

//Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
//
//For example,
//Given the following matrix:
//
//[
//[ 1, 2, 3 ],
//[ 4, 5, 6 ],
//[ 7, 8, 9 ]
//]
//You should return [1,2,3,6,9,8,7,4,5].
//
//Accepted.

func spiralOrder(matrix [][]int) []int {
	matrixLength := len(matrix)

	if matrixLength == 0 {
		return []int{}
	}

	matrixSingleLength := len(matrix[0])
	if matrixSingleLength == 0 {
		return []int{}
	}

	result := make([]int, 0)
	added := make([][]bool, matrixLength)

	for i := range added {
		sub := make([]bool, matrixSingleLength)
		for j := range sub {
			sub[j] = false
		}
		added[i] = sub
	}

	if matrixLength == 1 {
		for _, i := range matrix[0] {
			result = append(result, i)
		}
		return result
	}

	if matrixSingleLength == 1 {
		for _, ints := range matrix {
			result = append(result, ints[0])
		}
		return result
	}

	centerX, centerY := matrixLength/2, matrixSingleLength/2
	if matrixLength%2 == 0 {
		centerX = (matrixLength - 1) / 2
	}
	if matrixSingleLength%2 == 0 {
		centerY = (matrixSingleLength - 1) / 2
	}

	i, j, depth := 0, 0, 0
	for ; i <= centerX && j <= centerY && depth <= centerX && depth <= centerY; {
		j, i = depth, depth
		for ; j < matrixSingleLength-depth; j++ {
			if !added[i][j] {
				result = append(result, matrix[i][j])
				added[i][j] = true
			}
		}

		j--
		i++
		for ; i < matrixLength-depth; i++ {
			if !added[i][j] {
				result = append(result, matrix[i][j])
				added[i][j] = true
			}
		}

		i--
		j--
		for ; j >= depth; j-- {
			if !added[i][j] {
				result = append(result, matrix[i][j])
				added[i][j] = true
			}
		}

		j++
		i--
		for ; i > depth; i-- {
			if !added[i][j] {
				result = append(result, matrix[i][j])
				added[i][j] = true
			}
		}

		depth++
	}

	return result
}
