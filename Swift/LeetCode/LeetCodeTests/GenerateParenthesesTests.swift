//
//  GenerateParenthesesTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 04/12/2017.
//  Copyright © 2017 lizhaotailang. All rights reserved.
//
//  Test cases for [GenerateParentheses](./LeetCode/GenerateParentheses.swift).
//

import XCTest
@testable import LeetCode

class GenerateParenthesesTests: XCTestCase {
    
    func testGenerateParenthesis() {
        let gp = GenerateParentheses()
        
        XCTAssertTrue(gp.generateParenthesis(0).isEmpty)
        
        let array0 = gp.generateParenthesis(1)
        XCTAssertTrue(array0.count == 1)
        XCTAssertTrue(array0[0] == "()")
        
        let array1 = gp.generateParenthesis(2)
        XCTAssertTrue(array1.count == 2)
        XCTAssertTrue(Set<String>.init(array1) == Set<String>.init(arrayLiteral: "()()", "(())"))
        
        let array2 = gp.generateParenthesis(3)
        XCTAssertTrue(array2.count == 5)
        XCTAssertTrue(Set<String>.init(array2) == Set<String>.init(arrayLiteral: "()()()", "()(())", "(()())", "(())()", "((()))"))
        
        let array3 = gp.generateParenthesis(4)
        XCTAssertTrue(array3.count == 14)
        XCTAssertTrue(Set<String>.init(array3) == Set<String>.init(arrayLiteral: "()((()))", "(())(())", "(((())))", "(())()()", "()()(())", "(()())()", "(()(()))", "()()()()", "()(())()", "()(()())", "(()()())", "((()()))", "((()))()", "((())())"))
    }
    
}
