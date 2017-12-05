//
//  PermutationsII.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 05/12/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Given a collection of numbers that might contain duplicates, return all possible unique permutations.
//
//  For example,
//  [1,1,2] have the following unique permutations:
//  [
//  [1,1,2],
//  [1,2,1],
//  [2,1,1]
//  ]
//
//  Accepted. See [PermutationsIITests](./LeetCodeTests/PermutationsIITests.swift) for test cases.
//

import Foundation

class PermutationsII {
    
    func permuteUnique(_ nums: [Int]) -> [[Int]] {
        var results: [[Int]] = []
        
        if nums.isEmpty {
            return results
        }
        if nums.count == 1 {
            results.append([nums[0]])
            return results
        }
        
        let ints = Array(nums[0..<nums.count - 1])
        var map: [String: Array<Int>] = [:]
        for list in permuteUnique(ints) {
            for i in 0...list.count {
                var tmp = Array(list)
                tmp.insert(nums[nums.count - 1], at: i)
                map[String(describing: tmp)] = tmp
            }
        }
        
        map.values.forEach{
            results.append($0)
        }
        return results
    }
    
}
