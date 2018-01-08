//
//  SubsetsIITests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 08/01/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Test cases for [SubsetsII](./LeetCode/SubsetsII.swift).
//

import XCTest
@testable import LeetCode

class SubsetsIITests: XCTestCase {
    
    func testSubsetsWithDup() {
        let s = SubsetsII()
        
        // Expected: []
        print(s.subsetsWithDup([]))
        
        // Expected: [[1], []]
        print(s.subsetsWithDup([1]))
        
        // Expected: [[], [1], [1, 1]]
        print(s.subsetsWithDup([1, 1]))
        
        // Expected: [[1], [2], [1, 2], []]
        print(s.subsetsWithDup([1, 2]))
        
        // Expected: [[2], [1], [1, 2, 2], [2, 2], [1, 2], []]
        print(s.subsetsWithDup([1, 2, 2]))
        
        // Expected: [[], [1], [1, 4], [1, 4, 4], [1, 4, 4, 4], [1, 4, 4, 4, 4], [4], [4, 4], [4, 4, 4], [4, 4, 4, 4]]
        print(s.subsetsWithDup([4, 4, 4, 1, 4]))
        
    }
    
}
