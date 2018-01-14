package WordSearch

//Given a 2D board and a word, find if the word exists in the grid.
//
//The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring.
//The same letter cell may not be used more than once.
//
//For example,
//Given board =
//
//[
//['A','B','C','E'],
//['S','F','C','S'],
//['A','D','E','E']
//]
//word = "ABCCED", -> returns true,
//word = "SEE", -> returns true,
//word = "ABCB", -> returns false.
//
//Accepted.

func exist(board [][]byte, word string) bool {
	boardLength := len(board)
	boardSingleLength := len(board[0])

	if boardLength == 0 || boardSingleLength == 0 {
		return false
	}

	for i := 0; i < boardLength; i++ {
		for j := 0; j < boardSingleLength; j++ {
			if search(board, i, j, word, 0) {
				return true
			}
		}
	}

	return false
}

func search(board [][]byte, i int, j int, word string, index int) bool {
	if index >= len(word) {
		return true
	}
	boardLength := len(board)
	boardSingleLength := len(board[0])

	if i < 0 || i >= boardLength || j < 0 || j >= boardSingleLength || board[i][j] != word[index] {
		return false
	}

	board[i][j] ^= 255
	res := search(board, i-1, j, word, index+1) || search(board, i+1, j, word, index+1) || search(board, i, j-1, word, index+1) || search(board, i, j+1, word, index+1)

	board[i][j] ^= 255

	return res
}
