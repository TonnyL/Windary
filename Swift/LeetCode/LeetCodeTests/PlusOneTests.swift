//
//  PlusOneTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 26/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Test cases for [PlusOne](./LeetCode/PlusOne.swift).
//

import XCTest
@testable import LeetCode

class PlusOneTests: XCTestCase {
    
    func testPlusOne() {
        let po = PlusOne()
        
        // Expected: [2]
        print(po.plusOne([1]))
        // Expected: [1, 0]
        print(po.plusOne([9]))
        // Expected: [1, 0, 0]
        print(po.plusOne([9, 9]))
        // Expected: [2, 9, 0, 0, 0]
        print(po.plusOne([2, 8, 9, 9, 9]))
        // Expected: [2, 8, 9, 0]
        print(po.plusOne([2, 8, 8, 9]))
    }
    
}
