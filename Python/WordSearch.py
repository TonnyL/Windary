# Given a 2D board and a word, find if the word exists in the grid.
#
# The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring.
# The same letter cell may not be used more than once.
#
# For example,
# Given board =
#
# [
# ['A','B','C','E'],
# ['S','F','C','S'],
# ['A','D','E','E']
# ]
# word = "ABCCED", -> returns true,
# word = "SEE", -> returns true,
# word = "ABCB", -> returns false.
#
# Python, Python3 all accepted.


class WordSearch:
    def exist(self, board, word):
        """
        :type board: List[List[str]]
        :type word: str
        :rtype: bool
        """
        if board is None:
            return False

        length_all = len(board)
        length_single = len(board[0])

        if length_all == 0 or length_single == 0:
            return False

        for i in range(length_all):
            for j in range(length_single):
                if self.search(board, i, j, word, 0):
                    return True

        return False

    def search(self, board, i, j, word, index):
        """
        :param board: List[List[str]]
        :param i: int
        :param j: int
        :param word: str
        :param index: int
        :return: bool
        """
        if index >= len(word):
            return True

        board_length = len(board)
        board_single_length = len(board[0])

        if i < 0 or i >= board_length or j < 0 or j >= board_single_length or board[i][j] != word[index]:
            return False

        board[i][j] = chr(ord(board[i][j]) ^ 255)
        res = self.search(board, i - 1, j, word, index + 1) or self.search(board, i + 1, j, word,
                                                                           index + 1) or self.search(board, i, j - 1,
                                                                                                     word,
                                                                                                     index + 1) or self.search(
            board, i, j + 1, word, index + 1)

        board[i][j] = chr(ord(board[i][j]) ^ 255)
        return res
