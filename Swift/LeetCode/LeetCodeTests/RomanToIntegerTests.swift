//
//  RomanToIntegerTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 25/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Test cases for [RomanToInteger](./LeetCode/RomanToInteger.swift).
//

import XCTest
@testable import LeetCode

class RomanToIntegerTests: XCTestCase {
    
    func testRomanToInt() {
        let rti = RomanToInteger()
        
        // 621 = 500 + 100 + 10 + 10 +1
        XCTAssertTrue(rti.romanToInt("DCXXI") == 621)
        
        // 1996 = 1000 - (100 - 1000) - (10 - 100) + 5 + 1
        XCTAssertTrue(rti.romanToInt("MCMXCVI") == 1996)
        
        // 999 = - (100 - 1000) - (10 - 100) - (1 - 10)
        XCTAssertTrue(rti.romanToInt("CMXCIX") == 999)
    }
    
}
