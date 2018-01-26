//
//  PlusOneTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 26/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Test cases for [PlusOne](./LeetCode/PlusOne.swift).
//

import XCTest
@testable import LeetCode

class PlusOneTests: XCTestCase {
    
    func testPlusOne() {
        let po = PlusOne()
        
        XCTAssertTrue(po.plusOne([1]) == [2])
        
        XCTAssertTrue(po.plusOne([9]) == [1, 0])
        
        XCTAssertTrue(po.plusOne([9, 9]) == [1, 0, 0])
        
        XCTAssertTrue(po.plusOne([2, 8, 9, 9, 9]) == [2, 9, 0, 0, 0])
        
        XCTAssertTrue(po.plusOne([2, 8, 8, 9]) == [2, 8, 9, 0])
    }
    
}
