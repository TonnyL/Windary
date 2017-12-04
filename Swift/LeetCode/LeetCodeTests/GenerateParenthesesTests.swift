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
        
        // Expected: []
        print(gp.generateParenthesis(0))
        
        // Expected: [()]
        print(gp.generateParenthesis(1))
        
        // Expected: [()(), (())]
        print(gp.generateParenthesis(2))
        
        // Expected: [()()(), ()(()), (()()), (())(), ((()))]
        print(gp.generateParenthesis(3))
        
        // Expected: [()()()(), (()(())), (()())(), ()()(()), (())()(), (((()))), (())(()),
        // ()((())), ()(())(), ()(()()), (()()()), ((()())), ((()))(), ((())())]
        print(gp.generateParenthesis(4))
    }
    
}
