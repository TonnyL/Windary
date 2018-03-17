//
//  MajorityElementTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 17/03/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Test cases for [MajorityElement](./LeetCode/MajorityElement.swift).
//

import XCTest
@testable import LeetCode

class MajorityElementTests: XCTestCase {
    
    func testMajorityElement() {
        let me = MajorityElement()
        
        XCTAssertTrue(me.majorityElement([1, 1, 2]) == 1)
        
        XCTAssertTrue(me.majorityElement([0, 1, 1, 1, 2, 3, 1]) == 1)
        
        XCTAssertTrue(me.majorityElement([1, 1]) == 1)
    }
    
}
