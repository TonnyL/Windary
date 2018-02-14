//
//  PascalsTriangleTests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 15/02/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Test cases for [PascalsTriangle](./LeetCode/PascalsTriangle.swift).
//

import XCTest
@testable import LeetCode

class PascalsTriangleTests: XCTestCase {
    
    func testGenerate() {
        let pt = PascalsTriangle()
        
        var lists = Array<Array<Int>>.init()
        XCTAssertEqual(pt.generate(0), lists)
        
        lists.append([1])
        XCTAssertEqual(pt.generate(1), lists)
        
        lists.append([1, 1])
        XCTAssertEqual(pt.generate(2), lists)
        
        lists.append([1, 2, 1])
        XCTAssertEqual(pt.generate(3), lists)
        
        lists.append([1, 3, 3, 1])
        XCTAssertEqual(pt.generate(4), lists)
        
        lists.append([1, 4, 6, 4, 1])
        XCTAssertEqual(pt.generate(5), lists)
    }
    
}
