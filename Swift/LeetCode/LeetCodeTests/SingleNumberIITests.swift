//
//  SingleNumberIITests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 20/02/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Test cases for [SingleNumberII](./LeetCode/SingleNumberII.swift).
//

import XCTest
@testable import LeetCode

class SingleNumberIITests: XCTestCase {
    
    func testSingleNumber() {
        let s = SingleNumberII()
        
        XCTAssertTrue(s.singleNumber([1]) == 1)
        
        XCTAssertTrue(s.singleNumber([1, 1, 1]) == 0)
        
        XCTAssertTrue(s.singleNumber([1, 1, 1, 2]) == 2)
        
        XCTAssertTrue(s.singleNumber([1, 1, 1, 2, 2, 2, 3]) == 3)
    }
    
}
