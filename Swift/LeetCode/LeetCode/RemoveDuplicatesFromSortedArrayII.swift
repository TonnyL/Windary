//
//  RemoveDuplicatesFromSortedArrayII.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 27/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Follow up for [RemoveDuplicates](./LeetCode/RemoveDuplicates.swift):
//  What if duplicates are allowed at most twice?
//
//  For example,
//  Given sorted array nums = ,
//
//  Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3.
//  It doesn't matter what you leave beyond the new length.
//
//  Accepted. See [RemoveDuplicatesFromSortedArrayIITests](./LeetCodeTests/RemoveDuplicatesFromSortedArrayIITests.swift) for test cases.
//

import Foundation

class RemoveDuplicatesFromSortedArrayII {
    
    func removeDuplicates(_ nums: inout [Int]) -> Int {
        if nums.count <= 2 {
            return nums.count
        }
    
        var i = 0
        while i < (nums.count - 2) {
            if nums[i + 1] == nums[i] && nums[i + 2] == nums[i] {
                nums.remove(at: (i + 2))
            } else {
                i += 1
            }
        }
        
        return nums.count
    }
    
}
