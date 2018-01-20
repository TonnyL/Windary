//
//  IntegerToRoman.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 20/01/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Given an integer, convert it to a roman numeral.
//  Input is guaranteed to be within the range from 1 to 3999.
//
//  Accepted. See [IntegerToRomanTest](./LeetCodeTests/IntegerToRomanTests.swift) for test cases.
//

import Foundation

class IntegerToRoman {
    
    func intToRoman(_ num: Int) -> String {
        var newNum = num
        var result = ""
        let roman: [String] = ["M", "D", "C", "L", "X", "V", "I"]
        let value: [Int] = [1000, 500, 100, 50, 10, 5, 1]
        
        var n = 0
        while n < 7 {
            let x = newNum / value[n]
            if x < 4 {
                var i = 1
                while i <= x {
                    result.append(roman[n])
                    
                    i += 1
                }
            } else if (x == 4) {
                result.append(roman[n])
                result.append(roman[n - 1])
            } else if (x < 9) {
                result.append(roman[n - 1])
                var i = 6
                while i <= x {
                    result.append(roman[n])
                    
                    i += 1
                }
            } else if (x == 9) {
                result.append(roman[n])
                result.append(roman[n - 2])
            }
            newNum %= value[n]
            
            n += 2
        }
        
        return result
    }
    
}
