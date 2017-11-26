//
//  MinimumPathSum.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 26/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Given a m x n grid filled with non-negative numbers,
//  find a path from top left to bottom right which minimizes the sum of all numbers along its path.
//
//  Note: You can only move either down or right at any point in time.
//
//  Example 1:
//  [[1,3,1],
//  [1,5,1],
//  [4,2,1]]
//  Given the above grid map, return 7. Because the path 1→3→1→1→1 minimizes the sum.
//
//  Accepted. See [MinimumPathSumTests](./LeetCodeTests/MinimumPathSumTests.swift) for test cases.
//

import Foundation

class MinimumPathSum {
    
    func minPathSum(_ grid: [[Int]]) -> Int {
        if grid.isEmpty {
            return 0
        }
        if grid.count == 1 {
            if grid[0].count == 0 {
                return 0
            }
            if grid[0].count == 1 {
                return grid[0][0]
            }
        }
        
        var matrix = Array(repeating: Array(repeating: 0, count: grid[0].count), count: grid.count)
        matrix[0][0] = grid[0][0]
        
        var i = 1
        while i < grid.count {
            matrix[i][0] = matrix[i - 1][0] + grid[i][0]
            i += 1
        }
        
        i = 1
        while i < grid[0].count {
            matrix[0][i] = matrix[0][i - 1] + grid[0][i]
            i += 1
        }
        
        i = 1
        while i < grid.count {
            var j = 1
            while j < grid[0].count {
                matrix[i][j] = min(matrix[i - 1][j] + grid[i][j], matrix[i][j - 1] + grid[i][j])
                j += 1
            }
            i += 1
        }
        
        // print(matrix)
        return matrix[grid.count - 1][grid[0].count - 1]
    }
    
}
