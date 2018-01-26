//
//  RemoveDuplicatesFromSortedArrayTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 25/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Test cases for [RemoveDuplicatesFromSortedArray](./LeetCode/RemoveDuplicatesFromSortedArray.swift).
//

import XCTest
@testable import LeetCode

class RemoveDuplicatesFromSortedArrayTests: XCTestCase {
    
    func testRemoveDuplicates() {
        let r = RemoveDuplicatesFromSortedArray()
        
        var array: [Int] = []
        XCTAssertTrue(r.removeDuplicates(&array) == 0)
        
        var array122 = [1, 2, 2]
        XCTAssertTrue(r.removeDuplicates(&array122) == 2)
        
        var array111 = [1, 1, 1]
        XCTAssertTrue(r.removeDuplicates(&array111) == 1)
        
        var array11234 = [1, 1, 2, 3, 4]
        XCTAssertTrue(r.removeDuplicates(&array11234) == 4)
    }
    
}
