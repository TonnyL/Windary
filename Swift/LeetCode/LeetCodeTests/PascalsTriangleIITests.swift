//
//  PascalsTriangleIITests.swift
//  LeetCodeTests
//
//  Created by 黎赵太郎 on 23/02/2018.
//  Copyright © 2018 lizhaotailang. All rights reserved.
//
//  Test cases for [PascalsTriangleII](./LeetCode/PascalsTriangleII.swift).
//

import XCTest
@testable import LeetCode

class PascalsTriangleIITests: XCTestCase {
    
    func testGetRow() {
        let p = PascalsTriangleII();
        
        XCTAssertEqual(p.getRow(0), [1])
        
        XCTAssertEqual(p.getRow(1), [1, 1])
        
        XCTAssertEqual(p.getRow(2), [1, 2, 1])
        
        XCTAssertEqual(p.getRow(3), [1, 3, 3, 1])
        
        XCTAssertEqual(p.getRow(4), [1, 4, 6, 4, 1])
    }
    
}
