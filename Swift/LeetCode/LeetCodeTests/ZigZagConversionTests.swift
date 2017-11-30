//
//  ZigZagConversionTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 30/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//

import XCTest
@testable import LeetCode

class ZigZagConversionTests: XCTestCase {
    
    func testConvert() {
        let z = ZigZagConversion()
        
        XCTAssertTrue(z.convert("0123456789", 1) == "0123456789")

        XCTAssertTrue(z.convert("PAYPALISHIRING", 3) == "PAHNAPLSIIGYIR")
      
        XCTAssertTrue(z.convert("0123456789", 2) == "0246813579")
        
        XCTAssertTrue(z.convert("0123456789", 3) == "0481357926")
    }
    
}
