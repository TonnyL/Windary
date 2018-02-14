//
//  SingleNumberTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 14/02/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Test cases for [SingleNumber](./LeetCode/SingleNumber.swift).
//

import XCTest
@testable import LeetCode

class SingleNumberTests: XCTestCase {
    
    func testSingleNumber() {
        let sn = SingleNumber()
        
        XCTAssertTrue(sn.singleNumber([1]) == 1)
        
        XCTAssertTrue(sn.singleNumber([1, 1, 2]) == 2)
        
        XCTAssertTrue(sn.singleNumber([1, 1, 2, 2, 3]) == 3)
    }
    
}
