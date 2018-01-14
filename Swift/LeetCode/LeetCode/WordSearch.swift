//
//  WordSearch.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 14/01/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Given a 2D board and a word, find if the word exists in the grid.
//
//  The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring.
//  The same letter cell may not be used more than once.
//
//  For example,
//  Given board =
//
//  [
//  ['A','B','C','E'],
//  ['S','F','C','S'],
//  ['A','D','E','E']
//  ]
//  word = "ABCCED", -> returns true,
//  word = "SEE", -> returns true,
//  word = "ABCB", -> returns false.
//
//  Accepted. See [WordSearchTests](./LeetCodeTests/WordSearchTests.swift) for test cases.
//

import Foundation

class WordSearch {
    
    func exist(_ board: [[Character]], _ word: String) -> Bool {
        var boardArray = board
        if boardArray.isEmpty || boardArray[0].isEmpty {
            return false
        }
        
        for i in boardArray.indices {
            for j in boardArray[0].indices {
                if search(board: &boardArray, i, j, word, 0) {
                    return true
                }
            }
        }
        
        return false
    }
    
    func search(board: inout [[Character]], _ i: Int, _ j: Int, _ word: String, _ index: Int) -> Bool {
        if index >= word.count {
            return true
        }
        if i < 0 || i >= board.count || j < 0 || j >= board[0].count || board[i][j] != Array(word)[index] {
            return false
        }
        
        board[i][j] = Character(UnicodeScalar(board[i][j].unicodeScalars.first!.value ^ 255)!)
        let res = (search(board: &board, i - 1, j, word, index + 1)
            || search(board: &board, i + 1, j, word, index + 1)
            || search(board: &board, i, j - 1, word, index + 1)
            || search(board: &board, i, j + 1, word, index + 1))
        
        board[i][j] = Character(UnicodeScalar(board[i][j].unicodeScalars.first!.value ^ 255)!)
        
        return res
    }
    
}
