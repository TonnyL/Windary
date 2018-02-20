//
//  SingleNumberII.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 20/02/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Given an array of integers, every element appears three times except for one, which appears exactly once. Find that single one.
//
//  Note:
//  Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
//
//  Accepted. See [SingleNumberIITests](./LeetCodeTests/SingleNumberIITests.swift) for test cases.
//

import Foundation

class SingleNumberII {
    
    func singleNumber(_ nums: [Int]) -> Int {
        var one = 0
        var two = 0
        var three = 0
        nums.forEach { num in
            two |= (one & num)
            one ^= num
            three = one & two
            two -= three
            one -= three
        }
        
        return one
    }
    
}
