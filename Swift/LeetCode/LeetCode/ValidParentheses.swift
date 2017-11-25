//
//  ValidParentheses.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 25/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
//  determine if the input string is valid.
//  The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
//
//  Accepted. See [ValidParenthesesTests](./LeetCodeTests/ValidParenthesesTests.swift) for the test cases.
//

import Foundation

class ValidParentheses {
    
    func isValid(_ s: String) -> Bool {
        if s.isEmpty || s.count == 1 {
            return false
        }
        
        var list: [Character] = []
        for char in s {
            if !list.isEmpty && ((char == ")" && list[list.count - 1] == "(")
                || (char == "]" && list[list.count - 1] == "[")
                || (char == "}" && list[list.count - 1] == "{")) {
                list.remove(at: list.count - 1)
            } else {
                list.append(char)
            }
        }
        
        return list.isEmpty
    }
    
}
