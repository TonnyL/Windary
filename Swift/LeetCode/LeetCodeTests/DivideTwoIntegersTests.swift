//
//  DivideTwoIntegersTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 10/01/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Test cases for [DivideTwoIntegers](./LeetCode/DivideTwoIntegers.swift).
//

import XCTest
@testable import LeetCode

class DivideTwoIntegersTests: XCTestCase {
    
    func testDivide() {
        let d = DivideTwoIntegers()
        
        XCTAssertTrue(d.divide(1, 1) == 1)
        
        XCTAssertTrue(d.divide(0, 1) == 0)
        
        XCTAssertTrue(d.divide(-1, -1) == 1)
        
        XCTAssertTrue(d.divide(2147483647, 1) == 2147483647)
        
        XCTAssertTrue(d.divide(2147483647, -2147483648) == 0)
        
        XCTAssertTrue(d.divide(-2147483648, -1) == 2147483647)
        
        XCTAssertTrue(d.divide(100, 6) == 16)
    }
    
}
