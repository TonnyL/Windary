//
//  IntegerToRomanTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 20/01/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Test cases for [IntegerToRoman](./LeetCode/IntegerToRoman.swift).
//

import XCTest
@testable import LeetCode

class IntegerToRomanTests: XCTestCase {
    
    func testIntToRoman() {
        let i = IntegerToRoman()
        
        XCTAssertTrue(i.intToRoman(1) == "I")
        
        XCTAssertTrue(i.intToRoman(621) == "DCXXI")
        
        XCTAssertTrue(i.intToRoman(1996) == "MCMXCVI")
        
        XCTAssertTrue(i.intToRoman(999) == "CMXCIX")
    }
    
}
