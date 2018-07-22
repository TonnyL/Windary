//
//  ReverseBitsTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 2018/7/22.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Test cases for [ReverseBits](./LeetCode/ReverseBits.swift).
//

import XCTest
@testable import LeetCode

class ReverseBitsTests: XCTestCase {

    func testReverseBits() {
        let rb = ReverseBits()
        
        XCTAssertEqual(0, rb.reverseBits(0))
        
        XCTAssertEqual(43261596, rb.reverseBits(964176192))
    }

}
