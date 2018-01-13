package SetMatrixZeroes

//Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in place.
//
//Accepted.

func setZeroes(matrix [][]int) {
	rowLength := len(matrix)
	columnLength := len(matrix[0])
	if rowLength == 0 || columnLength == 0 {
		return
	}

	rowSet := map[int]bool{}
	columnSet := map[int]bool{}

	for i := 0; i < rowLength; i++ {
		for j := 0; j < columnLength; j++ {
			if matrix[i][j] == 0 {
				rowSet[i] = true
				columnSet[j] = true
			}
		}
	}

	for key := range rowSet {
		for k := 0; k < columnLength; k++ {
			matrix[key][k] = 0
		}
	}

	for key := range columnSet {
		for k := 0; k < rowLength; k++ {
			matrix[k][key] = 0
		}
	}
}
