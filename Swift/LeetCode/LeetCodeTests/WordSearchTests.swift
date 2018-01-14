//
//  WordSearchTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 14/01/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Test cases for [WordSearch](./LeetCode/WordSearch.swift).
//

import XCTest
@testable import LeetCode

class WordSearchTests: XCTestCase {
    
    func testExist() {
        let ws = WordSearch()
        
        XCTAssertFalse(ws.exist([[]], "AB"))
        
        let chars = [[Character("A"), Character("B"), Character("C"), Character("E")], [Character("S"), Character("F"), Character("C"), Character("S")], [Character("A"), Character("D"), Character("E"), Character("E")]]
        
        XCTAssertTrue(ws.exist(chars, "ABCCED"))
        
        XCTAssertTrue(ws.exist(chars, "SEE"))
        
        XCTAssertFalse(ws.exist(chars, "ABCB"))
    }
    
}
