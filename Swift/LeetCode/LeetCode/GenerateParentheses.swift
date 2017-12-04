//
//  GenerateParentheses.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 04/12/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
//
//  For example, given n = 3, a solution set is:
//
//  [
//  "((()))",
//  "(()())",
//  "(())()",
//  "()(())",
//  "()()()"
//  ]
//
//  Accepted. See [GenerateParenthesesTests](./LeetCodeTests/GenerateParenthesesTests.swift) for test cases.
//

import Foundation

class GenerateParentheses {
    
    func generateParenthesis(_ n: Int) -> [String] {
        var set = Set<String>.init()
        var list = Array<String>.init()
        if n <= 0 {
            return list
        }
        if n == 1 {
            list.append("()")
            return list
        }
        
        for s in self.generateParenthesis(n - 1) {
            var string = ""
            let chars = Array(s)
            for j in chars.indices {
                string.append(chars[j])
                if chars[j] == "(" {
                    var builder = string
                    builder += "()"
                    for k in j + 1...chars.count - 1 {
                        builder.append(chars[k])
                    }
                    set.insert(builder)
                }
            }
            
            set.insert(s + "()")
        }
        
        set.forEach {
            list.append($0)
        }
        
        return list
    }
    
}
