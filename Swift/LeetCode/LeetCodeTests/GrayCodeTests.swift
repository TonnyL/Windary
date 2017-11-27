//
//  GrayCodeTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 27/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Test cases for [GrayCode](./LeetCode/GrayCode.swift).
//

import XCTest
@testable import LeetCode

class GrayCodeTests: XCTestCase {
    
    func testExample() {
        let gc = GrayCode()
        
        XCTAssertTrue(gc.grayCode(0) == [0])
        
        XCTAssertTrue(gc.grayCode(2) == [0, 1, 3, 2])
        
        XCTAssertTrue(gc.grayCode(3) == [0, 1, 3, 2, 6, 7, 5, 4])
    }
    
}
