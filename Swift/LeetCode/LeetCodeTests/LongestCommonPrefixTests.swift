//
//  LongestCommonPrefixTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 25/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//

import XCTest
@testable import LeetCode

class LongestCommonPrefixTests: XCTestCase {
    
    func testLongestCommonPrefix() {
        let l = LongestCommonPrefix()
        
//        XCTAssertTrue(l.longestCommonPrefix([]) == "")
        print(l.longestCommonPrefix([]))
        
//        XCTAssertTrue(l.longestCommonPrefix(["abc"]) == "abc")
        print(l.longestCommonPrefix(["abc"]))
        
//        XCTAssertTrue(l.longestCommonPrefix(["abcf", "abcd", "abcdefg"]) == "abc")
        print(l.longestCommonPrefix(["abcf", "abcd", "abcdefg"]))
        
//        XCTAssertTrue(l.longestCommonPrefix(["aa", "a"]) == "a")
        print(l.longestCommonPrefix(["aa", "a"]))
        
        print(l.longestCommonPrefix(["abab","aba",""]))
    }
    
}
