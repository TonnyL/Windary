//
//  ReverseIntegerTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 25/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Test cases for [ReverseInteger](./LeetCode/ReverseInteger.swift).
//

import XCTest
@testable import LeetCode

class ReverseIntegerTests: XCTestCase {
    
    func testReverse() {
        let vi = ReverseInteger()
        
        XCTAssertTrue(vi.reverse(123) == 321)
        
        XCTAssertTrue(vi.reverse(-123) == -321)
        
        XCTAssertTrue(vi.reverse(1000000003) == 0)
        
        XCTAssertTrue(vi.reverse(1534236469) == 0)
        
    }
    
}
