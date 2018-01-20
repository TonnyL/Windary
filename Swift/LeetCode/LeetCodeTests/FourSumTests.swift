//
//  FourSumTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 20/01/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Test cases for [FourSum](./LeetCode/FourSum.swift) for test cases.
//

import XCTest
@testable import LeetCode

class FourSumTests: XCTestCase {
    
    func testFourSum() {
        let fs = FourSum()
        
        // Expected:
        // [[-1, 0, 0, 1], [-2, -1, 1, 2], [-2, 0, 0, 2]]
        print(fs.fourSum([1, 0, -1, 0, -2, 2], 0))
        
        // Expected:
        // [[-5, 0, 4, 5], [-3, -2, 4, 5]]
        print(fs.fourSum([-5, 5, 4, -3, 0, 0, 4, -2], 4))
    }
    
}
