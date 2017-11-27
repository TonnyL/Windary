//
//  GrayCode.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 27/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  The gray code is a binary numeral system where two successive values differ in only one bit.
//
//  Given a non-negative integer n representing the total number of bits in the code, print the sequence of gray code. A gray code sequence must begin with 0.
//
//  For example, given n = 2, return [0,1,3,2]. Its gray code sequence is:
//
//  00 - 0
//  01 - 1
//  11 - 3
//  10 - 2
//  Note:
//  For a given n, a gray code sequence is not uniquely defined.
//
//  For example, [0,2,3,1] is also a valid gray code sequence according to the above definition.
//
//  For now, the judge is able to judge based on one instance of gray code sequence. Sorry about that.
//
//  Accepted. See [GrayCodeTests](./LeetCodeTests/GrayCodeTests.swift) for test cases.
//

import Foundation

class GrayCode {
    
    func grayCode(_ n: Int) -> [Int] {
        if n <= 0 {
            return [0]
        }
        if n == 1 {
            return [0, 1]
        }
        
        var resultList = grayCode(n - 1)
        for i in resultList.indices.reversed() {
            resultList.append(resultList[i] + Int(pow(Double(2), Double(n - 1))))
        }
        
        return resultList
    }
    
}
