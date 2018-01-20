//
//  FourSum.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 20/01/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c + d = target?
//  Find all unique quadruplets in the array which gives the sum of target.
//
//  Note: The solution set must not contain duplicate quadruplets.
//
//  For example, given array S = [1, 0, -1, 0, -2, 2], and target = 0.
//
//  A solution set is:
//  [
//  [-1,  0, 0, 1],
//  [-2, -1, 1, 2],
//  [-2,  0, 0, 2]
//  ]
//
//  Accepted. See [FourSumTests](./LeetCodeTests/FourSumTests.swift) for test cases.
//

import Foundation

class FourSum {
    
    func fourSum(_ nums: [Int], _ target: Int) -> [[Int]] {
        let newSum = nums.sorted()
        var results = Array<Array<Int>>.init()
        
        var i = 0
        while i < nums.count - 3 {
            var j = i + 1
            while j < nums.count - 2 {
                var left = j + 1
                var right = nums.count - 1
                while left < right {
                    let sum = newSum[i] + newSum[j] + newSum[left] + newSum[right]
                    if sum == target {
                        let tmp = [newSum[i], newSum[j], newSum[left], newSum[right]]
                        if !results.contains(where: { (value) -> Bool in
                            value == tmp
                        }) {
                            results.append(tmp)
                        }
                        
                        left += 1
                        right -= 1
                    } else if (sum < target) {
                        left += 1
                    } else {
                        right -= 1
                    }
                }
                
                j += 1
            }
            i += 1
        }
        
        return results
    }
    
}
