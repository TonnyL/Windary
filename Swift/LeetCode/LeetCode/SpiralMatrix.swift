//
//  SpiralMatrix.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 26/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
//
//  For example,
//  Given the following matrix:
//
//  [
//  [ 1, 2, 3 ],
//  [ 4, 5, 6 ],
//  [ 7, 8, 9 ]
//  ]
//  You should return [1,2,3,6,9,8,7,4,5].
//
//  Accepted. See [SpiralMatrixTests](./LeetCodeTests/SpiralMatrixTests.swift) for test cases.
//

import Foundation

class SpiralMatrix {
    
    func spiralOrder(_ matrix: [[Int]]) -> [Int] {
        if matrix.isEmpty || matrix[0].isEmpty {
            return []
        }
        
        var result: [Int] = []
        var added = Array(repeating: (Array(repeating:false, count:matrix[0].count)), count: matrix.count)
        
        if matrix.count == 1 {
            for i in matrix[0] {
                result.append(i)
            }
            return result
        }
        
        if matrix[0].count == 1 {
            for ints in matrix {
                result.append(ints[0])
            }
            return result
        }
        
        var centerX = matrix.count / 2
        if (matrix.count % 2) == 0 {
            centerX = ((matrix.count - 1) / 2)
        }
        var centerY = matrix[0].count / 2
        if (matrix[0].count % 2) == 0 {
            centerY = ((matrix[0].count - 1) / 2)
        }
        
        var i = 0
        var j = 0
        var depth = 0
        while i <= centerX && j <= centerY && depth <= centerX && depth <= centerY {
            j = depth
            i = depth
            while j < (matrix[0].count - depth) {
                if !added[i][j] {
                    result.append(matrix[i][j])
                    added[i][j] = true
                }
                j += 1
            }
            j -= 1
            
            i += 1
            while i < (matrix.count - depth) {
                if !added[i][j] {
                    result.append(matrix[i][j])
                    added[i][j] = true
                }
                i += 1
            }
            i -= 1
            
            j -= 1
            while j >= depth {
                if !added[i][j] {
                    result.append(matrix[i][j])
                    added[i][j] = true
                }
                j -= 1
            }
            j += 1
            
            i -= 1
            while i > depth {
                if !added[i][j] {
                    result.append(matrix[i][j])
                    added[i][j] = true
                }
                i -= 1
            }
            
            depth += 1
        }
        
        return result
    }
    
}
