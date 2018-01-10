//
//  DivideTwoIntegers.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 10/01/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Divide two integers without using multiplication, division and mod operator.
//
//  If it is overflow, return MAX_INT.
//
//  Accepted. See [DivideTwoIntegersTests](./LeetCodeTests/DivideTwoIntegersTests.swift) for test cases.
//

import Foundation

class DivideTwoIntegers {
    
    func divide(_ dividend: Int, _ divisor: Int) -> Int {
        let INT_MIN_VALUE = -2147483648
        let INT_MAX_VALUE = 2147483647
        
        var longDividend = Int64(dividend)
        if longDividend < 0 {
            longDividend = -longDividend
        }
        
        var longDivisor = Int64(divisor)
        if longDivisor < 0 {
            longDivisor = -longDivisor
        }
        var result = 0
        
        while longDividend >= longDivisor {
            var tmpDivisor = longDivisor
            var i = 0
            
            while tmpDivisor <= longDividend {
                longDividend -= tmpDivisor
                tmpDivisor = tmpDivisor << 1
                result += 1 << i
                i += 1
            }
            
        }
        
        if dividend < 0 && divisor > 0 || dividend > 0 && divisor < 0 {
            result = -result
        }
        
        if result < INT_MIN_VALUE || result > INT_MAX_VALUE {
           return INT_MAX_VALUE
        }
        
        return Int(result)
    }
    
}
