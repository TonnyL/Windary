
//
//  MaximumSubArray.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 09/01/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
//
//  For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
//  the contiguous subarray [4,-1,2,1] has the largest sum = 6.
//
//  If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
//
//  Accepted. See [MaximumSubArrayTests](./LeetCodeTests/MaximumSubArrayTests.swift) for test cases.
//

import Foundation

class MaximumSubArray {
    
    func maxSubArray(_ nums: [Int]) -> Int {
        var max = nums[0]
        var tmp = 0
        
        for i in nums {
            tmp += i
            if tmp > max {
                max = tmp
            }
            if tmp < 0 {
                tmp = 0
            }
        }
        
        return max
    }
    
}
