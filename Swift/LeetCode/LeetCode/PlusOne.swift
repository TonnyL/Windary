//
//  PlusOne.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 26/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.
//  You may assume the integer do not contain any leading zero, except the number 0 itself.
//  The digits are stored such that the most significant digit is at the head of the list.
//
//  Accepted. See [PlusOneTests](./LeetCodeTests/PlusOneTests.swift) for test cases.
//

import Foundation

class PlusOne {
    
    func plusOne(_ digits: [Int]) -> [Int] {
        var flag = false
        var mDigits = digits
        mDigits[mDigits.count - 1] += 1
        
        for i in mDigits.indices.reversed() {
            if flag {
                mDigits[i] += 1
            }
            if mDigits[i] >= 10 {
                flag = true
                mDigits[i] %= 10
            } else {
                flag = false
            }
        }
        
        if flag {
            mDigits.insert(1, at: 0)
        }
        
        return mDigits
    }
    
}
