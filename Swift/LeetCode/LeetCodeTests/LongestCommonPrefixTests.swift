//
//  LongestCommonPrefixTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 25/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Test cases for [LongestCommonPrefix](./LeetCode/LongestCommonPrefix.swift).
//

import XCTest
@testable import LeetCode

class LongestCommonPrefixTests: XCTestCase {
    
    func testLongestCommonPrefix() {
        let l = LongestCommonPrefix()
        
        XCTAssertTrue(l.longestCommonPrefix([]).isEmpty)
        
        XCTAssertTrue(l.longestCommonPrefix(["abc"]) == "abc")
        
        XCTAssertTrue(l.longestCommonPrefix(["abcf", "abcd", "abcdefg"]) == "abc")
        
        XCTAssertTrue(l.longestCommonPrefix(["aa", "a"]) == "a")
        
        XCTAssertTrue(l.longestCommonPrefix(["abab","aba",""]).isEmpty)
        
        XCTAssertTrue(l.longestCommonPrefix(["a","b"]).isEmpty)
        
        XCTAssertTrue(l.longestCommonPrefix(["", ""]).isEmpty)
        
        XCTAssertTrue(l.longestCommonPrefix(["c", "c"]) == "c")
        
        XCTAssertTrue(l.longestCommonPrefix(["abc", "bc"]).isEmpty)
        
        XCTAssertTrue(l.longestCommonPrefix(["abc", "a", "c"]).isEmpty)
    }
    
}
