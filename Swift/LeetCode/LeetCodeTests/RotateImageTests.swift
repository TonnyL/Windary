//
//  RotateImageTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 29/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Test cases for [RotateImage](./LeetCode/RotateImage.swift).
//

import XCTest
@testable import LeetCode

class RotateImageTests: XCTestCase {
    
    func testExample() {
        let ri = RotateImage()
        
        var ints1 = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
        ri.rotate(&ints1)
        XCTAssertTrue(ints1[0] == [7, 4, 1])
        XCTAssertTrue(ints1[1] == [8, 5, 2])
        XCTAssertTrue(ints1[2] == [9, 6, 3])
        
        var ints2 = [[5, 1, 9, 11], [2, 4, 8, 10], [13, 3, 6, 7], [15, 14, 12, 16]]
        ri.rotate(&ints2)
        XCTAssertTrue(ints2[0] == [15, 13, 2, 5])
        XCTAssertTrue(ints2[1] == [14, 3, 4, 1])
        XCTAssertTrue(ints2[2] == [12, 6, 8, 9])
        XCTAssertTrue(ints2[3] == [16, 7, 10, 11])
    }
    
}
