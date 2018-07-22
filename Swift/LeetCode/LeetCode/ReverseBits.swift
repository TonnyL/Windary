//
//  ReverseBits.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 2018/7/22.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Reverse bits of a given 32 bits unsigned integer.
//
//  Example:
//
//  Input: 43261596
//  Output: 964176192
//  Explanation: 43261596 represented in binary as 00000010100101000001111010011100,
//  return 964176192 represented in binary as 00111001011110000010100101000000.
//  Follow up:
//  If this function is called many times, how would you optimize it?
//
//  Not submitted. See [ReverseBitsTests](/LeetCodeTests/ReverseBitsTests.swift) for test cases.
//

import Foundation

class ReverseBits {
    
    func reverseBits(_ n: UInt32) -> UInt32 {
        var newN = n
        var tmp = UInt32(0)
        for _ in 0..<32 {
            tmp = tmp * 2 + newN % 2
            newN /= 2
        }
        return tmp
    }
    
}
