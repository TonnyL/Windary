//
//  ValidParenthesesTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 25/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Test cases for [ValidParentheses](./LeetCode/ValidParentheses.swift).
//

import XCTest
@testable import LeetCode

class ValidParenthesesTests: XCTestCase {
    
    func testIsValid() {
        let vp = ValidParentheses()
        
        XCTAssertTrue(vp.isValid("()"))
        
        XCTAssertTrue(vp.isValid("()[]{}"))
        
        XCTAssertFalse(vp.isValid("("))
        
        XCTAssertFalse(vp.isValid("(]"))
        
        XCTAssertFalse(vp.isValid("([)]"))
    }
    
}
