//
//  SpiralMatrixII.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 26/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.
//
//  For example,
//  Given n = 3,
//
//  You should return the following matrix:
//  [
//  [ 1, 2, 3 ],
//  [ 8, 9, 4 ],
//  [ 7, 6, 5 ]
//  ]
//
//  Accepted. See [SpiralMatrixIITests](./LeetCodeTests/SpiralMatrixIITests.swift) for test cases.
//

import Foundation

class SpiralMatrixII {
    
    func generateMatrix(_ n: Int) -> [[Int]] {
        if n <= 0 {
            return []
        }
        if n == 1 {
            return [[1]]
        }
        
        var matrix = Array(repeating: (Array(repeating:0, count: n)), count: n)
        var centerX = n / 2
        if (n % 2) == 0 {
            centerX = (n - 1) / 2
        }
        var centerY = n / 2
        if (n % 2) == 0 {
            centerY = (n - 1) / 2
        }
        
        var i = 0
        var j = 0
        var depth = 0
        var result = 0
        while i <= centerY && j <= centerY && depth <= centerX && depth <= centerY {
            j = depth
            i = depth
            while j < (matrix[0].count - depth) {
                if matrix[i][j] == 0 {
                    result += 1
                    matrix[i][j] = result
                }
                 j += 1
            }
            j -= 1
            
            i += 1
            while i < (matrix.count - depth) {
                if matrix[i][j] == 0 {
                    result += 1
                    matrix[i][j] = result
                }
                i += 1
            }
            i -= 1
            
            j -= 1
            while j >= depth {
                if matrix[i][j] == 0 {
                    result += 1
                    matrix[i][j] = result
                }
                j -= 1
            }
            j += 1
            
            i -= 1
            while i > depth {
                if matrix[i][j] == 0 {
                    result += 1
                    matrix[i][j] = result
                }
                i -= 1
            }
            
            depth += 1
        }
        
        return matrix
    }
    
}
