//
//  ToLowerCaseTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 2018/12/9.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Test cases for [ToLowerCase](./LeetCode/ToLowerCase.swift).
//

import XCTest
@testable import LeetCode

class ToLowerCaseTests: XCTestCase {

    func testToLowerCase() {
        let tlc = ToLowerCase()
        
        XCTAssertEqual(tlc.toLowerCase("Hello"), "hello")
        XCTAssertEqual(tlc.toLowerCase("here"), "here")
        XCTAssertEqual(tlc.toLowerCase("LOVELY"), "lovely")
    }

}
