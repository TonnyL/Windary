//
//  ThreeSumClosestTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 18/01/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Test cases for [ThreeSumClosest](./LeetCode/ThreeSumClosest.swift).
//

import XCTest
@testable import LeetCode

class ThreeSumClosestTests: XCTestCase {
    
    func testThreeSumClosest() {
        let t = ThreeSumClosest()
        
        XCTAssertTrue(t.threeSumClosest([-1, 2, 1, 4], 1) == 2)
        
        XCTAssertTrue(t.threeSumClosest([1, 1, 1, 0], 100) == 3)
        
        XCTAssertTrue(t.threeSumClosest([1, 1, 1, 0], -100) == 2)
        
        XCTAssertTrue(t.threeSumClosest([-1, 2, 1, -4], 1) == 2)
    }
    
}
