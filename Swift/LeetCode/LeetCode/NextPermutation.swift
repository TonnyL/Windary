//
//  NextPermutation.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 23/01/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.
//
//  If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).
//
//  The replacement must be in-place, do not allocate extra memory.
//
//  Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.
//  1,2,3 → 1,3,2
//  3,2,1 → 1,2,3
//  1,1,5 → 1,5,1
//
//  Accepted. See [NextPermutationTests](./LeetCodeTests/NextPermutationTests.swift) for test cases.
//

import Foundation

class NextPermutation {
    
    func nextPermutation(_ nums: inout [Int]) {
        var i = nums.count - 2
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i -= 1
        }
        if (i >= 0) {
            var j = nums.count - 1
            while (nums[j] <= nums[i]) {
                j -= 1
            }
            swap(&nums, i, j)
        }
        reverse(&nums, i + 1, nums.count - 1)
    }
    
    func swap(_ nums: inout [Int], _ i: Int, _ j: Int) {
        let tmp = nums[i]
        nums[i] = nums[j]
        nums[j] = tmp
    }
    
    func reverse(_ nums: inout [Int], _ i: Int, _ j: Int) {
        var tmpI = i
        var tmpJ = j
        while (tmpI < tmpJ) {
            swap(&nums, tmpI, tmpJ)
            tmpI += 1
            tmpJ -= 1
        }
    }
    
}
