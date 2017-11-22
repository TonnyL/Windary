# -*- coding: UTF-8 -*-
#
# Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.
# The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
#
# Python, Python 3 all accepted.
class ValidSudoku:
    def isValidSudoku(self, board):
        """
        :type board: List[List[str]]
        :rtype: bool
        """
        if board is None or board[0] is None or len(board) != 9 or len(board[0]) != 9:
            return False

        map_row = {}
        map_column = {}
        for i in range(9):
            for j in range(9):
                if ord('1') <= ord(board[i][j]) <= ord('9'):
                    if map_row.get(board[i][j], False):
                        return False
                    else:
                        map_row[board[i][j]] = True
                elif board[i][j] != '.':
                    return False

                if ord('1') <= ord(board[j][i]) <= ord('9'):
                    if map_column.get(board[j][i], False):
                        return False
                    else:
                        map_column[board[j][i]] = True
                elif board[j][i] != '.':
                    return False
            map_row.clear()
            map_column.clear()

        map_block = {}
        for i_another in range(0, 9, 3):
            for j_another in range(0, 9, 3):
                for m in range(3):
                    for n in range(3):
                        if ord('1') <= ord(board[i_another + m][j_another + n]) <= ord('9'):
                            if map_block.get(board[i_another + m][j_another + n], False):
                                return False
                            else:
                                map_block[board[i_another + m][j_another + n]] = True
                        elif board[i_another + m][j_another + n] != '.':
                            return False
                map_block.clear()

        return True


vs = ValidSudoku()

# Expected: False
print(vs.isValidSudoku([['1', '2', '3']]))

# Expected: False
print(vs.isValidSudoku([
    ['5', '3', '.', '.', '7', '.', '.', '.', '.'],
    ['6', '.', '.', '1', '9', '5', '.', '.', '.'],
    ['.', '9', '8', '.', '.', '.', '.', '6', '.'],
    ['8', '.', '.', '.', '6', '.', '.', '.', '3'],
    ['4', '.', '.', '8', '.', '3', '.', '.', '1'],
    ['7', '.', '.', '.', '2', '.', '.', '.', '6'],
    ['.', '6', '.', '.', '.', '.', '2', '8', '.'],
    ['.', '.', '.', '4', '1', '9', '.', '.', '7'],  # Here is a 7.
    ['.', '.', '.', '.', '8', '.', '.', '7', '9']  # Here is another one.
]))

# Expected: True
print(vs.isValidSudoku([
    ['5', '3', '.', '.', '7', '.', '.', '.', '.'],
    ['6', '.', '.', '1', '9', '5', '.', '.', '.'],
    ['.', '9', '8', '.', '.', '.', '.', '6', '.'],
    ['8', '.', '.', '.', '6', '.', '.', '.', '3'],
    ['4', '.', '.', '8', '.', '3', '.', '.', '1'],
    ['7', '.', '.', '.', '2', '.', '.', '.', '6'],
    ['.', '6', '.', '.', '.', '.', '2', '8', '.'],
    ['.', '.', '.', '4', '1', '9', '.', '.', '5'],
    ['.', '.', '.', '.', '8', '.', '.', '7', '9']]))
