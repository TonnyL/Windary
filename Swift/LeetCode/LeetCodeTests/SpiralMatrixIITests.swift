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
        
        // Expected: []
        print(s.generateMatrix(0))
        
        // Expected: [[1]]
        print(s.generateMatrix(1))
        
        // Expected: [[1, 2], [4, 3]]
        print(s.generateMatrix(2))
        
        // Expected: [[1, 2, 3, 4], [12, 13, 14, 5], [11, 16, 15, 6], [10, 9, 8, 7]]
        print(s.generateMatrix(4))
    }
    
}
