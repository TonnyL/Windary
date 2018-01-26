//
//  SpiralMatrixIITests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 26/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Test cases for [SpiralMatrixII](./LeetCode/SpiralMatrixII.swift).
//

import XCTest
@testable import LeetCode

class SpiralMatrixIITests: XCTestCase {
    
    func testGenerateMatrix() {
        let s = SpiralMatrixII()
        
        XCTAssertTrue(s.generateMatrix(0).isEmpty)
        
        let r1 = s.generateMatrix(1)
        XCTAssertTrue(r1.count == 1)
        XCTAssertTrue(r1[0] == [1])
        
        let r2 = s.generateMatrix(2)
        XCTAssertTrue(r2.count == 2)
        XCTAssertTrue(r2[0] == [1, 2])
        XCTAssertTrue(r2[1] == [4, 3])
        
        let r3 = s.generateMatrix(4)
        XCTAssertTrue(r3.count == 4)
        XCTAssertTrue(r3[0] == [1, 2, 3, 4])
        XCTAssertTrue(r3[1] == [12, 13, 14, 5])
        XCTAssertTrue(r3[2] == [11, 16, 15, 6])
        XCTAssertTrue(r3[3] == [10, 9, 8, 7])
    }
    
}
