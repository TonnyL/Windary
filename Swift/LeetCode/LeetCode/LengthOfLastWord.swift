//
//  LengthOfLastWord.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 26/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
//  If the last word does not exist, return 0.
//  Note: A word is defined as a character sequence consists of non-space characters only.
//  For example,
//  Given s = "Hello World",
//  return 5.
//
//  Accepted. See [LengthOfLastWord](./LeetCodeTests/LengthOfLastWordTests.swift) for test cases.
//

import Foundation

class LengthOfLastWord {
    
    func lengthOfLastWord(_ s: String) -> Int {
        if s.isEmpty {
            return 0
        }
        
        let strs = s.split(separator: " ")
        if strs.isEmpty {
            return 0
        }
        
        return strs[(strs.count - 1)].count
    }
    
}
