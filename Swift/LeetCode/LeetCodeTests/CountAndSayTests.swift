//
//  CountAndSayTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 26/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Test cases for [CountAndSay](./LeetCode/CountAndSay.swift).
//  

import XCTest
@testable import LeetCode

class CountAndSayTests: XCTestCase {
    
    func testCountAndSay() {
        let cat = CountAndSay()
        
        XCTAssertTrue(cat.countAndSay(1) == "1")
        
        XCTAssertTrue(cat.countAndSay(2) == "11")
        
        XCTAssertTrue(cat.countAndSay(3) == "21")
        
        XCTAssertTrue(cat.countAndSay(4) == "1211")
        
        XCTAssertTrue(cat.countAndSay(5) == "111221")
        
        XCTAssertTrue(cat.countAndSay(6) == "312211")
    }
    
}
