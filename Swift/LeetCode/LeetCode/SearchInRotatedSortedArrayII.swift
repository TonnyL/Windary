//
//  SearchInRotatedSortedArrayII.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 09/01/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Follow up for "Search in Rotated Sorted Array":
//  What if duplicates are allowed?
//
//  Would this affect the run-time complexity? How and why?
//
//  Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
//
//  (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
//
//  Write nums function to determine if nums given target is in the array.
//
//  The array may contain duplicates.
//
//  Accepted. See [SearchInRotatedSortedArrayIITests](./LeetCodeTests/SearchInRotatedSortedArrayIITests.swift) for test cases.
//

import Foundation

class SearchInRotatedSortedArrayII {
    
    func search(_ nums: [Int], _ target: Int) -> Bool {
        if nums.count == 0 {
            return false
        }
        
        var start = 0
        var end = nums.count - 1
        while start <= end {
            let mid = start + (end - start) / 2
            if (nums[mid] == target) {
                return true
            }
            if nums[mid] < nums[end] { // right half sorted
                if target > nums[mid] && target <= nums[end] {
                    start = mid + 1
                } else {
                    end = mid - 1
                }
            } else if nums[mid] > nums[end] {  // left half sorted
                if target >= nums[start] && target < nums[mid] {
                    end = mid - 1
                } else {
                    start = mid + 1
                }
            } else {
                end -= 1
            }
        }
        
        return false
    }
    
}
