//
//  ValidSudoku.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 26/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.
//  The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
//
//  Accepted. See [ValidSudokuTests](./LeetCodeTests/ValidSudokuTests.swift) for test cases.
//

import Foundation

class ValidSudoku {
    
    func isValidSudoku(_ board: [[Character]]) -> Bool {
        if board.count != 9 || board[0].count != 9 {
            return false
        }
        
        var mapRow: [Character: Bool?] = [:]
        var mapColumn: [Character: Bool?] = [:]
        let oneAsciiValue = "1".unicodeScalars.first!.value
        let nineAsciiValue = "9".unicodeScalars.first!.value
        for i in board.indices {
            for j in board[i].indices {
                let asciiValueIJ = board[i][j].unicodeScalars.first!.value
                
                if asciiValueIJ >= oneAsciiValue && asciiValueIJ <= nineAsciiValue {
                    if mapRow[board[i][j]] != nil{
                        return false
                    } else {
                        mapRow[board[i][j]] = true
                    }
                } else if board[i][j] != "." {
                    return false
                }
                
                let asciiValueJI = board[j][i].unicodeScalars.first!.value
                
                if asciiValueJI >= oneAsciiValue && asciiValueJI <= nineAsciiValue {
                    if mapColumn[board[j][i]] != nil {
                        return false
                    } else {
                        mapColumn[board[j][i]] = true
                    }
                } else if board[j][i] != "." {
                    return false
                }
            }
            mapRow.removeAll()
            mapColumn.removeAll()
        }
        
        var mapBlock: [Character: Bool?] = [:]
        for i in [0, 3, 6] {
            for j in [0, 3, 6] {
                for m in 0...2 {
                    for n in 0...2 {
                        let asciiValueImJn = board[i + m][j + n].unicodeScalars.first!.value
                        if asciiValueImJn >= oneAsciiValue && asciiValueImJn <= nineAsciiValue {
                            if mapBlock[board[i + m][j + n]] != nil {
                                return false
                            } else {
                                mapBlock[board[i + m][j + n]] = true
                            }
                        }
                    }
                }
                mapBlock.removeAll()
            }
        }
        
        return true
    }
    
}
