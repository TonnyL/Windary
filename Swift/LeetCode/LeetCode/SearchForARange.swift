//
//  SearchForARange.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 26/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Given an array of integers sorted in ascending order, find the starting and ending position of a given target value.
//
//  Your algorithm's runtime complexity must be in the order of O(log n).
//
//  If the target is not found in the array, return [-1, -1].
//
//  For example,
//  Given [5, 7, 7, 8, 8, 10] and target value 8,
//  return [3, 4].
//
//  Accepted. See [SearchForARangeTests](./LeetCodeTests/SearchForARangeTests.swift) for test cases.
//

import Foundation

class SearchForARange {
    
    func searchRange(_ nums: [Int], _ target: Int) -> [Int] {
        var result: [Int] = [-1, -1]
        if nums.count == 0 {
            return result
        }
        
        for i in nums.indices {
            if nums[i] == target {
                result[0] = i
                break
            }
        }
        
        for i in nums.indices.reversed() {
            if nums[i] == target {
                result[1] = i
                break
            }
        }
        
        return result
    }
    
}
