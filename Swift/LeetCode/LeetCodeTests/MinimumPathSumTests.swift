//
//  MinimumPathSumTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 26/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Test cases for [MinimumPathSum](./LeetCode/MinimumPathSum.swift).
//

import XCTest
@testable import LeetCode

class MinimumPathSumTests: XCTestCase {
    
    func testExample() {
        let m = MinimumPathSum()
        
        XCTAssertTrue(m.minPathSum([]) == 0)
        
        XCTAssertTrue(m.minPathSum([[]]) == 0)
        
        XCTAssertTrue(m.minPathSum([[1]]) == 1)
        // The matrix:
        // 1 4 5
        // 2 7 6
        // 6 8 7
        XCTAssertTrue(m.minPathSum([[1, 3, 1], [1, 5, 1], [4, 2, 1]]) == 7)
        // The matrix:
        // 1 2 3
        // 2 4 4
        // 3 6 5
        XCTAssertTrue(m.minPathSum([[1, 1, 1], [1, 2, 1], [1, 3, 1]]) == 5)
    }
    
}
