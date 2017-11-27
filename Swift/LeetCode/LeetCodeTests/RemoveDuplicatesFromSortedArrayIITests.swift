//
//  RemoveDuplicatesFromSortedArrayIITests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 27/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Test cases for [RemoveDuplicatesFromSortedArrayII](./LeetCode/RemoveDuplicatesFromSortedArrayII.swift).
//

import XCTest
@testable import LeetCode

class RemoveDuplicatesFromSortedArrayIITests: XCTestCase {
    
    func testRemoveDuplicates() {
        let r = RemoveDuplicatesFromSortedArrayII()
        
        // Expected: 5
        // XCTAssertTrue(r.removeDuplicates([1, 1, 1, 2, 2, 3]) == 5)
        
        // Expected: 5
        // XCTAssertTrue(r.removeDuplicates([1, 1, 2, 2, 3]) == 5)
        
        // Expected: 0
        // XCTAssertTrue(r.removeDuplicates([]) == 0)
        
        // Expected: 2
        // XCTAssertTrue(r.removeDuplicates([1, 1]) == 2)
        
        // Expected: 2
        // XCTAssertTrue(r.removeDuplicates([1, 1, 1, 1]) == 2)
    }
    
}
