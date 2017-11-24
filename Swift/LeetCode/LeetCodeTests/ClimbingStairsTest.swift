//
//  Created by 黎赵太郎 on 24/11/2017.
//  Copyright (c) 2017 lizhaotailang. All rights reserved.
//
//  Test cases for [ClimbingStairs](./LeetCode/ClimbingStairs.swift).
//

import XCTest
@testable import LeetCode

class ClimbingStairsTests: XCTestCase {

    func testClimbStairs() {
        let cs = ClimbingStairs()
        // Expected: 1
        XCTAssertTrue(cs.climbStairs(1) == 1)
        // Expected: 3
        XCTAssertTrue(cs.climbStairs(3) == 3)
        // Expected: 8
        XCTAssertTrue(cs.climbStairs(5) == 8)
    }

}
