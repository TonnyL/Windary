//
//  SetMatrixZeroes.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 27/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in place.
//
//  Accepted. See [SetMatrixZeroes](./LeetCodeTests/SetMatrixZeroesTests.swift) for test cases.
//

import Foundation

class SetMatrixZeroes {
    
    func setZeroes(_ matrix: inout [[Int]]) {
        if matrix.isEmpty || matrix[0].isEmpty {
            return
        }
        
        var row = Set<Int>.init()
        var column = Set<Int>.init()
        
        for i in matrix.indices {
            for j in matrix[0].indices {
                if matrix[i][j] == 0 {
                    row.insert(i)
                    column.insert(j)
                }
            }
        }
        
        for i in row {
            for k in matrix[0].indices {
                matrix[i][k] = 0
            }
        }
        
        for i in column {
            for k in matrix.indices {
                matrix[k][i] = 0
            }
        }
        
        // print(matrix)
    }
    
}
