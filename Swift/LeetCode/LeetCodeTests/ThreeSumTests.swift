//
//  ThreeSumTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 03/12/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Test cases for [ThreeSum](./LeetCode/ThreeSum.swift).
//

import XCTest
@testable import LeetCode

class ThreeSumTests: XCTestCase {
    
    func testThreeSum() {
        let ts = ThreeSum()
        
        // Expected: []
        print(ts.threeSum([-1, 0]))
        
        // Expected: [[-1, -1, 2], [-1, 0, 1]]
        print(ts.threeSum([-1, 0, 1, 2, -1, -4]))
        
        // Expected: [[0, 0, 0]]
        print(ts.threeSum([0, 0, 0]))
        
        // Expected: [[-4, -2, 6], [-4, 0, 4], [-4, 1, 3], [-4, 2, 2], [-2, -2, 4], [-2, 0, 2]]
        print(ts.threeSum([-4, -2, -2, -2, 0, 1, 2, 2, 2, 3, 3, 4, 4, 6, 6]))

    }
    
}
