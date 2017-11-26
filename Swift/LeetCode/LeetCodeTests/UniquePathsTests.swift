//
//  UniquePathsTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 26/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Test cases for [UniquePaths](./LeetCode/UniquePaths.swift).
//

import XCTest
@testable import LeetCode

class UniquePathsTests: XCTestCase {
    
    func testUniquePaths() {
        let up = UniquePaths()
        
        XCTAssertTrue(up.uniquePaths(1, 1) == 1)
        
        XCTAssertTrue(up.uniquePaths(1, 2) == 1)
        
        XCTAssertTrue(up.uniquePaths(2, 2) == 2)
        
        XCTAssertTrue(up.uniquePaths(4, 4) == 20)
    }

}
