//
//  AddBinary.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 24/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//
//  You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//  Example:
//  Given nums = [2, 7, 11, 15], target = 9,
//
//  Because nums[0] + nums[1] = 2 + 7 = 9,
//  return [0, 1].
//
//  Accepted. See [TwoSumTests](./LeetCodeTests/TwoSumTests.swift) for test cases.
//

import Foundation

class TwoSum {
    
    func twoSum(_ nums: [Int], _ target: Int) -> [Int] {
        for i in 0...(nums.count - 1) {
            for j in (i+1)...(nums.count-1) {
                if target == (nums[i] + nums[j]) {
                    return [i, j]
                }
            }
        }
        
        return [0, 0]
    }
    
}
