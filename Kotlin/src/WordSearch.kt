/**
 * Given a 2D board and a word, find if the word exists in the grid.
 *
 * The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring.
 * The same letter cell may not be used more than once.
 *
 * For example,
 * Given board =
 *
 * [
 * ['A','B','C','E'],
 * ['S','F','C','S'],
 * ['A','D','E','E']
 * ]
 * word = "ABCCED", -> returns true,
 * word = "SEE", -> returns true,
 * word = "ABCB", -> returns false.
 *
 * Accepted.
 */
class WordSearch {

    fun exist(board: Array<CharArray>, word: String): Boolean {
        if (board.isEmpty() || board[0].isEmpty()) {
            return false
        }
        for (i in board.indices) {
            (0 until board[0].size)
                    .filter {
                        search(board, i, it, word, 0)
                    }
                    .forEach {
                        return true
                    }
        }
        return false
    }

    private fun search(board: Array<CharArray>, i: Int, j: Int, word: String, index: Int): Boolean {
        if (index >= word.length) {
            return true
        }
        if (i < 0 || i >= board.size || j < 0 || j >= board[0].size || board[i][j] != word[index]) {
            return false
        }

        board[i][j] = (board[i][j].toInt() xor 255).toChar()
        val res = (search(board, i - 1, j, word, index + 1)
                || search(board, i + 1, j, word, index + 1)
                || search(board, i, j - 1, word, index + 1)
                || search(board, i, j + 1, word, index + 1))

        board[i][j] = (board[i][j].toInt() xor 255).toChar()

        return res
    }

}
