//
//  ImplementStrStr.swift
//  LeetCode
//
//  Created by 黎赵太郎 on 25/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Implement strStr().
//
//  Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
//
//  Accepted. See [ImplementStrStrTests](./LeetCodeTest/ImplementStrStr.swift) for the test cases.
//

import Foundation

class ImplementStrStr {
    
    func strStr(_ haystack: String, _ needle: String) -> Int {
        if needle.count > haystack.count {
            return -1
        }
        if needle.count == 0 || haystack.count == 0 {
            return 0
        }
        
        var i = 0
        while i <= (haystack.count - needle.count) {
            if String(Array(haystack)[i...(i + needle.count - 1)]) == needle {
                return i
            }
            i += 1
        }
        
        return -1
    }
    
}
