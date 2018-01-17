import java.util.HashMap;
import java.util.Map;

/**
 * Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.
 * The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
 * <p>
 * Accepted.
 */
public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        if (board == null || (board.length != 9 && board[0].length != 9)) {
            return false;
        }

        Map<Character, Boolean> mapRow = new HashMap<>();
        Map<Character, Boolean> mapColumn = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] >= '1' && board[i][j] <= '9') {
                    if (mapRow.getOrDefault(board[i][j], false)) {
                        return false;
                    } else {
                        mapRow.put(board[i][j], true);
                    }
                } else if (board[i][j] != '.') {
                    return false;
                }

                if (board[j][i] >= '1' && board[j][i] <= '9') {
                    if (mapColumn.getOrDefault(board[j][i], false)) {
                        return false;
                    } else {
                        mapColumn.put(board[j][i], true);
                    }
                } else if (board[j][i] != '.')
                    return false;
            }
            mapRow.clear();
            mapColumn.clear();
        }

        Map<Character, Boolean> mapBlock = new HashMap<>();
        for (int i = 0; i < 9; i = i + 3) {
            for (int j = 0; j < 9; j = j + 3) {
                for (int m = 0; m < 3; m++) {
                    for (int n = 0; n < 3; n++) {
                        if (board[i + m][j + n] >= '1' && board[i + m][j + n] <= '9') {
                            if (mapBlock.getOrDefault(board[i + m][j + n], false)) {
                                return false;
                            } else {
                                mapBlock.put(board[i + m][j + n], true);
                            }
                        } else if (board[i + m][j + n] != '.') {
                            return false;
                        }
                    }
                }
                mapBlock.clear();
            }
        }

        return true;
    }

    public static void main(String[] args) {
        ValidSudoku vs = new ValidSudoku();

        // false
        System.out.println(vs.isValidSudoku(new char[][]{
                {'1', '2', '3'}
        }));

        // false
        System.out.println(vs.isValidSudoku(new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '7'}, // Here is a 7.
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}  // Here is another one.
        }));

        // true
        System.out.println(vs.isValidSudoku(new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}}));
    }

}
