//
//  SearchForARangeTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 26/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Test cases for [SearchForARange](./LeetCode/SearchForARange.swift).
//

import XCTest
@testable import LeetCode

class SearchForARangeTests: XCTestCase {
    
    func testSearchRange() {
        let s = SearchForARange()
        
        XCTAssertTrue(s.searchRange([1], 1) == [0, 0])
        
        XCTAssertTrue(s.searchRange([5, 7, 7, 8, 8, 10], 11) == [-1, -1])
        
        XCTAssertTrue(s.searchRange([5, 7, 7, 8, 8, 10], 8) == [3, 4])
    }
    
}
