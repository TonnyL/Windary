//
//  ToLowerCase.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 2018/12/9.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.
//
//  Example 1:
//
//  Input: "Hello"
//  Output: "hello"
//  Example 2:
//
//  Input: "here"
//  Output: "here"
//  Example 3:
//
//  Input: "LOVELY"
//  Output: "lovely"
//
//  Accepted. See [ToLowerCaseTests](./LeetCodeTests/ToLowerCaseTests.swift) for test cases.
// 

import Foundation

class ToLowerCase {
    
    func toLowerCase(_ str: String) -> String {
        // return str.lowercased()
        var result = ""
        
        for char in str {
            let asciiValue = char.unicodeScalars.first!.value
            if asciiValue >= 65 && asciiValue <= 90 {
                result.append(Character(UnicodeScalar(asciiValue + 32)!))
            } else {
                result.append(char)
            }
        }
        
        return result
    }
    
}
