//
//  LongestCommonPrefix.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 25/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
// Write a function to find the longest common prefix string amongst an array of strings.
//
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
        
        var i = 0
        var j = 1
        while i < (strs[0].count) {
            while j < (strs.count) {
                if i == strs[j].count  {
                    
                }
                j += 1
            }
            i += 1
        }
        
        return strs[0]
    }
    
}
