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
        
        // Expected: [[1, 7], [1, 2, 5], [2, 6], [1, 1, 6]]
        print(cs.combinationSum2([10, 1, 2, 7, 6, 1, 5], 8))
        
        // Expected: []
        print(cs.combinationSum2([1], 2))
        
        // Expected: [[1, 1, 2], [2, 2]]
        print(cs.combinationSum2([1, 1, 2, 2], 4))
    }
    
}
