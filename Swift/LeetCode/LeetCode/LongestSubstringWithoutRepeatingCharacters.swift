//
//  LongestSubstringWithoutRepeatingCharacters.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 25/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//
// Given a string, find the length of the longest substring without repeating characters.
//
//  Examples:
//
//  Given "abcabcbb", the answer is "abc", which the length is 3.
//
//  Given "bbbbb", the answer is "b", with the length of 1.
//
//  Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring,
//  "pwke" is a subsequence and not a substring.
//
//  Accepted. See [LongestSubstringWithoutRepeatingCharactersTests](./LeetCodeTests/LongestSubstringWithoutRepeatingCharacters.swift) for
//  test cases.
//

import Foundation

class LongestSubstringWithoutRepeatingCharacters {
    
    func lengthOfLongestSubstring(_ s: String) -> Int {
        if s.isEmpty {
             return 0
        }
        
        var result = ""
        var tmp = ""
        let inputChars = Array(s)
        
        for i in 0...(inputChars.count - 1) {
            if tmp.range(of: String(inputChars[i])) != nil {
                let array = tmp.components(separatedBy: String(inputChars[i]))
                let s1 = array[array.count - 1]
                tmp = ""
                tmp.append(String(s1))
            }
            
            tmp.append(String(inputChars[i]))
            
            if tmp.count > result.count {
                result = ""
                result.append(tmp)
            }
        }
        
        return result.count
    }
    
}
