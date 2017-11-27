//
//  SortColors.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 27/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.
//
//  Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
//
//  Note:
//  You are not suppose to use the library's sort function for this problem.
//
//  Follow up:
//  A rather straight forward solution is a two-pass algorithm using counting sort.
//  First, iterate the array counting number of 0's, 1's, and 2's, then overwrite array with total number of 0's, then 1's and followed by 2's.
//
//  Could you come up with an one-pass algorithm using only constant space?
//
//  Accepted. See [SortColorsTests](./LeetCodeTests/SortColorsTests.swift) for test cases.
//

import Foundation

class SortColors {
    
    func sortColors(_ nums: inout [Int]) {
        if nums.count > 1 {
            var index = 0
            var counter = 0
            while counter < nums.count {
                if nums[index] == 0 {
                    nums.insert(0, at: 0)
                    index += 1
                    nums.remove(at: index)
                } else if nums[index] == 2 {
                    nums.append(2)
                    nums.remove(at: index)
                } else if nums[index] == 1 {
                    index += 1
                } else {
                    return
                }
                counter += 1
            }
        }
        
        // print(nums)
    }
    
}
