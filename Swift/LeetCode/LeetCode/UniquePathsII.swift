//
//  UniquePathsII.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 26/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Follow up for [UniquePaths](./LeetCode/UniquePaths.swift):
//  Now consider if some obstacles are added to the grids. How many unique paths would there be?
//  An obstacle and empty space is marked as 1 and 0 respectively in the grid.
//
//  For example,
//  There is one obstacle in the middle of a 3x3 grid as illustrated below.
//
//  [
//  [0,0,0],
//  [0,1,0],
//  [0,0,0]
//  ]
//
//  The total number of unique paths is 2.
//
//  Note: m and n will be at most 100.
//
//  Accepted. See [UniquePathsIITests](./LeetCodeTests/UniquePathsIITests.swift) for test cases.
//

import Foundation

class UniquePathsII {
    
    func uniquePathsWithObstacles(_ obstacleGrid: [[Int]]) -> Int {
        if obstacleGrid[0][0] == 1 {
            return 0
        }
        if obstacleGrid.count == 1 {
            for i in obstacleGrid[0] {
                if i == 1 {
                    return 0
                }
            }
            return 1
        }
        
        var matrix = Array(repeating: Array(repeating: 0, count: obstacleGrid[0].count), count: obstacleGrid.count)
        
        for i in obstacleGrid.indices {
            if obstacleGrid[i][0] == 1 {
                break
            } else {
                matrix[i][0] = 1
            }
        }
        
        for i in obstacleGrid[0].indices {
            if obstacleGrid[0][i] == 1 {
                break
            } else {
                matrix[0][i] = 1
            }
        }
        
        var i = 1
        while i < matrix.count {
            var j = 1
            while j < matrix[0].count {
                if obstacleGrid[i][j] == 1 {
                    matrix[i][j] = 0
                } else {
                    matrix[i][j] = matrix[i - 1][j] + matrix[i][j - 1]
                }
                j += 1
            }
            i += 1
        }
        
        // print(matrix)
        return matrix[matrix.count - 1][matrix[0].count - 1]
    }
    
}
