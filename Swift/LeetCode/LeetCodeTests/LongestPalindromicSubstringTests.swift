//
//  LongestPalindromicSubstringTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 16/12/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Test cases for [LongestPalindromicSubstring](./LeetCode/LongestPalindromicSubstring.swift).
//

import XCTest
@testable import LeetCode

class LongestPalindromicSubstringTests: XCTestCase {
    
    func testLongestPalindrome() {
        let lps = LongestPalindromicSubstring()
        
        XCTAssertTrue(lps.longestPalindrome("babad") == "bab" || lps.longestPalindrome("babad") == "aba")
        
        XCTAssertTrue(lps.longestPalindrome("cbbd") == "bb")
        
        XCTAssertTrue(lps.longestPalindrome("babaddtattarrattatddetartrateedredividerb") == "ddtattarrattatdd")
    }
    
}
