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
        
        XCTAssertTrue(ts.threeSum([-1, 0]).isEmpty)
        
        let array0 = ts.threeSum([-1, 0, 1, 2, -1, -4])
        XCTAssertTrue(array0.count == 2)
        
        XCTAssertTrue(array0.contains {
            $0 == [-1, -1, 2]
        })
        XCTAssertTrue(array0.contains {
            $0 == [-1, 0, 1]
        })
        
        let array1 = ts.threeSum([0, 0, 0])
        XCTAssertTrue(array1.count == 1)
        XCTAssertTrue(array1[0] == [0, 0, 0])
        
        let array2 = ts.threeSum([-4, -2, -2, -2, 0, 1, 2, 2, 2, 3, 3, 4, 4, 6, 6])
        XCTAssertTrue(array2.count == 6)
        XCTAssertTrue(array2.contains {
            $0 == [-4, -2, 6]
        })
        XCTAssertTrue(array2.contains {
            $0 == [-4, 0, 4]
        })
        XCTAssertTrue(array2.contains {
            $0 == [-4, 1, 3]
        })
        XCTAssertTrue(array2.contains {
            $0 == [-4, 2, 2]
        })
        XCTAssertTrue(array2.contains {
            $0 == [-2, -2, 4]
        })
        XCTAssertTrue(array2.contains {
            $0 == [-2, 0, 2]
        })
    }
    
}
