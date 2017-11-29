//
//  RotateImage.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 29/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  You are given an n x n 2D matrix representing an image.
//
//  Rotate the image by 90 degrees (clockwise).
//
//  Note:
//  You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
//
//  Example 1:
//
//  Given input matrix =
//  [
//  [1,2,3],
//  [4,5,6],
//  [7,8,9]
//  ],
//
//  rotate the input matrix in-place such that it becomes:
//  [
//  [7,4,1],
//  [8,5,2],
//  [9,6,3]
//  ]
//  Example 2:
//
//  Given input matrix =
//  [
//  [ 5, 1, 9,11],
//  [ 2, 4, 8,10],
//  [13, 3, 6, 7],
//  [15,14,12,16]
//  ],
//
//  rotate the input matrix in-place such that it becomes:
//  [
//  [15,13, 2, 5],
//  [14, 3, 4, 1],
//  [12, 6, 8, 9],
//  [16, 7,10,11]
//  ]
//
//  Accepted. See [RotateImageTests](./LeetCodeTests/RotateImageTests.swift) for test cases.
//

import Foundation

class RotateImage {
    
    func rotate(_ matrix: inout [[Int]]) {
        var i = 0
        while i < matrix.count / 2 {
            let j = matrix.count - 1 - i
            let cache = matrix[i]
            matrix[i] = matrix[j]
            matrix[j] = cache
            i += 1
        }
        
        for i in matrix.indices {
            var j = i + 1
            while j < matrix.count {
                let cache = matrix[i][j]
                matrix[i][j] = matrix[j][i]
                matrix[j][i] = cache
                j += 1
            }
        }
        
        // print(mt)
    }
    
}
