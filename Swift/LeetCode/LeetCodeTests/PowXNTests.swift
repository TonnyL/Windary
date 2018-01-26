//
//  PowXNTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 26/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Test cases for [PowXN](./LeetCode/PowXN.swift).
//

import XCTest
@testable import LeetCode

class PowXNTests: XCTestCase {
    
    func testExample() {
        let p = PowXN()
        
        XCTAssertTrue(p.myPow(2, 2) == 4.0)
        
        XCTAssertTrue(String.init(format: "%.5f", p.myPow(8.88023, 3)) == "700.28148")
        
        XCTAssertTrue(p.myPow(2, -2) == 0.25)
        
        XCTAssertTrue(p.myPow(0.00001, 2147483647) == 0.0)
        
        XCTAssertTrue(String.init(format: "%.5f", p.myPow(34.00515, -3)) == "0.00003")
    }
    
}
