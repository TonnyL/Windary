//
//  SearchA2DMatrix.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 27/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
//
//  Integers in each row are sorted from left to right.
//  The first integer of each row is greater than the last integer of the previous row.
//  For example,
//
//  Consider the following matrix:
//
//  [
//  [1,   3,  5,  7],
//  [10, 11, 16, 20],
//  [23, 30, 34, 50]
//  ]
//  Given target = 3, return true.
//
//  Accepted. See [SearchA2DMatrixTests](./LeetCodeTests/SearchA2DMatrixTests.swift) for test cases.
//

import Foundation

class SearchA2DMatrix {
    
    func searchMatrix(_ matrix: [[Int]], _ target: Int) -> Bool {
        if matrix.isEmpty || matrix[0].isEmpty {
            return false
        }
        
        var i = 0
        while i < (matrix.count - 1) {
            if matrix[i][0] == target || matrix[i + 1][0] == target {
                return true
            } else if matrix[i][0] < target && target <= matrix[i + 1][0] {
                let r = binarySearch(inputArr: matrix[i], searchItem: target)
                if r != nil {
                    return true
                }
                return false
            }
            i += 1
        }
        
        let r = binarySearch(inputArr: matrix[matrix.count - 1], searchItem: target)
        if r != nil {
            return true
        }
        return false
    }
    
    func binarySearch<T:Comparable>(inputArr:Array<T>, searchItem: T) -> Int? {
        var lowerIndex = 0;
        var upperIndex = inputArr.count - 1
        
        while (true) {
            let currentIndex = (lowerIndex + upperIndex)/2
            if(inputArr[currentIndex] == searchItem) {
                return currentIndex
            } else if (lowerIndex > upperIndex) {
                return nil
            } else {
                if (inputArr[currentIndex] > searchItem) {
                    upperIndex = currentIndex - 1
                } else {
                    lowerIndex = currentIndex + 1
                }
            }
        }
    }
    
}
