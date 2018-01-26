//
//  AddBinaryTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 26/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Test cases for [AddBinary](./LeetCode/AddBinary.swift).
//

import XCTest
@testable import LeetCode

class AddBinaryTests: XCTestCase {
    
    func testAddBinary() {
        let ab = AddBinary()
        
        XCTAssertTrue(ab.addBinary("0", "0") == "0")
        
        XCTAssertTrue(ab.addBinary("11", "1") == "100")
        
        XCTAssertTrue(ab.addBinary("101", "101") == "1010")
        
        XCTAssertTrue(ab.addBinary("101111", "10") == "110001")
    }
    
}
