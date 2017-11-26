//
//  AddBinary.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 26/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Given two binary strings, return their sum (also a binary string).
//
//  For example,
//  a = "11"
//  b = "1"
//  Return "100".
//
//  Accepted. See [AddBinaryTests](./LeetCodeTests/AddBinaryTests.swift) for test cases.
//

import Foundation

class AddBinary {
    
    func addBinary(_ a: String, _ b: String) -> String {
        if a.isEmpty {
            return b
        }
        if b.isEmpty {
            return a
        }
        
        var flag = false
        var longer = Array(a)
        if b.count > a.count {
            longer = Array(b)
        }
        var shorter = Array(b)
        if a.count < b.count {
            shorter = Array(a)
        }
        
        var result = ""
        var i = longer.count - 1
        var j = shorter.count - 1
        
        while i >= 0 {
            if j < 0 {
                if longer[i] == "1" {
                    if flag {
                        result.append("0")
                    } else {
                        result.append("1")
                    }
                } else {
                    if flag {
                        result.append("1")
                        flag = false
                    } else {
                        result.append("0")
                    }
                }
            } else {
                if longer[i] == "1" && shorter[j] == "1" {
                    if flag {
                        result.append("1")
                    } else {
                        result.append("0")
                    }
                    flag = true
                } else if longer[i] == "0" && shorter[j] == "0" {
                    if flag {
                        result.append("1")
                    } else {
                        result.append("0")
                    }
                    flag = false
                } else {
                    if flag {
                        result.append("0")
                        flag = true
                    } else {
                        result.append("1")
                    }
                }
            }
            
            i -= 1
            j -= 1
        }
        
        if flag {
            result.append("1")
        }
        
        return String(result.reversed())
    }
    
}
