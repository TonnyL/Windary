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


/**
 * @param {char[][]} board
 * @param {string} word
 * @return {boolean}
 */
let exist = function (board, word) {
    if (board == null || board.length === 0 || board[0].length === 0) {
        return false;
    }
    for (let i = 0; i < board.length; i++) {
        for (let j = 0; j < board[0].length; j++) {
            if (search(board, i, j, word, 0)) {
                return true;
            }
        }
    }
    return false;
};

/**
 * @param {char[][]} board
 * @param {number} i
 * @param {number} j
 * @param {string} word
 * @param {number} index
 * @returns {boolean}
 */
let search = function (board, i, j, word, index) {
    if (index >= word.length) {
        return true;
    }
    if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j].charCodeAt(0) !== word.charAt(index).charCodeAt(0)) {
        return false;
    }

    board[i][j] = String.fromCharCode(board[i][j].charCodeAt(0) ^ 255);
    let res = search(board, i - 1, j, word, index + 1)
        || search(board, i + 1, j, word, index + 1)
        || search(board, i, j - 1, word, index + 1)
        || search(board, i, j + 1, word, index + 1);

    board[i][j] = String.fromCharCode(board[i][j].charCodeAt(0) ^ 255);

    return res;
};


if (!exist([], "AB")) {
    console.log("pass")
} else {
    console.error("failed")
}

if (!exist(null, "AB")) {
    console.log("pass")
} else {
    console.error("failed")
}

let chars = [
    ['A', 'B', 'C', 'E'],
    ['S', 'F', 'C', 'S'],
    ['A', 'D', 'E', 'E']];

if (exist(chars, "ABCCED")) {
    console.log("pass")
} else {
    console.error("failed")
}

if (exist(chars, "SEE")) {
    console.log("pass")
} else {
    console.error("failed")
}

if (!exist(chars, "ABCB")) {
    console.log("pass")
} else {
    console.error("failed")
}