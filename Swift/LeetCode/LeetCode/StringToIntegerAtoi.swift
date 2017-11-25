//
//  StringToIntegerAtoi.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 25/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Implement atoi to convert a string to an integer.
//
//  Hint: Carefully consider all possible input cases. If you want a challenge,
//  please do not see below and ask yourself what are the possible input cases.
//
//  Notes: It is intended for this problem to be specified vaguely (ie, no given input specs).
//  You are responsible to gather all the input requirements up front.
//
//  Accepted. See [StringToIntegerAtoiTests](./LeetCodeTests/StringToIntegerAtoiTests.swift) for the test cases.
//

import Foundation

class StringToIntegerAtoi {
    
    func myAtoi(_ str: String) -> Int {
        let s = str.trimmingCharacters(in: .whitespacesAndNewlines)
        if s.isEmpty {
            return 0
        }
        
        if s.count == 1 {
            let value = s.unicodeScalars.first!.value
            if value <= "0".unicodeScalars.first!.value || value >= "9".unicodeScalars.first!.value {
                return 0
            }
            return Int(value - "0".unicodeScalars.first!.value)
        }
        
        let intMax = 2147483647
        let intMin = -2147483648
        let plus = s.first == Character("+")
        let minus = s.first == Character("-")
        
        var result = 0
        var startIndex = 0
        if plus || minus {
            startIndex = 1
        }
        
        let chars: [Character] = ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]
        let inputCharArray = Array(s)
        for i in startIndex...(inputCharArray.count - 1) {
            if chars.contains(inputCharArray[i]) {
                if (intMax / 10 - (Int(inputCharArray[i].unicodeScalars.first!.value) -  Int("0".unicodeScalars.first!.value))) <= result {
                    if (minus && (result * 10) + (Int(inputCharArray[i].unicodeScalars.first!.value) -  Int("0".unicodeScalars.first!.value)) == intMax) {
                        return -intMax
                    }
                    if minus {
                        return intMin
                    }
                    return intMax
                }
                result = result * 10 + (Int(inputCharArray[i].unicodeScalars.first!.value) - Int("0".unicodeScalars.first!.value))
            } else {
                if minus {
                    return -result
                }
                return result
            }
        }
        
        if minus {
            return -result
        }
        return result
    }
    
}
