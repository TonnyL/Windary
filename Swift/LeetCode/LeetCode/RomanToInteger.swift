//
//  RomanToInteger.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 25/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Given a roman numeral, convert it to an integer.
//  Input is guaranteed to be within the range from 1 to 3999.
//
//  Accepted. See [RomanToInteger](./LeetCodeTests/RomanToIntegerTests.swift) for the test cases.
//

import Foundation

class RomanToInteger {
    
    func romanToInt(_ s: String) -> Int {
        let dict = ["I": 1, "V": 5, "X": 10, "L": 50, "C": 100, "D": 500, "M": 1000]
        let chars = Array(s)
        var result = 0
        var i = 0
        while i < chars.count {
            if (i + 1 < chars.count)
                && (dict[String(chars[i + 1])]! > dict[String(chars[i])]!)
                && (chars[i] == "I" || chars[i] == "X" || chars[i] == "C") {
                result += (dict[String(chars[i + 1])]! - dict[String(chars[i])]!)
                
                i += 1
            } else {
                result += dict[String(chars[i])]!
            }
            i += 1
        }
        
        return result
    }
    
}
