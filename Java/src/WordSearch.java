/**
 * Given a 2D board and a word, find if the word exists in the grid.
 * <p>
 * The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring.
 * The same letter cell may not be used more than once.
 * <p>
 * For example,
 * Given board =
 * <p>
 * [
 * ['A','B','C','E'],
 * ['S','F','C','S'],
 * ['A','D','E','E']
 * ]
 * word = "ABCCED", -> returns true,
 * word = "SEE", -> returns true,
 * word = "ABCB", -> returns false.
 * <p>
 * Accepted.
 */
public class WordSearch {

    public boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0 || board[0].length == 0) {
            return false;
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (search(board, i, j, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean search(char[][] board, int i, int j, String word, int index) {
        if (index >= word.length()) {
            return true;
        }
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(index)) {
            return false;
        }

        board[i][j] ^= 255;
        boolean res = search(board, i - 1, j, word, index + 1)
                || search(board, i + 1, j, word, index + 1)
                || search(board, i, j - 1, word, index + 1)
                || search(board, i, j + 1, word, index + 1);

        board[i][j] ^= 255;

        return res;
    }

    public static void main(String[] args) {
        WordSearch ws = new WordSearch();

        // Expected: false
        System.out.println(ws.exist(new char[][]{{}}, "AB"));

        // Expected: false
        System.out.println(ws.exist(null, "AB"));

        char[][] chars = new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}};

        // Expected: true
        System.out.println(ws.exist(chars, "ABCCED"));

        // Expected: true
        System.out.println(ws.exist(chars, "SEE"));

        // Expected: false
        System.out.println(ws.exist(chars, "ABCB"));
    }

}
