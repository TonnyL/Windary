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
        
        var array0 = [1, 1, 1, 2, 2, 3]
        XCTAssertTrue(r.removeDuplicates(&array0) == 5)
        
        var array1 = [1, 1, 2, 2, 3]
        XCTAssertTrue(r.removeDuplicates(&array1) == 5)
        
        var array2: [Int] = []
        XCTAssertTrue(r.removeDuplicates(&array2) == 0)
        
        var array3 = [1, 1]
        XCTAssertTrue(r.removeDuplicates(&array3) == 2)
        
        var array4 = [1, 1, 1, 1]
        XCTAssertTrue(r.removeDuplicates(&array4) == 2)
    }
    
}
