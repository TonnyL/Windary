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
        
        // Expected: 0
        print(ab.addBinary("0", "0"))
        // Expected: 100
        print(ab.addBinary("11", "1"))
        // Expected: 1010
        print(ab.addBinary("101", "101"))
        // Expected: "110001"
        print(ab.addBinary("101111", "10"))
    }
    
}
