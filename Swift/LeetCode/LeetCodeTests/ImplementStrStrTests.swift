//
//  ImplementStrStrTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 25/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Test cases for [ImplementStrStr](./LeetCode/ImplementStrStr.swift).
//

import XCTest
@testable import LeetCode

class ImplementStrStrTests: XCTestCase {
    
    func testStrStr() {
        let iss = ImplementStrStr()
        
        XCTAssertTrue(iss.strStr("aaab", "b") == 3)
    
        XCTAssertTrue(iss.strStr("", "") == 0)
    
        XCTAssertTrue(iss.strStr("", "a") == -1)
    
        XCTAssertTrue(iss.strStr("whats up", "s ") == 4)
    }
    
}
