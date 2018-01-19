//
//  LetterCombinationsOfAPhoneNumber.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 19/01/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Given a digit string, return all possible letter combinations that the number could represent.
//
//  A mapping of digit to letters (just like on the telephone buttons) is given below.
//
//  Input:Digit string "23"
//  Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
//  Note:
//  Although the above answer is in lexicographical order, your answer could be in any order you want.
//
//  Accepted. See [LetterCombinationsOfAPhoneNumberTests](./LeetCodeTests/LetterCombinationsOfAPhoneNumberTests.swift) for test cases.
//

import Foundation

class LetterCombinationsOfAPhoneNumber {
    
    func letterCombinations(_ digits: String) -> [String] {
        let dict = [" ", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"]
        var results = Array<String>.init()
        
        if (digits.count == 0) {
            return results
        }
        
        if (digits.count == 1) {
            for c in dict[Int(digits)!] {
                results.append(String(c))
            }
            
            return results
        }
        
        let array = Array(digits)
        
        let list = letterCombinations(String(array[1..<array.count]))
        var builder = ""
        
        for c in dict[Int(String(array[0..<1]))!] {
            for s in list {
                builder += String(c)
                builder += s
                results.append(builder)
                builder = ""
            }
        }
        
        return results
    }
    
}
