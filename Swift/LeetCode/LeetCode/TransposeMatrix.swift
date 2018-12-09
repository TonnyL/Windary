//
//  TransposeMatrix.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 2018/12/9.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  The transpose of a matrix is the matrix flipped over it's main diagonal, switching the row and column indices of the matrix.
//
//  Example 1:
//
//  Input: [[1,2,3],[4,5,6],[7,8,9]]
//  Output: [[1,4,7],[2,5,8],[3,6,9]]
//  Example 2:
//
//  Input: [[1,2,3],[4,5,6]]
//  Output: [[1,4],[2,5],[3,6]]
//
//  Note:
//
//  1 <= A.length <= 1000
//  1 <= A[0].length <= 1000
//
//  Accepted. See [TransposeMatrixTest](./LeetCodeTests/TransposeMatrixTests.swift) for test cases.
//

import Foundation

class TransposeMatrix {
    
    func transpose(_ A: [[Int]]) -> [[Int]] {
        var tmp = Array(repeating: (Array(repeating:0, count: A.count)), count: A[0].count)
        for i in 0..<A[0].count {
            for j in 0..<A.count {
                tmp[i][j] = A[j][i]
            }
        }
        
        return tmp
    }
    
}
