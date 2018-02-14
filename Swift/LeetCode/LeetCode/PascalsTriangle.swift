//
//  PascalsTriangle.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 15/02/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Given numRows, generate the first numRows of Pascal's triangle.
//
//  For example, given numRows = 5,
//  Return
//
//  [
//  [1],
//  [1,1],
//  [1,2,1],
//  [1,3,3,1],
//  [1,4,6,4,1]
//  ]
//
//  Accepted. See [PascalsTriangleTests](./LeetCodeTests/PascalsTriangleTests.swift) for test cases.
//

import Foundation

class PascalsTriangle {
    
    func generate(_ numRows: Int) -> [[Int]] {
        var results = Array<Array<Int>>.init()
        if numRows == 0 {
            return results
        }
        if numRows == 1 {
            results.append([1])
            return results
        }
        if numRows == 2 {
            results.append([1])
            results.append([1, 1])
            return results
        }
        
        var tmp = self.generate(numRows - 1)
        var list = Array<Int>.init(repeating: 1, count: numRows)
        
        let last = tmp[tmp.count - 1]
        for i in 1..<last.count {
            list[i] = last[i - 1] + last[i]
        }
        tmp.append(list)
        
        return tmp
    }
    
}
