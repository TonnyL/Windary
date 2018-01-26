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
        
        let array0 = fs.fourSum([1, 0, -1, 0, -2, 2], 0)
        XCTAssertTrue(array0.count == 3)
        XCTAssertTrue(array0.contains {
            $0 == [-1, 0, 0, 1]
        })
        XCTAssertTrue(array0.contains {
            $0 == [-2, -1, 1, 2]
        })
        XCTAssertTrue(array0.contains {
            $0 == [-2, 0, 0, 2]
        })
        
        let array1 = fs.fourSum([-5, 5, 4, -3, 0, 0, 4, -2], 4)
        XCTAssertTrue(array1.count == 2)
        XCTAssertTrue(array1.contains {
            $0 == [-5, 0, 4, 5]
        })
        XCTAssertTrue(array1.contains {
            $0 == [-3, -2, 4, 5]
        })
    }
    
}
