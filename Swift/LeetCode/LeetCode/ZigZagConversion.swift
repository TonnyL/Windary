//
//  ZigZagConversion.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 30/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows
//  like this: (you may want to display this pattern in a fixed font for better legibility)
//
//  P   A   H   N
//  A P L S I I G
//  Y   I   R
//  And then read line by line: "PAHNAPLSIIGYIR"
//  Write the code that will take a string and make this conversion given a number of rows:
//
//  string convert(string text, int nRows);
//  convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
//
//  Accepted. See [ZigZagConversionTests](./LeetCodeTests/ZigZagConversionTests.swift) for test cases.
//

import Foundation

class ZigZagConversion {
    
    func convert(_ s: String, _ numRows: Int) -> String {
        let array = Array(s)
        
        if array.count < 2 || numRows <= 1 {
            return s
        }
        
        var result = ""
        for i in 0...numRows - 1 {
            var j = 0
            var index = i
            while index < array.count {
                result.append(array[index])
                if (i != 0 && i != numRows - 1 && index + (numRows - i - 1) * 2 < array.count) {
                    result.append(array[index + (numRows - i - 1) * 2])
                }
                j += 1
                index = (2 * numRows - 2) * j + i
            }
        }
        
        return result
    }
    
}
