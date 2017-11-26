//
//  SearchInsertPositionTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 26/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Test cases for [SearchInsertPosition](./LeetCode/SearchInsertPosition.swift).
//

import XCTest
@testable import LeetCode

class SearchInsertPositionTests: XCTestCase {
    
    func testSearchInsert() {
        let sip = SearchInsertPosition()
        
        XCTAssertTrue(sip.searchInsert([1], 0) == 0)
        
        XCTAssertTrue(sip.searchInsert([1, 3, 5, 6], 5) == 2)
        
        XCTAssertTrue(sip.searchInsert([1, 3, 5, 6], 2) == 1)
        
        XCTAssertTrue(sip.searchInsert([1, 3, 5, 6], 7) == 4)
        
        XCTAssertTrue(sip.searchInsert([1, 3, 5, 6], 0) == 0)
    }
    
}
