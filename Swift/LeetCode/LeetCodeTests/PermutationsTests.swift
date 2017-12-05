//
//  PermutationsTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 05/12/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Test cases for [Permutations](./LeetCode/Permutations.swift).
//

import XCTest
@testable import LeetCode

class PermutationsTests: XCTestCase {
    
    func testPermute() {
        let p = Permutations()
        
        // Expected: [[]]
        print(p.permute([]))
        
        // Expected: [[1]]
        print(p.permute([1]))
        
        // Expected: [[1, 2], [2, 1]]
        print(p.permute([1, 2]))
        
        // Expected: [[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]]
        print(p.permute([1, 2, 3]))
    }

}
