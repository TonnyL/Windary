//
//  ContainerWithMostWaterTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 25/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Test cases for [ContainerWithMostWater](./LeetCode/ContainerWithMostWater.swift).
//

import XCTest
@testable import LeetCode

class ContainerWithMostWaterTests: XCTestCase {
    
    func testMaxArea() {
        let c = ContainerWithMostWater()
        
        XCTAssertTrue(c.maxArea([1, 1]) == 1)
        
        XCTAssertTrue(c.maxArea([1, 4, 9]) == 4)
        
        XCTAssertTrue(c.maxArea([1, 4, 9, 4]) == 8)
    }
    
}
