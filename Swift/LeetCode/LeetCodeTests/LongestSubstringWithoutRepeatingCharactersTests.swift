//
//  LongestSubstringWithoutRepeatingCharactersTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 25/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Test cases for [LongestSubstringWithoutRepeatingCharacters](./LeetCode/LongestSubstringWithoutRepeatingCharacters.swift).
//

import XCTest
@testable import LeetCode

class LongestSubstringWithoutRepeatingCharactersTests: XCTestCase {
    
    func testExample() {
        let l = LongestSubstringWithoutRepeatingCharacters()
        
        XCTAssert(l.lengthOfLongestSubstring("pwwkew") == 3)
        
        XCTAssertTrue(l.lengthOfLongestSubstring("bbbbbb") == 1)
        
        XCTAssertTrue(l.lengthOfLongestSubstring("abcabcbb") == 3)
        
        XCTAssertTrue(l.lengthOfLongestSubstring("dvdf") == 3)
    }
    
}
