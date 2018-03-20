//
//  ExcelSheetColumnTitle.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 20/03/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Given a positive integer, return its corresponding column title as appear in an Excel sheet.
//
//  For example:
//
//  1 -> A
//  2 -> B
//  3 -> C
//  ...
//  26 -> Z
//  27 -> AA
//  28 -> AB
//
//  Accepted. See [ExcelSheetColumnTitleTests](./LeetCodeTests/ExcelSheetColumnTitleTests.swift) for test cases.
//

import Foundation

class ExcelSheetColumnTitle {
    
    func convertToTitle(_ n: Int) -> String {
        var newN = n
        var builder = Array<String>.init()
        while newN != 0 {
            if newN % 26 == 0 {
                builder.append("Z")
                newN -= 26
            } else {
                builder.append(String(Character(UnicodeScalar(newN % 26 - 1 + Int("A".unicodeScalars.first!.value))!)))
                newN -= newN % 26
            }
            
            newN /= 26
        }
        
        builder.reverse()
        
        return builder.joined(separator: "")
    }
    
}
