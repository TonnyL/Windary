//
//  CombinationsTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 05/01/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Test cases for [Combinations](./LeetCode/Combinations.swift).
//

import XCTest
@testable import LeetCode

class CombinationsTests: XCTestCase {
    
    func testCombine() {
        let c = Combinations()
        
        // Expected: []
        print(c.combine(2, 0))
        
        // Expected: [[1], [2]]
        print(c.combine(2, 1));
        
        // Expected: [[2,4], [3,4], [2,3], [1,2], [1,3], [1,4]]
        print(c.combine(4, 2));
        
        // Expected: [[1, 2, 3], [1, 2, 4], [1, 3, 4], [2, 3, 4]]
        print(c.combine(4, 3));
    }
    
}
