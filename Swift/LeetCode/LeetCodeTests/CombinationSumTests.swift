//
//  CombinationSumTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 21/01/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Test cases for [CombinationSum](./LeetCode/CombinationSum.swift).
//

import XCTest
@testable import LeetCode

class CombinationSumTests: XCTestCase {
    
    func testCombinationSum() {
        let cs = CombinationSum()
        
        let array0 = cs.combinationSum([2, 3, 6, 7], 7)
        XCTAssertTrue(array0.count == 2)
        XCTAssertTrue(array0.contains {
            $0 == [7]
        })
        XCTAssertTrue(array0.contains {
            $0 == [2, 2, 3]
        })
        
        let array1 = cs.combinationSum([1], 3)
        XCTAssertTrue(array1.count == 1)
        XCTAssertTrue(array1[0] == [1, 1, 1])
        
        let array2 = cs.combinationSum([1, 2], 4)
        XCTAssertTrue(array2.count == 3)
        XCTAssertTrue(array2.contains {
            $0 == [2, 2]
        })
        XCTAssertTrue(array2.contains {
            $0 == [1, 1, 1, 1]
        })
        XCTAssertTrue(array2.contains {
            $0 == [1, 1, 2]
        })
    }
    
}
