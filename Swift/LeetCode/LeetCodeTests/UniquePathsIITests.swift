//
//  UniquePathsIITests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 26/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Test cases for [UniquePathsII](./LeetCode/UniquePathsII.swift).
//

import XCTest
@testable import LeetCode

class UniquePathsIITests: XCTestCase {
    
    func testUniquePathsWithObstacles() {
        let up = UniquePathsII()
        
        XCTAssertTrue(up.uniquePathsWithObstacles([[0, 0, 0]]) == 1)
    
        XCTAssertTrue(up.uniquePathsWithObstacles([[0, 1, 0]]) == 0)
    
        XCTAssertTrue(up.uniquePathsWithObstacles([[1], [0]]) == 0)
        
        XCTAssertTrue(up.uniquePathsWithObstacles([[0], [1]]) == 0)
        
        XCTAssertTrue(up.uniquePathsWithObstacles([[0, 0], [1, 1], [0, 0]]) == 0)
        
        XCTAssertTrue(up.uniquePathsWithObstacles([[0], [0]]) == 1)
        // The matrix:
        // 1 1 1
        // 1 0 1
        // 1 1 2
        XCTAssertTrue(up.uniquePathsWithObstacles([[0, 0, 0], [0, 1, 0], [0, 0, 0]]) == 2)
        // The matrix:
        // 1 1 1 1
        // 1 0 1 2
        // 1 1 2 4
        // 1 2 4 8
        XCTAssertTrue(up.uniquePathsWithObstacles([[0, 0, 0, 0], [0, 1, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]]) == 8)
    }
    
}
