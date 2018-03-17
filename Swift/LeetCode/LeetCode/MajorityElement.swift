//
//  MajorityElement.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 17/03/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
//
//  You may assume that the array is non-empty and the majority element always exist in the array.
//
//  Accepted. See [MajorityElementTests](./LeetCodeTests/MajorityElementTests.swift) for test cases.
//

import Foundation

class MajorityElement {
    
    func majorityElement(_ nums: [Int]) -> Int {
        var map: [Int: Int] = [:]
        
        for i in nums {
            if map[i] != nil {
                map[i]! += 1
            } else {
                map[i] = 1
            }
            
            if map[i]! > nums.count / 2 {
                return i
            }
        }
        
        return nums[0]
    }
    
}
