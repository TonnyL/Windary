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
        XCTAssertTrue(dw.numDecodings("1") == 1)
        
        // Expected: 0
        XCTAssertTrue(dw.numDecodings("0") == 0)
        
        // Expected: 1, ['JA']
        XCTAssertTrue(dw.numDecodings("101") == 1)
        
        // Expected: 1, ['AK']
        XCTAssertTrue(dw.numDecodings("110") == 1)
        
        // Expected: 1, ['JJ']
        XCTAssertTrue(dw.numDecodings("1010") == 1)
        
        // Expected: 0
        XCTAssertTrue(dw.numDecodings("012") == 0)
        
        // Expected: 2, ['JAA', 'JK']
        XCTAssertTrue(dw.numDecodings("1011") == 2)
        
        // Expected: 2, ['AB', 'L']
        XCTAssertTrue(dw.numDecodings("12") == 2)
        
        // Expected: 3, ['ABC', 'LC', 'AW']
        XCTAssertTrue(dw.numDecodings("123") == 3)
        
        // Expected: 3, ['ABAT', 'LAT', 'AUT']
        XCTAssertTrue(dw.numDecodings("12120") == 3)
    }
    
}
