//
//  SearchA2DMatrixTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 27/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Test cases for [SearchA2DMatrix](./LeetCode/SearchA2DMatrix.swift).
//

import XCTest
@testable import LeetCode

class SearchA2DMatrixTests: XCTestCase {
    
    func testSearchMatrix() {
        let s = SearchA2DMatrix()
        
        XCTAssertFalse(s.searchMatrix([], 0))
        
        XCTAssertFalse(s.searchMatrix([[]], 1))
        
        XCTAssertTrue(s.searchMatrix([[1, 3, 5, 7], [10, 11, 16, 20], [23, 30, 34, 50]], 3))
        
        XCTAssertTrue(s.searchMatrix([[1]], 1))
    }
    
}
