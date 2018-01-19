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
        
        // Expected: []
        print(l.letterCombinations(""))
        
        // Expected: [""]
        print(l.letterCombinations("1"))
        
        // Expected: ["a", "b", "c"]
        print(l.letterCombinations("2"))
        
        // Expected: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]
        print(l.letterCombinations("23"))
        
        // Expected: ["adg", "adh", "adi", "aeg", "aeh", "aei",
        // "afg", "afh", "afi", "bdg", "bdh", "bdi", "beg", "beh",
        // "bei", "bfg", "bfh", "bfi", "cdg", "cdh", "cdi", "ceg",
        // "ceh", "cei", "cfg", "cfh", "cfi"]
        print(l.letterCombinations("234"))
    }

}
