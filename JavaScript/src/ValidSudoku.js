/**
 * Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.
 * The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
 *
 * Accepted.
 */


/**
 * @param {char[][]} board
 * @return {boolean}
 */
let isValidSudoku = function (board) {
    if (board == null || (board.length !== 9 && board[0].length !== 9)) {
        return false;
    }

    let mapRow = new Map();
    let mapColumn = new Map();
    for (let i = 0; i < 9; i++) {
        for (let j = 0; j < 9; j++) {
            if (board[i][j] >= '1' && board[i][j] <= '9') {
                if (mapRow.get(board[i][j])) {
                    return false;
                } else {
                    mapRow.set(board[i][j], true);
                }
            } else if (board[i][j] !== '.') {
                return false;
            }

            if (board[j][i] >= '1' && board[j][i] <= '9') {
                if (mapColumn.get(board[j][i])) {
                    return false;
                } else {
                    mapColumn.set(board[j][i], true);
                }
            } else if (board[j][i] !== '.')
                return false;
        }
        mapRow.clear();
        mapColumn.clear();
    }

    let mapBlock = new Map();
    for (let i = 0; i < 9; i = i + 3) {
        for (let j = 0; j < 9; j = j + 3) {
            for (let m = 0; m < 3; m++) {
                for (let n = 0; n < 3; n++) {
                    if (board[i + m][j + n] >= '1' && board[i + m][j + n] <= '9') {
                        if (mapBlock.get(board[i + m][j + n])) {
                            return false;
                        } else {
                            mapBlock.set(board[i + m][j + n], true);
                        }
                    } else if (board[i + m][j + n] !== '.') {
                        return false;
                    }
                }
            }
            mapBlock.clear();
        }
    }

    return true;
};


if (!isValidSudoku([['1', '2', '3']])) {
    console.log("pass")
} else {
    console.error("failed")
}

if (!isValidSudoku([
        ['5', '3', '.', '.', '7', '.', '.', '.', '.'],
        ['6', '.', '.', '1', '9', '5', '.', '.', '.'],
        ['.', '9', '8', '.', '.', '.', '.', '6', '.'],
        ['8', '.', '.', '.', '6', '.', '.', '.', '3'],
        ['4', '.', '.', '8', '.', '3', '.', '.', '1'],
        ['7', '.', '.', '.', '2', '.', '.', '.', '6'],
        ['.', '6', '.', '.', '.', '.', '2', '8', '.'],
        ['.', '.', '.', '4', '1', '9', '.', '.', '7'], // Here is a 7.
        ['.', '.', '.', '.', '8', '.', '.', '7', '9']  // Here is another one.
    ])) {
    console.log("pass")
} else {
    console.error("failed")
}

if (isValidSudoku([
        ['5', '3', '.', '.', '7', '.', '.', '.', '.'],
        ['6', '.', '.', '1', '9', '5', '.', '.', '.'],
        ['.', '9', '8', '.', '.', '.', '.', '6', '.'],
        ['8', '.', '.', '.', '6', '.', '.', '.', '3'],
        ['4', '.', '.', '8', '.', '3', '.', '.', '1'],
        ['7', '.', '.', '.', '2', '.', '.', '.', '6'],
        ['.', '6', '.', '.', '.', '.', '2', '8', '.'],
        ['.', '.', '.', '4', '1', '9', '.', '.', '5'],
        ['.', '.', '.', '.', '8', '.', '.', '7', '9']
    ])) {
    console.log("pass")
} else {
    console.error("failed")
}