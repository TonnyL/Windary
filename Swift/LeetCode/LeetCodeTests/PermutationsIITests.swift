//
//  PermutationsIITests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 05/12/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Test cases for [PermutationsII](./LeetCode/PermutationsII.swift).
//

import XCTest
@testable import LeetCode

class PermutationsIITests: XCTestCase {
    
    func testPermuteUnique() {
        let p = PermutationsII()
        
        // Expected: [[]]
        print(p.permuteUnique([]))
        
        // Expected: [[1]]
        print(p.permuteUnique([1]))
        
        // Expected: [[1, 1, 2], [1, 2, 1], [2, 1, 1]]
        print(p.permuteUnique([1, 1, 2]))
    }
    
}
