//
//  LongestPalindromicSubstring.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 16/12/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Given a string s, find the longest palindromic substring in s.
//  You may assume that the maximum length of s is 1000.
//
//  Example:
//
//  Input: "babad"
//
//  Output: "bab"
//
//  Note: "aba" is also a valid answer.
//  Example:
//
//  Input: "cbbd"
//
//  Output: "bb"
//
//  Accepted. See [LongestPalindromicSubstringTest](./LeetCodeTests/LongestPalindromicSubstringTests.swfit) for test cases.
//

import Foundation

class LongestPalindromicSubstring {
    
    func longestPalindrome(_ s: String) -> String {
        let array = Array(s)
        if array.count <= 1 {
            return s
        }
        
        var maxLength = 0
        var startIndex = 0
        
        for index in array.indices {
            var leftIndex = index
            var rightIndex = index
            while leftIndex >= 0 && rightIndex < array.count && array[leftIndex] == array[rightIndex] {
                let current = rightIndex - leftIndex + 1
                if current > maxLength {
                    maxLength = current
                    startIndex = leftIndex
                }
                leftIndex -= 1
                rightIndex += 1
            }
            
            leftIndex = index
            rightIndex = index + 1
            while leftIndex >= 0 && rightIndex < array.count && array[leftIndex] == array[rightIndex] {
                let current = rightIndex - leftIndex + 1
                if current > maxLength {
                    maxLength = current
                    startIndex = leftIndex
                }
                leftIndex -= 1
                rightIndex += 1
            }
        }
        return String(array[startIndex..<startIndex + maxLength])
    }
    
}
