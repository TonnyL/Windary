
//
//  RestoreIPAddresses.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 06/01/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Given a string containing only digits, restore it by returning all possible valid IP address combinations.
//
//  For example:
//  Given "25525511135",
//
//  return ["255.255.11.135", "255.255.111.35"]. (Order does not matter)
//
//  Accepted. See [RestoreIPAddressesTests](./LeetCodeTests/RestoreIPAddressesTests.swift) for test cases.
//

import Foundation

class RestoreIPAddresses {
    
    func restoreIpAddresses(_ s: String) -> [String] {
        var results = Array<String>.init()
        var chars = Array(s)
        if chars.count < 4 || chars.count > 12 {
            return results
        }
        
        for i in 1...4 {
            for j in 1...4 {
                for k in 1...4 {
                    for m in 1...4 {
                        if i + j + k + m == chars.count {
                            let a = Int(String(chars[0...i - 1]))!
                            let b = Int(String(chars[i...i + j - 1]))!
                            let c = Int(String(chars[i + j...i + j + k - 1]))!
                            let d = Int(String(chars[i + j + k...i + j + k + m - 1]))!
                            if a <= 255 && b <= 255 && c <= 255 && d <= 255 {
                                let string = String(format: "%i.%i.%i.%i", a, b, c, d)
                                if string.count == chars.count + 3 {
                                    results.append(string)
                                }
                            }
                        }
                    }
                }
            }
        }
        
        return results
    }
    
}
