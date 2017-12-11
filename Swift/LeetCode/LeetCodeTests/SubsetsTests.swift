//
//  SubsetsTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 11/12/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//
//  Test cases for [Subsets](./LeetCode/Subsets.swift).
//

import XCTest
@testable import LeetCode

class SubsetsTests: XCTestCase {
    
    func testSubsets() {
        let s = Subsets()
        
        // [[]]
        print(s.subsets([]))
        
        // [[], [1]]
        print(s.subsets([1]))
        
        // [[], [1], [2], [1, 2]]
        print(s.subsets([1, 2]))
        
        // [[], [1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3]]
        print(s.subsets([1, 2, 3]))
    }
    
}
