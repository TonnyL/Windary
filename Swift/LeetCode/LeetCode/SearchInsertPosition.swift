//
//  SearchInsertPosition.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 26/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Given a sorted array and a target value, return the index if the target is found. If not,
//  return the index where it would be if it were inserted in order.
//  You may assume no duplicates in the array.
//  Here are few examples.
//
//  [1,3,5,6], 5 → 2
//  [1,3,5,6], 2 → 1
//  [1,3,5,6], 7 → 4
//  [1,3,5,6], 0 → 0
//
//  Accepted. See [SearchInsertPositionTests](./LeetCodeTests/SearchInsertPositionTests.swift) for test cases.
//

import Foundation

class SearchInsertPosition {
    
    func searchInsert(_ nums: [Int], _ target: Int) -> Int {
        if nums.count == 0 {
            return 0
        }
        
        for i in nums.indices {
            if nums[i] == target {
                return i
            } else if nums[i] < target {
                if ((i + 1) < nums.count && nums[i + 1] > target)
                    || (i + 1) == nums.count {
                    return i + 1
                }
            }
        }
        return 0
    }
    
}
