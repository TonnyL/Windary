//
//  UniqueBinarySearchTreesTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 28/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Test cases for [UniqueBinarySearchTrees](./LeetCode/UniqueBinarySearchTrees.swift).
//

import XCTest
@testable import LeetCode

class UniqueBinarySearchTreesTests: XCTestCase {
    
    func testNumTrees() {
        let u = UniqueBinarySearchTrees()
        
        XCTAssertTrue(u.numTrees(0) == 1)
        
        XCTAssertTrue(u.numTrees(1) == 1)
        
        XCTAssertTrue(u.numTrees(2) == 2)
        
        XCTAssertTrue(u.numTrees(3) == 5)
        
        XCTAssertTrue(u.numTrees(4) == 14)
    }
    
}
