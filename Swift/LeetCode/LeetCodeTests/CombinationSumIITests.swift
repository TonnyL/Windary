//
//  CombinationSumIITests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 21/01/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Test cases for [CombinationSumII](./LeetCode/CombinationSumII.swift).
//

import XCTest
@testable import LeetCode

class CombinationSumIITests: XCTestCase {
    
    func testCombinationSum2() {
        let cs = CombinationSumII()
        
        let array0 = cs.combinationSum2([10, 1, 2, 7, 6, 1, 5], 8)
        XCTAssertTrue(array0.count == 4)
        XCTAssertTrue(array0.contains {
            $0 == [1, 7]
        })
        XCTAssertTrue(array0.contains {
            $0 == [1, 2, 5]
        })
        XCTAssertTrue(array0.contains {
            $0 == [2, 6]
        })
        XCTAssertTrue(array0.contains {
            $0 == [1, 1, 6]
        })
        
        XCTAssertTrue(cs.combinationSum2([1], 2).isEmpty)
        
        let array1 = cs.combinationSum2([1, 1, 2, 2], 4)
        XCTAssertTrue(array1.count == 2)
        XCTAssertTrue(array1.contains {
            $0 == [1, 1, 2]
        })
        XCTAssertTrue(array1.contains {
            $0 == [2, 2]
        })
    }
    
}
