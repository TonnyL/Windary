package ValidSudoku

//The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows
//like this: (you may want to display this pattern in a fixed font for better legibility)
//
//P   A   H   N
//A P L S I I G
//Y   I   R
//And then read line by line: "PAHNAPLSIIGYIR"
//Write the code that will take a string and make this conversion given a number of rows:
//
//string convert(string text, int nRows);
//convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
//Accepted.

func isValidSudoku(board [][]byte) bool {
	if board == nil || (len(board) != 9 && len(board[0]) != 9) {
		return false
	}

	mapRow := make(map[byte]bool)
	mapColumn := make(map[byte]bool)

	for i := 0; i < 9; i++ {
		for j := 0; j < 9; j++ {
			if board[i][j] >= '1' && board[i][j] <= '9' {
				if _, ok := mapRow[board[i][j]]; ok {
					return false
				} else {
					mapRow[board[i][j]] = true
				}
			} else if board[i][j] != '.' {
				return false
			}

			if board[j][i] >= '1' && board[j][i] <= '9' {
				if _, ok := mapColumn[board[j][i]]; ok {
					return false
				} else {
					mapColumn[board[j][i]] = true
				}
			} else if board[j][i] != '.' {
				return false
			}
		}

		for m := range mapRow {
			delete(mapRow, m)
		}

		for n := range mapColumn {
			delete(mapColumn, n)
		}

	}

	mapBlock := make(map[byte]bool)

	for i := 0; i < 9; i = i + 3 {
		for j := 0; j < 9; j = j + 3 {
			for m := 0; m < 3; m++ {
				for n := 0; n < 3; n++ {
					if board[i+m][j+n] >= '1' && board[i+m][j+n] <= '9' {
						if _, ok := mapBlock[board[i+m][j+n]]; ok {
							return false
						} else {
							mapBlock[board[i+m][j+n]] = true
						}
					} else if board[i+m][j+n] != '.' {
						return false
					}
				}
			}

			for k := range mapBlock {
				delete(mapBlock, k)
			}
		}
	}

	return true
}
