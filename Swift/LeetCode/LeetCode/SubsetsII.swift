//
//  SubsetsII.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 08/01/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//
//  Given a collection of integers that might contain duplicates, nums, return all possible subsets (the power set).
//
//  Note: The solution set must not contain duplicate subsets.
//
//  For example,
//  If nums = [1,2,2], a solution is:
//
//  [
//  [2],
//  [1],
//  [1,2,2],
//  [2,2],
//  [1,2],
//  []
//  ]
//
//  Accepted. See [SubsetsIITests](./LeetCodeTests/SubsetsIITests.swift) for test cases.
//

import Foundation

class SubsetsII {
    
    func subsetsWithDup(_ nums: [Int]) -> [[Int]] {
        if nums.isEmpty {
            return []
        }
        
        var lists : [[Int]] = Array.init()
        
        if nums.count == 1 {
            lists.append(Array<Int>.init())
            lists.append([nums[0]])
            return lists
        }
        
        let newNums = nums.sorted()
        for list in subsetsWithDup(Array(newNums[0..<newNums.count - 1])) {
            var l = Array<Int>.init()
            l.append(newNums[newNums.count - 1])
            l.append(contentsOf: list)
            
            var equalsL = false
            var equalsList = false
            
            for li in lists {
                if li == list {
                    equalsList = true
                }
                if li == l {
                    equalsL = true
                }
                
                if equalsList && equalsL {
                    break
                }
            }
            
            if !equalsList {
                lists.append(list)
            }
            
            if !equalsL {
                lists.append(l)
            }
            
        }
        
        return lists
    }
    
}
