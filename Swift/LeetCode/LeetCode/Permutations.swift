//
//  Permutations.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 05/12/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Given a collection of distinct numbers, return all possible permutations.
//
//  For example,
//  [1,2,3] have the following permutations:
//  [
//  [1,2,3],
//  [1,3,2],
//  [2,1,3],
//  [2,3,1],
//  [3,1,2],
//  [3,2,1]
//  ]
//
//  Accepted. See [PermutationsTests](./LeetCodeTests/PermutationsTests.swift) for test cases.
//

import Foundation

class Permutations {
    
    func permute(_ nums: [Int]) -> [[Int]] {
        var results: [[Int]] = []
        
        if nums.isEmpty {
            return results
        }
        if nums.count == 1 {
            results.append([nums[0]])
            return results
        }
        
        let ints = Array(nums[0..<nums.count - 1])
        for list in permute(ints) {
            for i in 0...list.count {
                var tmp = Array(list)
                tmp.insert(nums[nums.count - 1], at: i)
                results.append(tmp)
            }
        }
        
        return results
    }
    
}
