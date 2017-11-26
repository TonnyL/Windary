//
//  CountAndSay.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 26/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//
//  The count-and-say sequence is the sequence of integers with the first five terms as following:
//
//  1.     1
//  2.     11
//  3.     21
//  4.     1211
//  5.     111221
//  1 is read off as "one 1" or 11.
//  11 is read off as "two 1s" or 21.
//  21 is read off as "one 2, then one 1" or 1211.
//  Given an integer n, generate the nth term of the count-and-say sequence.
//
//  Note: Each term of the sequence of integers will be represented as a string.
//
//  Example 1:
//
//  Input: 1
//  Output: "1"
//  Example 2:
//
//  Input: 4
//  Output: "1211"
//
//  Accepted. See [CountAndSayTests](./LeetCodeTests/CountAndSayTests.swift) for test cases.
//

import Foundation

class CountAndSay {
    
    func countAndSay(_ n: Int) -> String {
        if n <= 0 {
            return "0"
        }
        if n == 1 {
            return "1"
        }
        
        var result: [String] = []
        let charArray = Array(countAndSay(n - 1))
        var i = 0
        while i < (charArray.count - 1) {
            var count = 1
            while (i + 1) < charArray.count && charArray[i] == charArray[i + 1] {
                count += 1
                i += 1
            }
            
            result.append(String(count))
            result.append(String(charArray[i]))
            
            i += 1
        }
        
        if (charArray.count - 2) >= 0 && charArray[(charArray.count - 1)] == charArray[(charArray.count - 2)] {
            result[result.count - 2] = String(Int(result[result.count - 2])!)
        } else {
            result.append(String(charArray[charArray.count - 1]))
            result.append("1")
        }
        
        return result.joined()
    }
    
}
