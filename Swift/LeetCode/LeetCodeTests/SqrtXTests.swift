//
//  SqrtXTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 24/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Test cases for [SqrtX](./LeetCode/Sqrt.swift)
//

import XCTest
@testable import LeetCode

class SqrtXTests: XCTestCase {

    func testMySqrt() {
        let sx = SqrtX()
        // Expected: 0
        XCTAssertTrue(sx.mySqrt(0) == 0)
        // Expected: 1
        XCTAssertTrue(sx.mySqrt(1) == 1)
        // Expected: 46339
        XCTAssertTrue(sx.mySqrt(2147395599) == 46339)
        // Expected: 46340
        XCTAssertTrue(sx.mySqrt(2147395600) == 46340)
        // Expected: 2
        XCTAssertTrue(sx.mySqrt(6) == 2)
    }

}
