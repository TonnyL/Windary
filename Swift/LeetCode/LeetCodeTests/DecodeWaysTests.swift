//
//  DecodeWaysTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 08/01/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Test cases for [DecodeWays](./LeetCode/DecodeWays.swift).
//

import XCTest
@testable import LeetCode

class DecodeWaysTests: XCTestCase {
    
    func testNumDecodings() {
        let dw = DecodeWays()
        
        // Expected: 1, ['A']
        print(dw.numDecodings("1"))
        
        // Expected: 0
        print(dw.numDecodings("0"))
        
        // Expected: 1, ['JA']
        print(dw.numDecodings("101"))
        
        // Expected: 1, ['AK']
        print(dw.numDecodings("110"))
        
        // Expected: 1, ['JJ']
        print(dw.numDecodings("1010"))
        
        // Expected: 0
        print(dw.numDecodings("012"))
        
        // Expected: 2, ['JAA', 'JK']
        print(dw.numDecodings("1011"))
        
        // Expected: 2, ['AB', 'L']
        print(dw.numDecodings("12"))
        
        // Expected: 3, ['ABC', 'LC', 'AW']
        print(dw.numDecodings("123"))
        
        // Expected: 3, ['ABAT', 'LAT', 'AUT']
        print(dw.numDecodings("12120"))
    }
    
}
