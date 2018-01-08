//
//  DecodeWays.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 08/01/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  A message containing letters from A-Z is being encoded to numbers using the following mapping:
//
//  'A' -> 1
//  'B' -> 2
//  ...
//  'Z' -> 26
//  Given an encoded message containing digits, determine the total number of ways to decode it.
//
//  For example,
//  Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12).
//
//  The number of ways decoding "12" is 2.
//
//  Accepted. See [DecodeWaysTests](./LeetCodeTests/DecodeWaysTests.swift) for test cases.
//

import Foundation

class DecodeWays {
    
    func numDecodings(_ s: String) -> Int {
        if s.isEmpty {
            return 0
        }
        
        let chars = Array(s)
        if chars[0] == "0" {
            return 0
        }
        
        var ints = Array<Int>.init(repeating: 0, count: s.count + 1)
        ints[0] = 1
        
        var i = 1
        while i < ints.count {
            if chars[i - 1] == "0" {
                ints[i] = 0
            } else {
                ints[i] = ints[i - 1]
            }
            
            if i > 1 && (chars[i - 2] == "1" || (chars[i - 2] == "2" && chars[i - 1].unicodeScalars.first!.value <= "6".unicodeScalars.first!.value)) {
                ints[i] += ints[i - 2]
            }
            
            i += 1
        }
        
        return ints[s.count]
    }
    
}
