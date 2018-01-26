//
//  LetterCombinationsOfAPhoneNumberTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 19/01/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Test cases for [LetterCombinationsOfAPhoneNumber](./LeetCode/LetterCombinationsOfAPhoneNumber.swift).
//

import XCTest
@testable import LeetCode

class LetterCombinationsOfAPhoneNumberTests: XCTestCase {
    
    func testLetterCombinations() {
        let l = LetterCombinationsOfAPhoneNumber()
        
        XCTAssertTrue(l.letterCombinations("").isEmpty)
        
        XCTAssertTrue(l.letterCombinations("1").isEmpty)
        
        let array1 = l.letterCombinations("2")
        XCTAssertTrue(array1.count == 3)
        XCTAssertTrue(Set<String>.init(array1) == Set<String>.init(arrayLiteral: "a", "b", "c"))
        
        let array2 = l.letterCombinations("23")
        XCTAssertTrue(array2.count == 9)
        XCTAssertTrue(Set<String>.init(array2) == Set<String>.init(arrayLiteral: "ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"))
        
        let array3 = l.letterCombinations("234")
        XCTAssertTrue(array3.count == 27)
        XCTAssertTrue(Set<String>.init(array3) == Set<String>.init(arrayLiteral: "adg", "adh", "adi", "aeg", "aeh", "aei", "afg", "afh", "afi", "bdg", "bdh", "bdi", "beg", "beh", "bei", "bfg", "bfh", "bfi", "cdg", "cdh", "cdi", "ceg", "ceh", "cei", "cfg", "cfh", "cfi"))
    }

}
