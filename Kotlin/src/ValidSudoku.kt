/**
 * Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.
 * The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
 *
 * Accepted.
 */
class ValidSudoku {

    fun isValidSudoku(board: Array<CharArray>?): Boolean {
        if (board == null || board.size != 9 && board[0].size != 9) {
            return false
        }

        val mapRow = mutableMapOf<Char, Boolean>()
        val mapColumn = mutableMapOf<Char, Boolean>()
        for (i in 0..8) {
            for (j in 0..8) {
                if (board[i][j] in '1'..'9') {
                    if (mapRow.getOrDefault(board[i][j], false)) {
                        return false
                    } else {
                        mapRow.put(board[i][j], true)
                    }
                } else if (board[i][j] != '.') {
                    return false
                }

                if (board[j][i] in '1'..'9') {
                    if (mapColumn.getOrDefault(board[j][i], false)) {
                        return false
                    } else {
                        mapColumn.put(board[j][i], true)
                    }
                } else if (board[j][i] != '.') {
                    return false
                }
            }
            mapRow.clear()
            mapColumn.clear()
        }

        val mapBlock = mutableMapOf<Char, Boolean>()
        for (i in 0..8 step 3) {
            for (j in 0..8 step 3) {
                for (m in 0..2) {
                    for (n in 0..2) {
                        if (board[i + m][j + n] in '1'..'9') {
                            if (mapBlock.getOrDefault(board[i + m][j + n], false)) {
                                return false
                            } else {
                                mapBlock.put(board[i + m][j + n], true)
                            }
                        } else if (board[i + m][j + n] != '.') {
                            return false
                        }
                    }
                }
                mapBlock.clear()
            }
        }

        return true
    }

}
