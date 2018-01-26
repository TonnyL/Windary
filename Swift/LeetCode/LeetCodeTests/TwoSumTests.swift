//
//  AddBinaryTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 24/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Test cases for [TwoSum](./LeetCode/TwoSum.swift).
//

import XCTest
@testable import LeetCode

class TwoSumTests: XCTestCase {
    
    func testTwoSum() {
        let ts = TwoSum()
        
        XCTAssertTrue(ts.twoSum([2, 5, 5, 11], 10) == [1, 2])
    }

}
