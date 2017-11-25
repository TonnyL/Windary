//
//  StringToIntegerAtoiTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 25/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Test cases for [StringToIntegerAtoi](./LeetCode/StringToIntegerAtoi.swift).
//

import XCTest
@testable import LeetCode

class StringToIntegerAtoiTests: XCTestCase {
    
    func testMyAtoi() {
        let atoi = StringToIntegerAtoi()
        
        XCTAssertTrue(atoi.myAtoi("+-1") == 0)
        
        XCTAssertTrue(atoi.myAtoi("-00123a66") == -123)
        
        XCTAssertTrue(atoi.myAtoi("-1") == -1)
        
        XCTAssertTrue(atoi.myAtoi("    10522545459") == 2147483647)
        
        XCTAssertTrue(atoi.myAtoi("-2147483647") == -2147483647)
        
        XCTAssertTrue(atoi.myAtoi("2147483648") == 2147483647)
        
        XCTAssertTrue(atoi.myAtoi("-2147483649") == -2147483648)
        
        XCTAssertTrue(atoi.myAtoi("2147483647") == 2147483647)
        
    }
    
}
