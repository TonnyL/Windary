//
//  SingleNumber.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 14/02/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Given an array of integers, every element appears twice except for one. Find that single one.
//
//  Note:
//  Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
//
//  Accepted. See [SingleNumberTests](./LeetCodeTests/SingleNumberTests.swift) for test cases.
//

import Foundation

class SingleNumber {
    
    func singleNumber(_ nums: [Int]) -> Int {
        var sum = 0
        nums.forEach {
            sum ^= $0
        }
        return sum
    }
    
}
