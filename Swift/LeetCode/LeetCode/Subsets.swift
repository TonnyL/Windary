//
//  Subsets.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 11/12/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Given a set of distinct integers, nums, return all possible subsets (the power set).
//
//  Note: The solution set must not contain duplicate subsets.
//
//  For example,
//  If nums = [1,2,3], a solution is:
//
//  [
//  [3],
//  [1],
//  [2],
//  [1,2,3],
//  [1,3],
//  [2,3],
//  [1,2],
//  []
//  ]
//
//  Accepted. See [SubsetsTests](./LeetCodeTests/SubsetsTests.swift) for test cases.
//

import Foundation

class Subsets {
    
    func subsets(_ nums: [Int]) -> [[Int]] {
        var result = Array<Array<Int>>.init()
        result.append([])
        
        if nums.isEmpty {
            return result
        }
        
        for i in nums.sorted() {
            let size = result.count
            var j = 0
            while j < size {
                var tmp = Array<Int>.init()
                tmp.append(contentsOf: result[j])
                tmp.append(i)
                
                result.append(tmp)
                
                j += 1
            }
        }
        
        return result
    }
    
}
