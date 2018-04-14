//
//  RotateArray.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 2018/4/14.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Test cases for [RotateArray](./LeetCode/RotateArray.swift).
//

import XCTest
@testable import LeetCode

class RotateArrayTests: XCTestCase {
    
    func testRotate() {
        let ra = RotateArray()
        
        var array0 = [1]
        ra.rotate(&array0, 1)
        XCTAssertEqual(array0, [1])
        
        var array1 = [1, 2]
        ra.rotate(&array1, 1)
        XCTAssertEqual(array1, [2, 1])
        
        var array2 = [1, 2, 3, 4, 5, 6, 7]
        ra.rotate(&array2, 3)
        XCTAssertEqual(array2, [5, 6, 7, 1, 2, 3, 4])
    }
    
}
