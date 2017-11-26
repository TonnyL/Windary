//
//  LongestCommonPrefix.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 25/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Write a function to find the longest common prefix string amongst an array of strings.
//
//  Accepted. See [LongestCommonPrefixTests](./LeetCodeTests/LongestCommonPrefixTests.swift) for test cases.
//

import Foundation

class LongestCommonPrefix {
    
    func longestCommonPrefix(_ strs: [String]) -> String {
        if strs.isEmpty {
            return ""
        }
        
        if strs.count == 1 {
            return strs[0]
        }
        
        var allChars: [[Character]] = []
        for s in strs {
            if s.isEmpty {
                return ""
            }
            allChars.append(Array(s))
        }
        
        for i in 0...(allChars[0].count - 1) {
            for j in 1...(allChars.count - 1) {
                if i == allChars[j].count || allChars[0][i] != allChars[j][i] {
                    return String(allChars[0][0..<i])
                }
            }
        }
        
        return String(allChars[0])
    }
    
}
