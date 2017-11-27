//
//  SortColorsTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 27/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Test cases for [SortColors](./LeetCode/SortColors.swift).
//

import XCTest
@testable import LeetCode

class SortColorsTests: XCTestCase {
    
    func testSortColors() {
        let sc = SortColors()
        
        // Expected: []
        // sc.sortColors([])
        
        // Expected: [0]
        // sc.sortColors([0])
        
        // Expected: [0, 1, 2]
        // sc.sortColors([2, 1, 0])
        
        // Expected: [0, 0, 0, 1, 1, 1, 1, 1, 2]
        // sc.sortColors([0, 1, 0, 1, 1, 1, 2, 0, 1])
        
        // Expected: [0, 0, 1, 1, 2]
        // sc.sortColors([0, 1, 2, 0, 1])
        
        // Expected: [0, 0, 1, 1, 2, 2, 2, 2, 2]
        // sc.sortColors([2, 2, 2, 2, 1, 0, 2, 0, 1])
        
        // Expected: [0, 0, 1, 1, 1, 2, 2, 2]
        // sc.sortColors([0, 0, 1, 1, 1, 2, 2, 2])
        
        // Expected: [0, 0, 0, 1, 1, 1, 2, 2, 2]
        // sc.sortColors([0, 0, 0, 2, 2, 2, 1, 1, 1])
    }
    
}
