//
//  MultiplyStringsTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 19/12/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Test cases for [MultiplyStrings](./LeetCode/MultiplyStrings.swift).
//

import XCTest
@testable import LeetCode

class MultiplyStringsTests: XCTestCase {
    
    func testExample() {
        let ms = MultiplyStrings()
        
        XCTAssertTrue(ms.multiply("", "") == "0")
        
        XCTAssertTrue(ms.multiply("0", "0") == "0")
        
        XCTAssertTrue(ms.multiply("100", "1") == "100")
        
        XCTAssertTrue(ms.multiply("123", "45") == "5535")
        
        XCTAssertTrue(ms.multiply("99", "99") == "9801")
        
        XCTAssertTrue(ms.multiply("123", "123") == "15129")
        
        XCTAssertTrue(ms.multiply("123456789", "123456789") == "15241578750190521")
    }
    
}
