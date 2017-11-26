//
//  LengthOfLastWordTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 26/11/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Test cases for [LengthOfLastWord](./LeetCode/LengthOfLastWord.swift).
//

import XCTest
@testable import LeetCode

class LengthOfLastWordTests: XCTestCase {
    
    func testLengthOfLastWord() {
        let l = LengthOfLastWord()
        
        XCTAssertTrue(l.lengthOfLastWord("Hello World") == 5)
        
        XCTAssertTrue(l.lengthOfLastWord(" ") == 0)
        
        XCTAssertTrue(l.lengthOfLastWord("a") == 1)
        
        XCTAssertTrue(l.lengthOfLastWord("a ") == 1)
    }
    
}
