//
//  SearchInRotatedSortedArray.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 26/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
//  (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
//  You are given nums target value to search. If found in the array return its index, otherwise return -1.
//  You may assume no duplicate exists in the array.
//
//  Accepted. See [SearchInRotatedSortedArrayTests](./LeetCodeTests/SearchInRotatedSortedArrayTests.swift) for test cases.
//

import Foundation

class SearchInRotatedSortedArray {
    
    func search(_ nums: [Int], _ target: Int) -> Int {
        if nums.isEmpty {
            return -1
        }
        
        var l = 0
        var r = nums.count - 1
        while l <= r {
            let m = (l + r) / 2
            if nums[m] == target {
                return m
            }
            if nums[m] >= nums[l] {
                if nums[l] <= target && target < nums[m] {
                    r = m - 1
                } else {
                    l = m + 1
                }
            } else {
                if nums[m] < target && target <= nums[r] {
                    l = m + 1
                } else {
                    r = m - 1
                }
            }
        }
        return -1
    }
    
}
