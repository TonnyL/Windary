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
        
        // Expected: [[7], [2, 2, 3]]
        print(cs.combinationSum([2, 3, 6, 7], 7))
        
        // Expected: [[1, 1, 1]]
        print(cs.combinationSum([1], 3))
        
        // Expected: [[1, 1, 1, 1], [1, 1, 2], [2, 2]]
        print(cs.combinationSum([1, 2], 4))
    }
    
}
