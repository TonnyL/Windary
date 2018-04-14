//
//  RotateArray.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 2018/4/14.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Rotate an array of n elements to the right by k steps.
//
//  For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
//
//  Accepted. See [RotateArrayTests](./LeetCodeTests/RotateArrayTests.swift) for test cases.
//

import Foundation

class RotateArray {
    
    func rotate(_ nums: inout [Int], _ k: Int) {
        var newK = k
        newK %= nums.count
        reverse(&nums, 0, nums.count - 1)
        reverse(&nums, 0, newK - 1)
        reverse(&nums, newK, nums.count - 1)
    }
    
    func reverse(_ nums: inout [Int], _ start: Int, _ end: Int) {
        var newStart = start
        var newEnd = end
        while newStart < newEnd {
            let temp = nums[newStart]
            nums[newStart] = nums[newEnd]
            nums[newEnd] = temp
            newStart += 1
            newEnd -= 1
        }
    }
    
}
