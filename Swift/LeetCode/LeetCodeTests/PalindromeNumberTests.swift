//
//  PalindromeNumber.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 25/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Test cases for [PalindromeNumber](./LeetCode/PalindromeNumber.swift).
//

import XCTest
@testable import LeetCode

class PalindromeNumberTests: XCTestCase {
    
    func testIsPalindrome() {
        let pn = PalindromeNumber()
        
        XCTAssertFalse(pn.isPalindrome(-1))
        
        XCTAssertTrue(pn.isPalindrome(1))
        
        XCTAssertTrue(pn.isPalindrome(121))
        
        XCTAssertTrue(pn.isPalindrome(1001))
        
        XCTAssertFalse(pn.isPalindrome(1000021))
    }
    
}
