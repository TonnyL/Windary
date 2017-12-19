//
//  MultiplyStrings.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 19/12/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2.
//
//  Note:
//
//  The length of both num1 and num2 is < 110.
//  Both num1 and num2 contains only digits 0-9.
//  Both num1 and num2 does not contain any leading zero.
//  You must not use any built-in BigInteger library or convert the inputs to integer directly.
//
//  Accepted. See [MultiplyStringsTests](./LeetCodeTests/MultiplyStringsTests.swift) for test cases.
//

import Foundation

class MultiplyStrings {
    
    func multiply(_ num1: String, _ num2: String) -> String {
        var ints = Array<Int>.init(repeating: 0, count: num1.count + num2.count)
        let num1Array = Array(num1)
        let num2Array = Array(num2)
        let asciiOfZero = Array("0")[0].unicodeScalars.first!.value
        
        for i in num1Array.indices {
            for j in num2Array.indices {
                ints[(num1Array.count - i - 1) + (num2Array.count - j - 1)] += Int((num1Array[i].unicodeScalars.first!.value - asciiOfZero) *  (num2Array[j].unicodeScalars.first!.value - asciiOfZero))
            }
        }
        
        var res = Array<String>.init()
        var i = 0
        while i < ints.count {
            let digit = ints[i] % 10
            let carry = ints[i] / 10
            res.insert(String(digit), at: 0)
            if i < ints.count - 1 {
                ints[i + 1] += carry
            }
            i += 1
        }
        
        
        while res.count > 0 && res[0] == "0" {
            res.remove(at: 0)
        }
        
        if res.isEmpty {
            return "0"
        }
        return res.joined(separator: "")
    }
    
}
