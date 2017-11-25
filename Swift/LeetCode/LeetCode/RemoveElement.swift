//
//  RemoveElement.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 25/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Given an array and a value, remove all instances of that value in place and return the new length.
//  Do not allocate extra space for another array, you must do this in place with constant memory.
//  The order of elements can be changed. It doesn't matter what you leave beyond the new length.
//  Example:
//  Given input array nums = [3,2,2,3], val = 3
//  Your function should return length = 2, with the first two elements of nums being 2.
//
//  Accepted. See [RemoveElementTests](./LeetCodeTests/RemoveElementTests.swift) for the test cases.
//

import Foundation

class RemoveElement {
    
    func removeElement(_ nums: inout [Int], _ val: Int) -> Int {
        var i = 0
        while i < nums.count {
            if nums[i] == val {
                nums.remove(at: i)
                i -= 1
            }
            i += 1
        }
        
        return nums.count
    }
    
}
