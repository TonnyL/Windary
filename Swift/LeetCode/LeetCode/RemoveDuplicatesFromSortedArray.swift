//
//  RemoveDuplicatesFromSortedArray.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 25/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
//  Do not allocate extra space for another array, you must do this in place with constant memory.
//  For example,
//  Given input array nums = [1,1,2],
//  Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
//  It doesn't matter what you leave beyond the new length.
//
//  Accepted. See [RemoveDuplicatesFromSortedArrayTests](./LeetCodeTests/RemoveDuplicatesFromSortedArrayTests.swift) for the test cases.
//

import Foundation

class RemoveDuplicatesFromSortedArray {
    
    func removeDuplicates(_ nums: inout [Int]) -> Int {
        if nums.isEmpty {
            return 0
        }
        
        var i = 0
        var j = 1
        var anotherNums = nums
        while j < nums.count {
            if anotherNums[j] != anotherNums[i] {
                i += 1
                anotherNums[i] = anotherNums[j]
            }
            j += 1
        }
        
        return i + 1
    }
    
}
