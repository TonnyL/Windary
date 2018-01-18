//
//  ThreeSumClosest.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 18/01/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target.
//  Return the sum of the three integers.
//  You may assume that each input would have exactly one solution.
//
//  For example, given array S = {-1 2 1 -4}, and target = 1.
//
//  The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
//
//  Accepted. See [ThreeSumClosestTests](./LeetCodeTests/ThreeSumClosestTests.swift) for test cases.
//

import Foundation

class ThreeSumClosest {
    
    func threeSumClosest(_ nums: [Int], _ target: Int) -> Int {
        let newNums = nums.sorted()
        
        var result = newNums[0] + newNums[1] + newNums[2]
        for i in 0...(newNums.count - 2) {
            var l = i + 1
            var r = newNums.count - 1
            while (l < r) {
                let tmp = newNums[i] + newNums[l] + newNums[r]
                if (tmp == target) {
                    return tmp
                }
                if (abs(tmp - target) < abs(result - target)) {
                    result = tmp
                }
                if (tmp < target) {
                    l += 1
                } else if (tmp > target) {
                    r -= 1
                }
            }
        }
        return result
    }
    
}
