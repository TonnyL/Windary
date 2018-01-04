//
//  JumpGame.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 04/01/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Given an array of non-negative integers, you are initially positioned at the first index of the array.
//
//  Each element in the array represents your maximum jump length at that position.
//
//  Determine if you are able to reach the last index.
//
//  For example:
//  A = [2,3,1,1,4], return true.
//
//  A = [3,2,1,0,4], return false.
//
//  Accepted. See [JumpGameTests](./LeetCodeTests/JumpGameTests.swift) for test cases.
//

import Foundation

class JumpGame {
    
    func canJump(_ nums: [Int]) -> Bool {
        if nums.count == 0 {
            return false
        }
        if nums.count == 1 {
            return true
        }
        
        var maxLength = 0
        var i = 0
        while i < nums.count - 1 {
            maxLength -= 1
            
            maxLength = max(maxLength, nums[i])
            if maxLength == 0 {
                return false
            }
            
            i += 1
        }
        
        return maxLength > 0
    }
    
}
