//
//  SearchInRotatedSortedArrayIITests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 09/01/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Test cases for [SearchInRotatedSortedArrayII](./LeetCode/SearchInRotatedSortedArrayII.swift).
//

import XCTest
@testable import LeetCode

class SearchInRotatedSortedArrayIITests: XCTestCase {
    
    func testSearch() {
        let s = SearchInRotatedSortedArrayII()
        
        XCTAssertFalse(s.search([3, 2], 4))
        
        XCTAssertFalse(s.search([3, 1, 2], 4))
        
        XCTAssertTrue(s.search([3, 1, 2], 2))
        
        XCTAssertTrue(s.search([2, 2, 2, 2, 3, 4, 1, 1], 4))
        
        XCTAssertTrue(s.search([4, 5, 6, 7, 0, 1, 2], 2))
        
        XCTAssertTrue(s.search([4, 5, 6, 7, 0, 1, 2], 7))
        
        XCTAssertTrue(s.search([4, 5, 6, 7, 0, 1, 2], 5))
    }
    
}
