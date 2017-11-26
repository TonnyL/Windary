//
//  SpiralMatrixTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 26/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Test cases for [SpiralMatrix](./LeetCode/SpiralMatrix.swift).
//

import XCTest
@testable import LeetCode

class SpiralMatrixTests: XCTestCase {
    
    func testSpiralOrder() {
        let sm = SpiralMatrix()
        
        XCTAssertTrue(sm.spiralOrder([]).isEmpty)
        
        XCTAssertTrue(sm.spiralOrder([[1], [2], [3]]) == [1, 2, 3])
        
        XCTAssertTrue(sm.spiralOrder([[1, 2, 3]]) == [1, 2, 3])
        
        XCTAssertTrue(sm.spiralOrder([[1, 2, 3, 4, 5, 6, 7, 8, 9, 10], [11, 12, 13, 14, 15, 16, 17, 18, 19, 20]]) == [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11])
        
        XCTAssertTrue(sm.spiralOrder([[1, 2], [3, 4]]) == [1, 2, 4, 3])
        
        XCTAssertTrue(sm.spiralOrder([[1, 2], [3, 4], [5, 6]]) == [1, 2, 4, 6, 5, 3])
        
        XCTAssertTrue(sm.spiralOrder([[1, 2, 3], [4, 5, 6], [7, 8, 9]]) == [1, 2, 3, 6, 9, 8, 7, 4, 5])
        
        XCTAssertTrue(sm.spiralOrder([[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]]) == [1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7])
    }
    
}
