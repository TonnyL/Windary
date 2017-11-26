//
//  UniquePaths.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 26/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  matrix robot is located at the top-left corner of matrix m x n grid (marked 'Start' in the diagram below).
//  The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right
//  corner of the grid (marked 'Finish' in the diagram below).
//  How many possible unique paths are there?
//
//  Note: m and n will be at most 100.
//
//  Accepted. See [UniquePathsTests](./LeetCodeTests/UniquePathsTests.swift) for test cases.
//

import Foundation

class UniquePaths {
    
    func uniquePaths(_ m: Int, _ n: Int) -> Int {
        if m == 1 || n == 1 {
            return 1
        }
        
        var matrix = Array(repeating: Array(repeating: 1, count: n), count: m)
        for i in 1...(m - 1) {
            for j in 1...(n - 1) {
                matrix[i][j] = matrix[i - 1][j] + matrix[i][j - 1]
            }
        }
        
        // print(matrix)
        return matrix[m - 1][n - 1]
    }
    
}
