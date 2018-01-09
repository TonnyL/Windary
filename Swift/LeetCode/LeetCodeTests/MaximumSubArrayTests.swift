//
//  MaximumSubArrayTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 09/01/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Test cases for [MaximumSubArray](./LeetCode/MaximumSubArray.swift).
//

import XCTest
@testable import LeetCode

class MaximumSubArrayTests: XCTestCase {
    
    func testMaxSubArray() {
        let ms = MaximumSubArray()
        
        XCTAssertTrue(ms.maxSubArray([1]) == 1)
        
        XCTAssertTrue(ms.maxSubArray([-4, -2]) == -2)
        
        XCTAssertTrue(ms.maxSubArray([1, 0, -1]) == 1)
        
        XCTAssertTrue(ms.maxSubArray([-2, 1, -3, 4, -1, 2, 1, -5, 4]) == 6)
    }
    
}
