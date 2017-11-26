//
//  SearchInRotatedSortedArrayTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 26/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Test cases for [SearchInRotatedSortedArray](./LeetCode/SearchInRotatedSortedArray.swift).
//

import XCTest
@testable import LeetCode

class SearchInRotatedSortedArrayTests: XCTestCase {
    
    func testSearch() {
        let s = SearchInRotatedSortedArray()
        
        XCTAssertTrue(s.search([], 1) == -1)
        
        XCTAssertTrue(s.search([0, 1, 2, 4, 5, 6, 7], 7) == 6)
        
        XCTAssertTrue(s.search([4, 5, 6, 7, 0, 1, 2], 7) == 3)
        
        XCTAssertTrue(s.search([5, 6, 7, 0, 1, 2, 4], 7) == 2)
        
        XCTAssertTrue(s.search([4, 5, 6, 7, 0, 1, 2], 8) == -1)
    }
    
}
