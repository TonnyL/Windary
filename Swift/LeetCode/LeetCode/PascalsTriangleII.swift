//
//  PascalsTriangleII.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 23/02/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Given an index k, return the kth row of the Pascal's triangle.
//
//  For example, given k = 3,
//  Return [1,3,3,1].
//
//  Note:
//  Could you optimize your algorithm to use only O(k) extra space?
//
//  Accepted. See [PascalsTriangleIITests](./LeetCodeTests/PascalsTriangleIITests.swift) for test cases.
//

import Foundation

class PascalsTriangleII {
    
    func getRow(_ rowIndex: Int) -> [Int] {
        var results = Array<Int>.init(arrayLiteral: 1)
        
        if rowIndex == 0 {
            return results
        }
        
        for _ in 0..<rowIndex {
            results.append(1)
            var j = results.count - 2
            while j > 0 {
                results[j] = results[j - 1] + results[j]
                
                j -= 1
            }
        }
        
        return results
    }
    
}
